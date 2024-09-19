package presentacion;

import datos.ProductoDAO;
import java.awt.Color;
import java.awt.Image;
import javax.swing.DefaultComboBoxModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.table.TableRowSorter;
import negocio.ProductoControl;
import java.awt.event.KeyAdapter; 
import java.awt.event.KeyEvent;   
import javax.swing.JOptionPane;



public class Productos extends javax.swing.JInternalFrame {

    private String rutaOrigen;
    private String rutaDestino;
    private final String DIRECTORIO="src/files/productos/";
    private String imagen="";
    private String imagenAnt;
    
    private final ProductoControl CONTROL;
    
    
    public Productos() {
        initComponents();
        this.CONTROL=new ProductoControl();
        this.listar("");
        this.cargarCategorias();
        
        // Agregar el KeyListener para búsqueda automática
        txtbuscarnombre.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent evt) {
                listar(txtbuscarnombre.getText());
            }
        });
    }
    
    
    
    //metodo CRUD
    private void listar(String texto){
        tablalistado3.setModel(this.CONTROL.listar(texto));
        TableRowSorter orden = new TableRowSorter(tablalistado3.getModel());
        tablalistado3.setRowSorter(orden);
        txttotalProductos.setText("Mostrando "+ this.CONTROL.totalMostrado()+ " de un total de "+this.CONTROL.total()+" Productos");
    }
    

    //metodo para las ventanas emergentes
    private void mensajeError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
    private void mensajeOK(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje,"Exitoso",JOptionPane.INFORMATION_MESSAGE);
    }

    
    //metodo para cargar categorias
    private void cargarCategorias(){
        DefaultComboBoxModel items = this.CONTROL.seleccionar();
        cbocategoria.setModel(items);
    }

    
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
        tablalistadoproductos = new javax.swing.JScrollPane();
        tablalistado3 = new javax.swing.JTable();
        btndesactivarproductos = new javax.swing.JButton();
        btnactivarproductos = new javax.swing.JButton();
        txttotalProductos = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        cbocategoria = new javax.swing.JComboBox<>();
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
        lblimagen = new javax.swing.JLabel();
        btnagregarimagen = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Productos");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/productos1.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

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

        btnbuscar3.setBackground(new java.awt.Color(153, 255, 204));
        btnbuscar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/lupa.png"))); // NOI18N
        btnbuscar3.setText("Buscar Producto");
        btnbuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscar3ActionPerformed(evt);
            }
        });

        btnregistrar3.setBackground(new java.awt.Color(153, 255, 204));
        btnregistrar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/registro.png"))); // NOI18N
        btnregistrar3.setText("Registrar Producto");
        btnregistrar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btneditar3.setBackground(new java.awt.Color(153, 255, 204));
        btneditar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/editar.png"))); // NOI18N
        btneditar3.setText("Editar Producto");
        btneditar3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        tablalistadoproductos.setBackground(new java.awt.Color(204, 255, 255));
        tablalistadoproductos.setBorder(null);
        tablalistadoproductos.setForeground(new java.awt.Color(0, 102, 102));

        tablalistado3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablalistadoproductos.setViewportView(tablalistado3);

        btndesactivarproductos.setBackground(new java.awt.Color(255, 153, 153));
        btndesactivarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/x.png"))); // NOI18N
        btndesactivarproductos.setText("Desactivar Producto");
        btndesactivarproductos.setBorder(null);
        btndesactivarproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btndesactivarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesactivarproductosActionPerformed(evt);
            }
        });

        btnactivarproductos.setBackground(new java.awt.Color(153, 255, 153));
        btnactivarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/check.png"))); // NOI18N
        btnactivarproductos.setText("Activar Producto");
        btnactivarproductos.setBorder(null);
        btnactivarproductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnactivarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivarproductosActionPerformed(evt);
            }
        });

        txttotalProductos.setText("Total de Registro");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
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
                        .addGap(57, 57, 57)
                        .addComponent(btnactivarproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndesactivarproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(txttotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(tablalistadoproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addGap(47, 47, 47)
                .addComponent(tablalistadoproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnactivarproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndesactivarproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txttotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1183, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Listado de productos", jPanel1);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));

        cbocategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arroz", "Azucar", "Aceite", "Fideos", "Menestra", "Leche ", "Huevos", "Atun", "Filete", "Detergente", "Jabon", "Pasta Dental", "Legia", "Dulces" }));
        cbocategoria.setBorder(null);

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

        jRadioButton1.setBackground(new java.awt.Color(204, 204, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton1.setText("Activo");

        jRadioButton2.setBackground(new java.awt.Color(204, 204, 255));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jRadioButton2.setText("Inactivo");

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));

        btnagregarimagen.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnagregarimagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/agregar.png"))); // NOI18N
        btnagregarimagen.setText(" Agregar Imagen");
        btnagregarimagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarimagenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbocategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtcantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcodigopro, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(33, 33, 33)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel17)
                                        .addGap(111, 111, 111)))
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtpreciopro, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnagregarimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(68, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(391, 391, 391))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12))
                                .addGap(406, 406, 406)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap(37, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbocategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(txtpreciopro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addGap(11, 11, 11))
                            .addComponent(txtnombrePro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(btnagregarimagen)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(jRadioButton1)
                                            .addComponent(jRadioButton2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addComponent(jLabel11))
                                            .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGap(7, 7, 7)
                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel12))))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(txtcodigopro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtcantidadpro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(14, 14, 14))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(69, 69, 69))))
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

    private void btnagregarimagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarimagenActionPerformed
        JFileChooser file = new JFileChooser();
        int estado=file.showOpenDialog(this);
        if(estado == JFileChooser.APPROVE_OPTION){
            this.imagen=file.getSelectedFile().getName();
            this.rutaOrigen=file.getSelectedFile().getAbsolutePath();
            this.rutaDestino=this.DIRECTORIO + this.imagen;
            
            ImageIcon im = new ImageIcon(this.rutaOrigen);
            Icon icono = new ImageIcon(im.getImage().getScaledInstance(lblimagen.getWidth(), lblimagen.getHeight(), Image.SCALE_DEFAULT));
            lblimagen.setIcon(icono);
            lblimagen.repaint();
        }
    }//GEN-LAST:event_btnagregarimagenActionPerformed

    private void btnactivarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivarproductosActionPerformed
        if (tablalistado3.getSelectedRowCount() == 1) {
            // Obtenemos el ID del producto seleccionado
            String id_producto = String.valueOf(tablalistado3.getValueAt(tablalistado3.getSelectedRow(), 0));
            String nombreProducto = String.valueOf(tablalistado3.getValueAt(tablalistado3.getSelectedRow(), 1));  // Nombre del producto

            // Confirmamos la activación con el usuario
            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas activar el producto: " + nombreProducto + "?", "Activar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == 0) {
                // Llamamos al método para activar el producto en la base de datos
                String resp = this.CONTROL.activar(Integer.parseInt(id_producto));
                if (resp.equals("OK")) {
                    this.mensajeOK("Producto activado correctamente.");
                    this.listar("");  // Refrescamos la lista de productos en la tabla
                } else {
                    this.mensajeError(resp);  // Mostramos error en caso de fallo
                }
            }
            }else {
        this.mensajeError("Debes seleccionar un producto para activar.");
    }
    }//GEN-LAST:event_btnactivarproductosActionPerformed

    private void btndesactivarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesactivarproductosActionPerformed
        if (tablalistado3.getSelectedRowCount() == 1) {
            String id_producto = String.valueOf(tablalistado3.getValueAt(tablalistado3.getSelectedRow(), 0));
            String nombreProducto = String.valueOf(tablalistado3.getValueAt(tablalistado3.getSelectedRow(), 1));  // Nombre del producto

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Deseas desactivar el producto: " + nombreProducto + "?", "Desactivar", JOptionPane.YES_NO_OPTION);
            if (confirmacion == 0) {
                String resp = this.CONTROL.desactivar(Integer.parseInt(id_producto));
                if (resp.equals("OK")) {
                    this.mensajeOK("Producto desactivado correctamente.");
                    this.listar("");  // Refrescamos la lista de productos en la tabla
                } else {
                    this.mensajeError(resp);  // Mostramos error en caso de fallo
                }
            }
        } else {
            this.mensajeError("Debes seleccionar un producto para desactivar.");
        }
    }//GEN-LAST:event_btndesactivarproductosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactivarproductos;
    private javax.swing.JButton btnagregarimagen;
    private javax.swing.JButton btnbuscar3;
    private javax.swing.JButton btndesactivarproductos;
    private javax.swing.JButton btneditar3;
    private javax.swing.JButton btnregistrar3;
    private javax.swing.JComboBox<String> cbocategoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblimagen;
    private javax.swing.JTable tablalistado3;
    private javax.swing.JScrollPane tablalistadoproductos;
    private javax.swing.JTextField txtbuscarnombre;
    private javax.swing.JTextField txtcantidadpro;
    private javax.swing.JTextField txtcodigopro;
    private javax.swing.JTextArea txtdescripcionpro;
    private javax.swing.JTextField txtnombrePro;
    private javax.swing.JTextField txtpreciopro;
    private javax.swing.JLabel txttotalProductos;
    // End of variables declaration//GEN-END:variables
}
