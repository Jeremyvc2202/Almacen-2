/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import java.awt.Color;

/**
 *
 * @author SENATI
 */
public class Productos extends javax.swing.JInternalFrame {

    /**
     * Creates new form Productos
     */
    public Productos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtbuscarnombre = new javax.swing.JTextField();
        btnbuscar3 = new javax.swing.JButton();
        btnregistrar3 = new javax.swing.JButton();
        btneditar3 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablalistado3 = new javax.swing.JTable();
        btndesactivar3 = new javax.swing.JButton();
        btnactivar3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtnombrePro = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtdescripcionpro = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        txtcodigopro = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtcantidadpro = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtpreciopro = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/productos1.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/ima.png"))); // NOI18N
        jLabel7.setText(" Nombre de Productos");

        txtbuscarnombre.setForeground(new java.awt.Color(153, 153, 153));
        txtbuscarnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbuscarnombre.setText("Buscar...");
        txtbuscarnombre.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        txtbuscarnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbuscarnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbuscarnombreFocusLost(evt);
            }
        });
        txtbuscarnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarnombreActionPerformed(evt);
            }
        });

        btnbuscar3.setBackground(new java.awt.Color(204, 204, 255));
        btnbuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/lupa.png"))); // NOI18N
        btnbuscar3.setText("Buscar Producto");
        btnbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar3ActionPerformed(evt);
            }
        });

        btnregistrar3.setBackground(new java.awt.Color(204, 204, 255));
        btnregistrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/registro.png"))); // NOI18N
        btnregistrar3.setText("Registrar Producto");
        btnregistrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btneditar3.setBackground(new java.awt.Color(204, 204, 255));
        btneditar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/editar.png"))); // NOI18N
        btneditar3.setText("Editar Producto");
        btneditar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jScrollPane4.setBackground(new java.awt.Color(204, 255, 255));
        jScrollPane4.setBorder(null);
        jScrollPane4.setForeground(new java.awt.Color(0, 102, 102));

        tablalistado3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane4.setViewportView(tablalistado3);

        btndesactivar3.setBackground(new java.awt.Color(255, 153, 153));
        btndesactivar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/x.png"))); // NOI18N
        btndesactivar3.setText("Desactivar Producto");
        btndesactivar3.setBorder(null);
        btndesactivar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnactivar3.setBackground(new java.awt.Color(153, 255, 153));
        btnactivar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/check.png"))); // NOI18N
        btnactivar3.setText("Activar Producto");
        btnactivar3.setBorder(null);
        btnactivar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel8.setText("Total de Registro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnbuscar3)
                                .addGap(18, 18, 18)
                                .addComponent(btnregistrar3)
                                .addGap(18, 18, 18)
                                .addComponent(btneditar3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(btndesactivar3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnactivar3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(102, 102, 102)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtbuscarnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar3)
                    .addComponent(btnregistrar3)
                    .addComponent(btneditar3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnactivar3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndesactivar3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Listado de productos", jPanel1);

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz", "Azucar", "Aceite", "Fideos", "Menestra", "Leche ", "Huevos", "Atun", "Filete", "Detergente", "Jabon", "Pasta Dental", "Legia", "Dulces" }));
        jComboBox1.setBorder(null);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/categoria_1.png"))); // NOI18N
        jLabel9.setText(" Nombre de Categorias");
        jLabel9.setToolTipText("Nombre de Categorias");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/nombreproducto.png"))); // NOI18N
        jLabel10.setText(" Nombre Producto");

        txtnombrePro.setForeground(new java.awt.Color(153, 153, 153));
        txtnombrePro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnombrePro.setText("Ingresa Nombre del Producto");
        txtnombrePro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombrePro.setSelectionColor(new java.awt.Color(51, 153, 255));
        txtnombrePro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreProFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreProFocusLost(evt);
            }
        });
        txtnombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreProActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/descripcion.png"))); // NOI18N
        jLabel11.setText(" Descripción del Producto");

        txtdescripcionpro.setColumns(20);
        txtdescripcionpro.setForeground(new java.awt.Color(153, 153, 153));
        txtdescripcionpro.setRows(5);
        txtdescripcionpro.setText("Descripción del porducto");
        txtdescripcionpro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtdescripcionpro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdescripcionproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdescripcionproFocusLost(evt);
            }
        });
        jScrollPane5.setViewportView(txtdescripcionpro);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/marca.png"))); // NOI18N
        jLabel12.setText(" Marca del Producto");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alejandrina", "Bell's", "Clorox", "Colgate", "Cubana", "Gloria", "La Calera", "Opal", "Primor", "Real", "Rose", "Vega" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/codigo.png"))); // NOI18N
        jLabel13.setText(" Codigo del Producto");

        txtcodigopro.setForeground(new java.awt.Color(153, 153, 153));
        txtcodigopro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcodigopro.setText("Codigo del Producto");
        txtcodigopro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtcodigopro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcodigoproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcodigoproFocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/cantidad.png"))); // NOI18N
        jLabel14.setText(" Cantidad de Productos");

        txtcantidadpro.setForeground(new java.awt.Color(153, 153, 153));
        txtcantidadpro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcantidadpro.setText("Cantidad total de Productos");
        txtcantidadpro.setToolTipText("");
        txtcantidadpro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtcantidadproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtcantidadproFocusLost(evt);
            }
        });
        txtcantidadpro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcantidadproActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/guardar.png"))); // NOI18N
        jButton1.setText(" Guardar");

        jButton2.setBackground(new java.awt.Color(153, 255, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/cancel_1.png"))); // NOI18N
        jButton2.setText(" Cancelar");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/fecha.png"))); // NOI18N
        jLabel15.setText(" Fecha de vencimiento");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/precio.png"))); // NOI18N
        jLabel16.setText(" Precio de Compra");

        txtpreciopro.setForeground(new java.awt.Color(153, 153, 153));
        txtpreciopro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtpreciopro.setText("Precio de compra");
        txtpreciopro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtprecioproFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtprecioproFocusLost(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/condicion.png"))); // NOI18N
        jLabel17.setText(" Condición");

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 204));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setText("Activo");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 204));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setText("Inactivo");

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(53, 53, 53)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtnombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtcantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtcodigopro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel15))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtpreciopro, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addComponent(jRadioButton1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jRadioButton2))
                                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))))
                .addGap(69, 76, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel13)
                    .addComponent(txtcodigopro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtnombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtcantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtpreciopro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel17)
                        .addComponent(jRadioButton1)
                        .addComponent(jRadioButton2)))
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        jTabbedPane1.addTab("Formulario de Productos", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarnombreActionPerformed

    private void btnbuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscar3ActionPerformed

    private void txtcantidadproActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcantidadproActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcantidadproActionPerformed

    private void txtnombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreProActionPerformed

    private void txtbuscarnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbuscarnombreFocusGained
        if(txtbuscarnombre.getText().equals("Buscar...")){
           txtbuscarnombre.setText("");
           txtbuscarnombre.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtbuscarnombreFocusGained

    private void txtnombreProFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreProFocusGained
        if(txtnombrePro.getText().equals("Ingresa Nombre del Producto")){
           txtnombrePro.setText("");
           txtnombrePro.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtnombreProFocusGained

    private void txtdescripcionproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionproFocusGained
        if(txtdescripcionpro.getText().equals("Descripción del porducto")){
           txtdescripcionpro.setText("");
           txtdescripcionpro.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtdescripcionproFocusGained

    private void txtcodigoproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigoproFocusGained
        if(txtcodigopro.getText().equals("Codigo del Producto")){
           txtcodigopro.setText("");
           txtcodigopro.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtcodigoproFocusGained

    private void txtcantidadproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantidadproFocusGained
        if(txtcantidadpro.getText().equals("Cantidad total de Productos")){
           txtcantidadpro.setText("");
           txtcantidadpro.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtcantidadproFocusGained

    private void txtprecioproFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecioproFocusGained
        if(txtpreciopro.getText().equals("Precio de compra")){
           txtpreciopro.setText("");
           txtpreciopro.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtprecioproFocusGained

    private void txtbuscarnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbuscarnombreFocusLost
        if(txtbuscarnombre.getText().equals("")){
           txtbuscarnombre.setText("Buscar...");
           txtbuscarnombre.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtbuscarnombreFocusLost

    private void txtnombreProFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreProFocusLost
        if(txtnombrePro.getText().equals("")){
           txtnombrePro.setText("Ingresa Nombre del Producto");
           txtnombrePro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnombreProFocusLost

    private void txtdescripcionproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionproFocusLost
         if(txtdescripcionpro.getText().equals("")){
           txtdescripcionpro.setText("Descripción del porducto");
           txtdescripcionpro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtdescripcionproFocusLost

    private void txtcodigoproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcodigoproFocusLost
        if(txtcodigopro.getText().equals("")){
           txtcodigopro.setText("Codigo del Producto");
           txtcodigopro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtcodigoproFocusLost

    private void txtcantidadproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtcantidadproFocusLost
        if(txtcantidadpro.getText().equals("")){
           txtcantidadpro.setText("Cantidad total de Productos");
           txtcantidadpro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtcantidadproFocusLost

    private void txtprecioproFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtprecioproFocusLost
        if(txtpreciopro.getText().equals("")){
           txtpreciopro.setText("Precio de compra");
           txtpreciopro.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtprecioproFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactivar3;
    private javax.swing.JButton btnbuscar3;
    private javax.swing.JButton btndesactivar3;
    private javax.swing.JButton btneditar3;
    private javax.swing.JButton btnregistrar3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tablalistado3;
    private javax.swing.JTextField txtbuscarnombre;
    private javax.swing.JTextField txtcantidadpro;
    private javax.swing.JTextField txtcodigopro;
    private javax.swing.JTextArea txtdescripcionpro;
    private javax.swing.JTextField txtnombrePro;
    private javax.swing.JTextField txtpreciopro;
    // End of variables declaration//GEN-END:variables
}
