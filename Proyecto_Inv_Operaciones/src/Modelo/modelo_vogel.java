/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yamil
 */
public class modelo_vogel {
       // patrón para extraer el primer entero en una cadena (por ejemplo "5,1" -> 5)
    private final Pattern firstInt = Pattern.compile("-?\\d+");

    /**
     * Extrae el primer entero que aparece en la string cell.
     * Si no hay número devuelve 0.
     */
    private int extractFirstInteger(String cell) {
        if (cell == null) return 0;
        Matcher m = firstInt.matcher(cell);
        if (m.find()) {
            try {
                return Integer.parseInt(m.group());
            } catch (NumberFormatException e) {
                return 0;
            }
        }
        return 0;
    }

    /**
     * Obtiene el "texto base" del costo para dejar en la celda cuando se registra una asignación.
     * Intenta devolver la parte del costo (sin el sufijo de asignación).
     */
    private String baseStringOfCell(String cell) {
        if (cell == null) return "0";
        // Tomamos el primer entero como costo base y lo devolvemos como string
        int val = extractFirstInteger(cell);
        return Integer.toString(val);
    }

    /**
     * Comprueba si aún quedan ofertas o demandas positivas (cuando ambas quedan 0 -> terminar).
     */
    private boolean hayOfertaYDemanda(DefaultTableModel model) {
        int numRows = model.getRowCount();
        int numCols = model.getColumnCount();

        boolean existeOfertaPositiva = false;
        for (int i = 0; i < numRows - 1; i++) {
            int oferta = extractFirstInteger(String.valueOf(model.getValueAt(i, numCols - 1)));
            if (oferta > 0) { existeOfertaPositiva = true; break; }
        }

        boolean existeDemandaPositiva = false;
        for (int j = 1; j < numCols - 1; j++) {
            int demanda = extractFirstInteger(String.valueOf(model.getValueAt(numRows - 1, j)));
            if (demanda > 0) { existeDemandaPositiva = true; break; }
        }

        return existeOfertaPositiva && existeDemandaPositiva;
    }

