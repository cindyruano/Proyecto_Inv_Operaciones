/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cindy
 */


public class MetodoAproVogel extends javax.swing.JPanel {

    public MetodoAproVogel() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTipo = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        txtTipo1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtDemanda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnCalcular = new javax.swing.JButton();
        btnFI = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipo.setBackground(new java.awt.Color(230, 230, 230));
        txtTipo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(33, 48, 71));
        txtTipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipo.setBorder(null);
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 190, 25));

        jSeparator1.setBackground(new java.awt.Color(33, 48, 71));
        jSeparator1.setForeground(new java.awt.Color(33, 48, 71));
        jSeparator1.setOpaque(true);
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 980, 2));

        jSeparator2.setBackground(new java.awt.Color(33, 48, 71));
        jSeparator2.setForeground(new java.awt.Color(33, 48, 71));
        jSeparator2.setOpaque(true);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 663, 980, 2));

        jSeparator3.setBackground(new java.awt.Color(33, 48, 71));
        jSeparator3.setForeground(new java.awt.Color(33, 48, 71));
        jSeparator3.setOpaque(true);
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(942, -7, 2, 700));

        jLabel3.setBackground(new java.awt.Color(230, 230, 230));
        jLabel3.setOpaque(true);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 650, 150, 40));

        jLabel5.setBackground(new java.awt.Color(230, 230, 230));
        jLabel5.setOpaque(true);
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 520, 30, 160));

        jLabel6.setBackground(new java.awt.Color(230, 230, 230));
        jLabel6.setOpaque(true);
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(788, 520, 30, 160));

        jLabel7.setBackground(new java.awt.Color(230, 230, 230));
        jLabel7.setOpaque(true);
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 485, 150, 40));

        jTextPane1.setBackground(new java.awt.Color(230, 230, 230));
        jTextPane1.setText("⠐⣪⡑⣤⣶⣶⣶⣦⡔⣩⡒⠀ ⢸⣯⣾⣿⢏⣿⣏⢿⣿⣮⣿⠀ ⢸⣿⢸⡗⣶⠙⢱⡖⣿⢸⣿⠀ ⢸⡿⠀⠳⣄⣐⣂⡴⠃⠸⣿⠀ ⣾⠃⠀⡵⡔⠕⠕⡰⡅⠀⢻⡆ ⢹⡆⠘⢴⠙⠑⠉⢳⡱⠀⣾⠁ ⠊⠀⠀⠈⡖⡖⡖⡎⠀⠀⠈⠂ ⠀⠀⠀⠀⠉⠁⠉⠁⠀⠀⠀⠀");
        jTextPane1.setToolTipText("");
        jScrollPane2.setViewportView(jTextPane1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 520, 130, 140));

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(33, 48, 71));
        jLabel2.setText("MÉTODO APROXIMACIÓN VOGEL ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, 25));

        txtTipo1.setBackground(new java.awt.Color(230, 230, 230));
        txtTipo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtTipo1.setForeground(new java.awt.Color(33, 48, 71));
        txtTipo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipo1.setBorder(null);
        add(txtTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 290, 25));

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 48, 71));
        jLabel17.setText("Demanda:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 30));

        txtDemanda.setBackground(new java.awt.Color(204, 204, 204));
        txtDemanda.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtDemanda.setForeground(new java.awt.Color(33, 48, 71));
        txtDemanda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDemanda.setBorder(null);
        txtDemanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDemandaActionPerformed(evt);
            }
        });
        add(txtDemanda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 155, 100, 25));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(33, 48, 71));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Resultados");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 100, -1));

        Resultados.setColumns(20);
        Resultados.setFont(new java.awt.Font("Calibri", 0, 16)); // NOI18N
        Resultados.setRows(5);
        jScrollPane3.setViewportView(Resultados);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 340, 210));

        jLabel18.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(33, 48, 71));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel18.setText("RESPUESTA");
        add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 410, 140, 20));

        txtRespuesta.setBackground(new java.awt.Color(204, 204, 204));
        txtRespuesta.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        txtRespuesta.setForeground(new java.awt.Color(33, 48, 71));
        txtRespuesta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtRespuesta.setBorder(null);
        txtRespuesta.setVerifyInputWhenFocusTarget(false);
        add(txtRespuesta, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, 130, 25));

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(33, 48, 71));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnLimpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, 100, 30));

        tblDatos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        tblDatos.setForeground(new java.awt.Color(33, 48, 71));
        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                ""
            }
        ));
        jScrollPane1.setViewportView(tblDatos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 710, 170));

        btnCalcular.setBackground(new java.awt.Color(204, 204, 204));
        btnCalcular.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(33, 48, 71));
        btnCalcular.setText("CALCULAR");
        btnCalcular.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });
        add(btnCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, 100, 30));

        btnFI.setBackground(new java.awt.Color(204, 204, 204));
        btnFI.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnFI.setText("Suministros");
        btnFI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIActionPerformed(evt);
            }
        });
        add(btnFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 160, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDemandaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

                                        // Limpiar JTable
    DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
    model.setRowCount(0);  

// Limpiar JTextFields 
    Resultados.setText("");
    txtRespuesta.setText("");
    txtDemanda.setText("");
 
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
   try {

    JTable tblDatos = this.tblDatos;            
    javax.swing.JTextArea txtResultadosArea = this.Resultados; 
    javax.swing.JTextField txtCostoTotal = this.txtRespuesta; 

    DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
    int rows = model.getRowCount();
    int cols = model.getColumnCount();

    if (cols < 3) {
        JOptionPane.showMessageDialog(this, "La tabla parece tener pocas columnas. Debe tener: [Nombre] [D1..Dn] [Oferta].");
        return;
    }

    // Detectar si la última fila es la fila "Demanda"
    boolean hasDemandRow = false;
    Object lastRowFirstColObj = model.getValueAt(rows - 1, 0);
    if (lastRowFirstColObj != null) {
        String s = lastRowFirstColObj.toString().toLowerCase(Locale.ROOT);
        if (s.contains("demanda") || s.contains("deman")) hasDemandRow = true;
    }

    if (!hasDemandRow) {
        JOptionPane.showMessageDialog(this, "No se encontró la fila 'Demanda'. Asegúrate de que la última fila tenga la etiqueta 'Demanda' en la primera columna.");
        return;
    }

    int m = rows - 1;           // número de suministros 
    int n = cols - 2;           // número de demandas (columnas)
    if (m <= 0 || n <= 0) {
        JOptionPane.showMessageDialog(this, "Dimensiones inválidas en la tabla.");
        return;
    }

    // ----- Leer nombres de filas ----- 
    // FORZAMOS S1, S2, S3 ...
    String[] rowNames = new String[m];
    for (int i = 0; i < m; i++) {
        rowNames[i] = "S" + (i + 1);
    }

    // ----- Leer nombres de columnas -----
    String[] colNames = new String[n];
    for (int j = 0; j < n; j++) {
        String hdr = model.getColumnName(j + 1);
        colNames[j] = (hdr == null || hdr.trim().isEmpty()) ? ("D" + (j + 1)) : hdr;
    }

    // ----- Leer la matriz de costos -----
    double[][] costs = new double[m][n];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            Object val = model.getValueAt(i, j + 1);
            String s = (val == null) ? "" : val.toString().trim();
            if (s.isEmpty()) throw new NumberFormatException("Celda vacía en fila " + (i + 1) + ", columna " + (j + 1));
            s = s.replace(",", ".");
            costs[i][j] = Double.parseDouble(s);
        }
    }

    // ----- Leer ofertas (supply) -----
    double[] supply = new double[m];
    for (int i = 0; i < m; i++) {
        Object val = model.getValueAt(i, cols - 1);
        String s = (val == null) ? "" : val.toString().trim();
        if (s.isEmpty()) throw new NumberFormatException("Oferta (fila " + (i + 1) + ") vacía.");
        s = s.replace(",", ".");
        supply[i] = Double.parseDouble(s);
    }

    // ----- Leer demandas (demand) desde la última fila -----
    double[] demand = new double[n];
    for (int j = 0; j < n; j++) {
        Object val = model.getValueAt(rows - 1, j + 1);
        String s = (val == null) ? "" : val.toString().trim();
        if (s.isEmpty()) throw new NumberFormatException("Demanda en columna " + (j + 1) + " vacía.");
        s = s.replace(",", ".");
        demand[j] = Double.parseDouble(s);
    }

    // ----- Balanceo automático: agregar fila o columna dummy si no cuadra oferta y demanda -----
    double totalSupply = 0;
    double totalDemand = 0;
    for (double x : supply) totalSupply += x;
    for (double x : demand) totalDemand += x;

    boolean addedDummyRow = false, addedDummyCol = false;

    if (Math.abs(totalSupply - totalDemand) > 1e-8) {
        if (totalSupply > totalDemand) {
            // --- Caso: la oferta > demanda -> agregar columna dummy ---
            int newN = n + 1;
            double[][] newCosts = new double[m][newN];
            for (int i = 0; i < m; i++) {
                System.arraycopy(costs[i], 0, newCosts[i], 0, n);
                newCosts[i][n] = 0.0; // costo 0 para columna dummy
            }
            double[] newDemand = new double[newN];
            System.arraycopy(demand, 0, newDemand, 0, n);
            newDemand[n] = totalSupply - totalDemand; // cantidad faltante
            costs = newCosts;
            demand = newDemand;
            colNames = Arrays.copyOf(colNames, newN);
            colNames[newN - 1] = "Demanda_nueva";
            n = newN;
            addedDummyCol = true;
        } else {
            // --- agregar fila
            int newM = m + 1;
            double[][] newCosts = new double[newM][n];
            for (int i = 0; i < m; i++) System.arraycopy(costs[i], 0, newCosts[i], 0, n);
            for (int j = 0; j < n; j++) newCosts[m][j] = 0.0; // costo 0 para fila dummy
            double[] newSupply = new double[newM];
            System.arraycopy(supply, 0, newSupply, 0, m);
            newSupply[m] = totalDemand - totalSupply; // cantidad faltante
            costs = newCosts;
            supply = newSupply;
            rowNames = Arrays.copyOf(rowNames, newM);
            rowNames[newM - 1] = "DF";
            m = newM;
            addedDummyRow = true;
        }
    }

    // 
    double[][] allocation = new double[m][n];
    boolean[] rowDone = new boolean[m];
    boolean[] colDone = new boolean[n];

    double totalCost = 0.0;
    int remainingRows = m;
    int remainingCols = n;
    final double EPS = 1e-8;

    while (remainingRows > 0 && remainingCols > 0) {
        // --- calcular penalizaciones filas ---
        double[] rowPenalty = new double[m];
        Arrays.fill(rowPenalty, -1.0);
        for (int i = 0; i < m; i++) {
            if (rowDone[i]) continue;
            double min1 = Double.POSITIVE_INFINITY, min2 = Double.POSITIVE_INFINITY;
            for (int j = 0; j < n; j++) {
                if (colDone[j]) continue;
                double c = costs[i][j];
                if (c < min1) { min2 = min1; min1 = c; }
                else if (c < min2) { min2 = c; }
            }
            if (min1 == Double.POSITIVE_INFINITY) rowPenalty[i] = -1;
            else if (min2 == Double.POSITIVE_INFINITY) rowPenalty[i] = min1;
            else rowPenalty[i] = min2 - min1;
        }

        // --- calcular penalizaciones columnas ---
        double[] colPenalty = new double[n];
        Arrays.fill(colPenalty, -1.0);
        for (int j = 0; j < n; j++) {
            if (colDone[j]) continue;
            double min1 = Double.POSITIVE_INFINITY, min2 = Double.POSITIVE_INFINITY;
            for (int i = 0; i < m; i++) {
                if (rowDone[i]) continue;
                double c = costs[i][j];
                if (c < min1) { min2 = min1; min1 = c; }
                else if (c < min2) { min2 = c; }
            }
            if (min1 == Double.POSITIVE_INFINITY) colPenalty[j] = -1;
            else if (min2 == Double.POSITIVE_INFINITY) colPenalty[j] = min1;
            else colPenalty[j] = min2 - min1;
        }

        // --- seleccionar fila o columna con mayor penalización ---
        double bestPenalty = -1;
        boolean chooseRow = true;
        int idx = -1;
        for (int i = 0; i < m; i++) {
            if (rowDone[i]) continue;
            if (rowPenalty[i] > bestPenalty) { bestPenalty = rowPenalty[i]; chooseRow = true; idx = i; }
        }
        for (int j = 0; j < n; j++) {
            if (colDone[j]) continue;
            if (colPenalty[j] > bestPenalty) { bestPenalty = colPenalty[j]; chooseRow = false; idx = j; }
        }
        if (idx == -1) break;

        int selRow = -1, selCol = -1;
        if (chooseRow) {
            selRow = idx;
            double minCost = Double.POSITIVE_INFINITY;
            for (int j = 0; j < n; j++) {
                if (colDone[j]) continue;
                if (costs[selRow][j] < minCost) { minCost = costs[selRow][j]; selCol = j; }
            }
        } else {
            selCol = idx;
            double minCost = Double.POSITIVE_INFINITY;
            for (int i = 0; i < m; i++) {
                if (rowDone[i]) continue;
                if (costs[i][selCol] < minCost) { minCost = costs[i][selCol]; selRow = i; }
            }
        }

        if (selRow == -1 || selCol == -1) break;

        // --- asignar cantidad mínima disponible ---
        double q = Math.min(supply[selRow], demand[selCol]);
        allocation[selRow][selCol] += q;
        totalCost += q * costs[selRow][selCol];
        supply[selRow] -= q;
        demand[selCol] -= q;

        if (Math.abs(supply[selRow]) < EPS && !rowDone[selRow]) { rowDone[selRow] = true; remainingRows--; }
        if (Math.abs(demand[selCol]) < EPS && !colDone[selCol]) { colDone[selCol] = true; remainingCols--; }
    }

    // ----- Construir texto de salida con formato S1 -----
    StringBuilder sb = new StringBuilder();
    sb.append("\n");
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            if (allocation[i][j] > 0.0) {
                sb.append(String.format("%s -> %d * %d = %d\n",
                        rowNames[i],
                        (int) allocation[i][j],
                        (int) costs[i][j],
                        (int) (allocation[i][j] * costs[i][j])
                ));
            }
        }
    }

    if (addedDummyCol || addedDummyRow) {
        sb.append("\n Se balanceó para igualar la oferta y demanda\n");
    }

    if (txtResultadosArea != null) txtResultadosArea.setText(sb.toString());
    if (txtCostoTotal != null) txtCostoTotal.setText(String.format("%d", (int) totalCost));

} catch (NumberFormatException ex) {
    JOptionPane.showMessageDialog(this, "Error al leer valores numéricos: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    JOptionPane.showMessageDialog(this, "Error al calcular Método de Aproximación de Vogel: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}


                                               
  
        
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnFIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIActionPerformed

        
       // --- Verificar número de demandas ---
    String demandaTexto = txtDemanda.getText().trim();
    if (demandaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un número de demandas");
        return;
    }

    int numDemandas;
    try {
        numDemandas = Integer.parseInt(demandaTexto);
        if (numDemandas <= 0) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un número válido mayor que 0");
        return;
    }

    // --- Solicitar número de suministros ---
    String suministrosTexto = JOptionPane.showInputDialog(this, "Ingrese el número de suministros:");
    if (suministrosTexto == null || suministrosTexto.trim().isEmpty()) {
        return; // Cancelado o vacío
    }

    int numSuministros;
    try {
        numSuministros = Integer.parseInt(suministrosTexto);
        if (numSuministros <= 0) {
            throw new NumberFormatException();
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un número válido mayor que 0");
        return;
    }

    // --- Construir nombres de columnas ---
    String[] columnas = new String[numDemandas + 2]; // +2: "Suministro" y "Oferta"
    columnas[0] = "Suministro";
    for (int i = 1; i <= numDemandas; i++) {
        columnas[i] = "D" + i; // Demandas
    }
    columnas[columnas.length - 1] = "Oferta"; // Última columna

    // --- Crear modelo vacío ---
    DefaultTableModel modelo = new DefaultTableModel(columnas, 0);
    tblDatos.setModel(modelo);

    // --- Agregar filas de Suministro ---
    for (int i = 1; i <= numSuministros; i++) {
        Object[] fila = new Object[columnas.length];
        fila[0] = "Suministro " + i;
        modelo.addRow(fila);
    }

    // --- Agregar fila de Demanda ---
    Object[] filaDemanda = new Object[columnas.length];
    filaDemanda[0] = "Demanda";
    modelo.addRow(filaDemanda);

    // --- Ajustar ancho de columnas ---
    tblDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    javax.swing.table.TableColumnModel columnModel = tblDatos.getColumnModel();
    for (int i = 0; i < columnModel.getColumnCount(); i++) {
        if (i == 0 || i == columnModel.getColumnCount() - 1) {
            columnModel.getColumn(i).setPreferredWidth(100); // Suministro y Oferta
        } else {
            columnModel.getColumn(i).setPreferredWidth(80);  // Demandas
        }
    }
        

    }//GEN-LAST:event_btnFIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Resultados;
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFI;
    public javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane jTextPane1;
    public javax.swing.JTable tblDatos;
    public javax.swing.JTextField txtDemanda;
    public javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTipo1;
    // End of variables declaration//GEN-END:variables
}
