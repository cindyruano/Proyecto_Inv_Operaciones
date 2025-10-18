/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cindy
 */
public class MetodoEsquinaNoreste extends javax.swing.JPanel {

    public MetodoEsquinaNoreste() {
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
        txtDemanda = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Resultados = new javax.swing.JTextArea();
        jLabel18 = new javax.swing.JLabel();
        txtRespuesta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        btnof = new javax.swing.JButton();
        btnFI = new javax.swing.JButton();

        setBackground(new java.awt.Color(230, 230, 230));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTipo.setBackground(new java.awt.Color(230, 230, 230));
        txtTipo.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtTipo.setForeground(new java.awt.Color(33, 48, 71));
        txtTipo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipo.setBorder(null);
        add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 190, 25));

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
        jLabel2.setText("MÉTODO ESQUINA NOROESTE");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 75, -1, 30));

        txtTipo1.setBackground(new java.awt.Color(230, 230, 230));
        txtTipo1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        txtTipo1.setForeground(new java.awt.Color(33, 48, 71));
        txtTipo1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTipo1.setBorder(null);
        txtTipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipo1ActionPerformed(evt);
            }
        });
        add(txtTipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 320, 25));

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

        jLabel17.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(33, 48, 71));
        jLabel17.setText("Demanda:");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, 30));

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

        btnof.setBackground(new java.awt.Color(204, 204, 204));
        btnof.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnof.setForeground(new java.awt.Color(33, 48, 71));
        btnof.setText("Oferta");
        btnof.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnof.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnof.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDFActionPerformed(evt);
            }
        });
        add(btnof, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 130, 30));

        btnFI.setBackground(new java.awt.Color(204, 204, 204));
        btnFI.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        btnFI.setForeground(new java.awt.Color(33, 48, 71));
        btnFI.setText("Demandas ");
        btnFI.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(33, 48, 71), null));
        btnFI.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFIActionPerformed(evt);
            }
        });
        add(btnFI, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 130, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void txtTipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipo1ActionPerformed

    private void txtDemandaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDemandaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDemandaActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
                                              
    DefaultTableModel modelo = (DefaultTableModel) tblDatos.getModel();
    int filas = modelo.getRowCount() - 1; 
    int columnas = modelo.getColumnCount() - 2; 

   
    int[][] costos = new int[filas][columnas];
    for (int i = 0; i < filas; i++) {
        for (int j = 1; j <= columnas; j++) {
            Object val = modelo.getValueAt(i, j);
            costos[i][j - 1] = (val == null || val.toString().isEmpty()) ? 0 : Integer.parseInt(val.toString());
        }
    }

   
    int[] oferta = new int[filas];
    for (int i = 0; i < filas; i++) {
        Object val = modelo.getValueAt(i, modelo.getColumnCount() - 1);
        oferta[i] = (val == null || val.toString().isEmpty()) ? 0 : Integer.parseInt(val.toString());
    }

    
    int[] demanda = new int[columnas];
    for (int j = 1; j <= columnas; j++) {
        Object val = modelo.getValueAt(modelo.getRowCount() - 1, j);
        demanda[j - 1] = (val == null || val.toString().isEmpty()) ? 0 : Integer.parseInt(val.toString());
    }

    // Balancear (si necesario, agregar ficticia)
    int sumaOferta = 0, sumaDemanda = 0;
    for (int x : oferta) sumaOferta += x;
    for (int x : demanda) sumaDemanda += x;

    if (sumaOferta > sumaDemanda) {
        // Agregar demanda ficticia
        columnas++;
        int[][] nuevosCostos = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            System.arraycopy(costos[i], 0, nuevosCostos[i], 0, costos[i].length);
            nuevosCostos[i][columnas - 1] = 0;
        }
        costos = nuevosCostos;

        int[] nuevaDemanda = new int[columnas];
        System.arraycopy(demanda, 0, nuevaDemanda, 0, demanda.length);
        nuevaDemanda[columnas - 1] = sumaOferta - sumaDemanda;
        demanda = nuevaDemanda;
    } else if (sumaDemanda > sumaOferta) {
        // Agregar oferta ficticia
        filas++;
        int[][] nuevosCostos = new int[filas][columnas];
        for (int i = 0; i < filas - 1; i++) {
            System.arraycopy(costos[i], 0, nuevosCostos[i], 0, costos[i].length);
        }
        for (int j = 0; j < columnas; j++) {
            nuevosCostos[filas - 1][j] = 0;
        }
        costos = nuevosCostos;

        int[] nuevaOferta = new int[filas];
        System.arraycopy(oferta, 0, nuevaOferta, 0, oferta.length);
        nuevaOferta[filas - 1] = sumaDemanda - sumaOferta;
        oferta = nuevaOferta;
    }

   // --- Método Esquina Noroeste con detalle de iteraciones ---
    StringBuilder iteraciones = new StringBuilder();
    int[][] asignaciones = new int[filas][columnas];
    int i = 0, j =0;
    i = 0; j = 0;