    /**
     * Método principal que ejecuta VAM sobre el DefaultTableModel.
     *
     * @param model         tabla con costos, última columna = Oferta, última fila = Demanda
     * @param areaResultados JTextArea donde se concatenan las líneas de asignación
     * @param txtRespuesta   JTextField donde se escribe el costo total (formateado)
     * @return mensaje de estado
     */
    public String calcular(DefaultTableModel model, JTextArea areaResultados, JTextField txtRespuesta) {
        int numRows = model.getRowCount();
        int numCols = model.getColumnCount();

        areaResultados.setText("");
        txtRespuesta.setText("");

        if (numRows < 2 || numCols < 3) {
            areaResultados.append("La tabla no tiene el formato esperado (pocas filas/columnas).\n");
            return "Error: tabla inválida";
        }

        // detectar columna "DF" (si está)
        boolean tieneDF = false;
        int indiceDF = -1;
        for (int c = 0; c < numCols; c++) {
            Object colName = model.getColumnName(c);
            if (colName != null && "DF".equals(colName.toString())) {
                tieneDF = true;
                indiceDF = c;
                break;
            }
        }

        int contadorAsignaciones = 0;
        int sumaTotal = 0;

        // Bucle principal: mientras existan ofertas y demandas positivas
        while (hayOfertaYDemanda(model)) {

            // --- 1) calcular penalizaciones por filas ---
            int bestRow = -1;
            int bestRowPenalty = Integer.MIN_VALUE; // queremos el max
            int bestRowMinCost = Integer.MAX_VALUE; // usado para desempate si queremos

            for (int i = 0; i < numRows - 1; i++) {
                int oferta = extractFirstInteger(String.valueOf(model.getValueAt(i, numCols - 1)));
                if (oferta <= 0) continue; // fila sin oferta disponible -> ignorar

                // recoger costos disponibles en esa fila (columnas con demanda > 0 y no DF)
                ArrayList<Integer> costos = new ArrayList<>();
                for (int j = 1; j < numCols - 1; j++) {
                    if (tieneDF && j == indiceDF) continue;
                    int demanda = extractFirstInteger(String.valueOf(model.getValueAt(numRows - 1, j)));
                    if (demanda <= 0) continue;
                    String cell = String.valueOf(model.getValueAt(i, j));
                    int cost = extractFirstInteger(cell);
                    // si la celda está vacía, la interpretamos como "infinito"? -> ignoramos (o tratamos como 0)
                    // preferimos ignorar celdas sin número útil:
                    costos.add(cost);
                }
                if (costos.isEmpty()) continue;
                Collections.sort(costos);
                int smallest = costos.get(0);
                int second = (costos.size() >= 2) ? costos.get(1) : smallest; // si solo hay 1, diferencia 0
                int penalty = second - smallest;
                // elegimos la fila con la mayor penalización (si empate, la que tenga mayor smallest)
                if (penalty > bestRowPenalty || (penalty == bestRowPenalty && smallest > bestRowMinCost)) {
                    bestRowPenalty = penalty;
                    bestRow = i;
                    bestRowMinCost = smallest;
                }
            }

            // --- 2) calcular penalizaciones por columnas ---
            int bestCol = -1;
            int bestColPenalty = Integer.MIN_VALUE;
            int bestColMinCost = Integer.MAX_VALUE;

            for (int j = 1; j < numCols - 1; j++) {
                if (tieneDF && j == indiceDF) continue;
                int demanda = extractFirstInteger(String.valueOf(model.getValueAt(numRows - 1, j)));
                if (demanda <= 0) continue; // columna sin demanda disponible
                ArrayList<Integer> costos = new ArrayList<>();
                for (int i = 0; i < numRows - 1; i++) {
                    int oferta = extractFirstInteger(String.valueOf(model.getValueAt(i, numCols - 1)));
                    if (oferta <= 0) continue;
                    String cell = String.valueOf(model.getValueAt(i, j));
                    int cost = extractFirstInteger(cell);
                    costos.add(cost);
                }
                if (costos.isEmpty()) continue;
                Collections.sort(costos);
                int smallest = costos.get(0);
                int second = (costos.size() >= 2) ? costos.get(1) : smallest;
                int penalty = second - smallest;
                if (penalty > bestColPenalty || (penalty == bestColPenalty && smallest > bestColMinCost)) {
                    bestColPenalty = penalty;
                    bestCol = j;
                    bestColMinCost = smallest;
                }
            }

            // --- 3) seleccionar la mayor penalización entre filas y columnas ---
            boolean seleccionarFila = false;
            if (bestRow == -1 && bestCol == -1) {
                // no hay mas asignables
                break;
            } else if (bestRow == -1) {
                seleccionarFila = false;
            } else if (bestCol == -1) {
                seleccionarFila = true;
            } else {
                // comparar penalizaciones (si empate seleccionamos fila por consistencia)
                if (bestRowPenalty > bestColPenalty) seleccionarFila = true;
                else if (bestRowPenalty < bestColPenalty) seleccionarFila = false;
                else {
                    // empate: podemos desempatar por el costo mínimo asociado (escogemos la opción con menor costo mínimo)
                    if (bestRowMinCost <= bestColMinCost) seleccionarFila = true;
                    else seleccionarFila = false;
                }
            }

            // --- 4) realizar la asignación según el resultado ---
            if (seleccionarFila) {
                int i = bestRow;
                // elegir columna con costo mínimo en esa fila (entre columnas con demanda>0)
                int mejorCol = -1;
                int menorCost = Integer.MAX_VALUE;
                for (int j = 1; j < numCols - 1; j++) {
                    if (tieneDF && j == indiceDF) continue;
                    int demanda = extractFirstInteger(String.valueOf(model.getValueAt(numRows - 1, j)));
                    if (demanda <= 0) continue;
                    int cost = extractFirstInteger(String.valueOf(model.getValueAt(i, j)));
                    if (cost < menorCost) {
                        menorCost = cost;
                        mejorCol = j;
                    }
                }
                if (mejorCol == -1) { break; } // no hay columna válida (safety)
                int oferta = extractFirstInteger(String.valueOf(model.getValueAt(i, numCols - 1)));
                int demanda = extractFirstInteger(String.valueOf(model.getValueAt(numRows - 1, mejorCol)));
                int asignacion = Math.min(oferta, demanda);

                // actualizar oferta y demanda en la tabla
                model.setValueAt(oferta - asignacion, i, numCols - 1);
                model.setValueAt(demanda - asignacion, numRows - 1, mejorCol);

                // marcar la celda con un sufijo de asignación para rastrear (ej: "5,1")
                contadorAsignaciones++;
                String base = baseStringOfCell(String.valueOf(model.getValueAt(i, mejorCol)));
                model.setValueAt(base + "," + contadorAsignaciones, i, mejorCol);

                // escribir en areaResultados y acumulado
                int resultado = menorCost * asignacion;
                sumaTotal += resultado;
                areaResultados.append("S" + (i + 1) + " - D" + (mejorCol) + " -> " + menorCost + " * " + asignacion + " = " + resultado + "\n");

            } else {
                // seleccionar columna
                int j = bestCol;
                // elegir fila con costo mínimo en esa columna
                int mejorFila = -1;
                int menorCost = Integer.MAX_VALUE;
                for (int i = 0; i < numRows - 1; i++) {
                    int oferta = extractFirstInteger(String.valueOf(model.getValueAt(i, numCols - 1)));
                    if (oferta <= 0) continue;
                    int cost = extractFirstInteger(String.valueOf(model.getValueAt(i, j)));
                    if (cost < menorCost) {
                        menorCost = cost;
                        mejorFila = i;
                    }
                }
                if (mejorFila == -1) { break; } // safety
                int oferta = extractFirstInteger(String.valueOf(model.getValueAt(mejorFila, numCols - 1)));
                int demanda = extractFirstInteger(String.valueOf(model.getValueAt(numRows - 1, j)));
                int asignacion = Math.min(oferta, demanda);

                model.setValueAt(oferta - asignacion, mejorFila, numCols - 1);
                model.setValueAt(demanda - asignacion, numRows - 1, j);

                contadorAsignaciones++;
                String base = baseStringOfCell(String.valueOf(model.getValueAt(mejorFila, j)));
                model.setValueAt(base + "," + contadorAsignaciones, mejorFila, j);

                int resultado = menorCost * asignacion;
                sumaTotal += resultado;
                areaResultados.append("S" + (mejorFila + 1) + " - D" + (j) + " -> " + menorCost + " * " + asignacion + " = " + resultado + "\n");
            }

        } // fin while

        // --- formatear la suma total y colocar en txtRespuesta ---
        DecimalFormatSymbols simbolos = new DecimalFormatSymbols();
        simbolos.setGroupingSeparator(','); // coma como separador de miles
        DecimalFormat formato = new DecimalFormat("#,###", simbolos);
        txtRespuesta.setText("Q " + formato.format(sumaTotal));

        return "Método Aproximación Vogel terminado.";
    }

    public void calcularVogel(double[][] costos, double[] oferta, double[] demanda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Object[][] getTablaResultado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double getCostoTotal() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    







}
    

