/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;


import Modelo.modeloAsignacion;
import Modelo.modeloAsignacion.ProblemaAsignacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.WindowListener;

import vista.ModeloAsignacion;


import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author anyi4
 */





public class ControladorAsignacion implements MouseListener {

    private final vista.ModeloAsignacion vista;

    public ControladorAsignacion(vista.ModeloAsignacion vista) {
        this.vista = vista;
        this.vista.btnTablas.addMouseListener(this);
        this.vista.btnCalcular.addMouseListener(this);
        this.vista.btnLimpiar.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object src = e.getSource();

        if (src == vista.btnTablas) {
            crearTabla();
        } else if (src == vista.btnCalcular) {
            calcularAsignacion();
        } else if (src == vista.btnLimpiar) {
            limpiar();
        }
    }

    private void crearTabla() {
        try {
            int n = Integer.parseInt(vista.txtColumnas.getText());
            if (n <= 0) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número mayor a 0");
                return;
            }

            DefaultTableModel modeloTabla = new DefaultTableModel(n, n);
            for (int i = 0; i < n; i++) {
                modeloTabla.setColumnIdentifiers(generarColumnas(n));
            }
            vista.tblDatos.setModel(modeloTabla);
            vista.txtResultados.setText("Se creó una tabla de " + n + "x" + n);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número válido.");
        }
    }

    private String[] generarColumnas(int n) {
        String[] cols = new String[n];
        for (int i = 0; i < n; i++) cols[i] = String.valueOf((char) ('A' + i));
        return cols;
    }

    private void calcularAsignacion() {
        try {
            DefaultTableModel modelo = (DefaultTableModel) vista.tblDatos.getModel();
            int n = modelo.getRowCount();
            double[][] costos = new double[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    Object val = modelo.getValueAt(i, j);
                    costos[i][j] = (val == null || val.toString().isEmpty()) ? 0.0 : Double.parseDouble(val.toString());
                }
            }

            String[] filas = new String[n];
            String[] columnas = generarColumnas(n);
            for (int i = 0; i < n; i++) filas[i] = String.valueOf(i + 1);

            ProblemaAsignacion p = new ProblemaAsignacion(costos, filas, columnas);
            String resultado = modeloAsignacion.resolver(p);

            vista.txtResultados.setText(resultado);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al calcular asignación: " + ex.getMessage());
        }
    }

    private void limpiar() {
        DefaultTableModel modelo = (DefaultTableModel) vista.tblDatos.getModel();
        modelo.setRowCount(0);
        modelo.setColumnCount(0);
        vista.txtResultados.setText("");
        vista.txtColumnas.setText("");
    }

    @Override public void mousePressed(MouseEvent e) {}
    @Override public void mouseReleased(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}
}