while (i < filas && j < columnas) {
    int x = Math.min(oferta[i], demanda[j]);
    asignaciones[i][j] = x;

    // Guardar la iteración con costo parcial
    int costoParcial = x * costos[i][j];
    iteraciones.append(String.format("S%d D%d: %d*%d", i+1, j+1, x, costos[i][j]));

    oferta[i] -= x;
    demanda[j] -= x;

    if (oferta[i] == 0 && i < filas) {
        i++;
    } else if (demanda[j] == 0 && j < columnas) {
        j++;
    }
}

// Calcular costo total
int costoTotal = 0;
for (i = 0; i < filas; i++) {
    for (j = 0; j < columnas; j++) {
        costoTotal += asignaciones[i][j] * costos[i][j];
    }
}

StringBuilder solucion = new StringBuilder();
solucion.append(" Solución del Método Esquina Noroeste:\n\n");



for (i = 0; i < filas; i++) {
    for (j = 0; j < columnas; j++) {
        if (asignaciones[i][j] > 0) {
            int cantidad = asignaciones[i][j];
            int costoUnitario = costos[i][j];
            int subtotal = cantidad * costoUnitario;
            costoTotal += subtotal;

            solucion.append(String.format("S%d - D%d: %d × %d = %d%n", 
                    (i + 1), (j + 1), cantidad, costoUnitario, subtotal));
        }
    }
}

solucion.append("\n------------------------\n");
solucion.append(String.format(" Costo total = %d", costoTotal));

Resultados.setText(solucion.toString());

txtRespuesta.setText(String.valueOf(costoTotal));

    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        // Limpiar JTextArea
        Resultados.setText("");
        txtRespuesta.setText("");
        txtDemanda.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDFActionPerformed
        String ofertaTexto = JOptionPane.showInputDialog(this, "Ingrese número de ofertas (suministros):");
    if (ofertaTexto == null || ofertaTexto.trim().isEmpty()) return;

    int numOfertas;
    try {
        numOfertas = Integer.parseInt(ofertaTexto);
        if (numOfertas <= 0) throw new NumberFormatException();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un número válido mayor que 0");
        return;
    }

    // Recuperar número de demandas
    Object demandasObj = tblDatos.getClientProperty("numDemandas");
    if (demandasObj == null) {
        JOptionPane.showMessageDialog(this, "Primero debe ingresar el número de demandas con el botón Demandas.");
        return;
    }
    int numDemandas = (int) demandasObj;

    
    String[] columnas = new String[numDemandas + 2]; 
    columnas[0] = "Suministro";
    for (int i = 1; i <= numDemandas; i++) {
        columnas[i] = "D" + i;
    }
    columnas[columnas.length - 1] = "Oferta";

    
    javax.swing.table.DefaultTableModel modelo = new javax.swing.table.DefaultTableModel(columnas, 0);
    tblDatos.setModel(modelo);

    for (int i = 1; i <= numOfertas; i++) {
        Object[] fila = new Object[columnas.length];
        fila[0] = "Suministro " + i;
        modelo.addRow(fila);
    }


    Object[] filaDemanda = new Object[columnas.length];
    filaDemanda[0] = "Demanda";
    modelo.addRow(filaDemanda);

  
    tblDatos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
    javax.swing.table.TableColumnModel columnModel = tblDatos.getColumnModel();
    for (int i = 0; i < columnModel.getColumnCount(); i++) {
        if (i == 0 || i == columnModel.getColumnCount() - 1) {
            columnModel.getColumn(i).setPreferredWidth(100); // Suministro y Oferta
        } else {
            columnModel.getColumn(i).setPreferredWidth(80);  // Demandas
        }
    }

    JOptionPane.showMessageDialog(this, 
        "Tabla creada con " + numOfertas + " ofertas y " + numDemandas + " demandas.");

        
        
    }//GEN-LAST:event_btnDFActionPerformed

    private void btnFIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFIActionPerformed


    String demandaTexto = txtDemanda.getText().trim();
    if (demandaTexto.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Ingrese un número de demandas");
        return;
    }

    int numDemandas;
    try {
        numDemandas = Integer.parseInt(demandaTexto);
        if (numDemandas <= 0) throw new NumberFormatException();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Ingrese un número válido mayor que 0");
        return;
    }

   
    tblDatos.putClientProperty("numDemandas", numDemandas);

    JOptionPane.showMessageDialog(this, "Ahora ingrese el número de OFERTAS y presione el botón Oferta");

    }//GEN-LAST:event_btnFIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea Resultados;
    private javax.swing.JButton btnCalcular;
    public javax.swing.JButton btnFI;
    public javax.swing.JButton btnLimpiar;
    public javax.swing.JButton btnof;
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
    private javax.swing.JTextField txtDemanda;
    public javax.swing.JTextField txtRespuesta;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtTipo1;
    // End of variables declaration//GEN-END:variables
}
