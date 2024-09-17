/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package presentacion;

import datos.CategoriaDAO;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableRowSorter;
import javax.swing.text.TabableView;
import negocio.CategoriaControl;

/**
 *
 * @author SENATI
 */
public class Categorias extends javax.swing.JInternalFrame {

    
    //invocamos una clase y le damos como propiedad una variables
    private final CategoriaControl CONTROL;
            
    public Categorias() {
        initComponents();
        this.CONTROL= new CategoriaControl();
        this.listar("");
        
       
    }
    
    //metodos CRUD
    private void listar(String texto){
        tablalistado.setModel(this.CONTROL.listar(texto));
        TableRowSorter orden = new TableRowSorter(tablalistado.getModel());
        tablalistado.setRowSorter(orden);
        txttotalregistros.setText("Mostrando "+ this.CONTROL.totalMostrado()+ " de un total de "+this.CONTROL.total()+" registros");
    }
    
    //metodo para las ventanas emergentes
    private void mensajeError(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje,"ERROR",JOptionPane.ERROR_MESSAGE);
    }
    private void mensajeOK(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje,"Exitoso",JOptionPane.INFORMATION_MESSAGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabGeneral = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbuscarcategoria = new javax.swing.JTextField();
        btnbuscarcategoria = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btneditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablalistado = new javax.swing.JTable();
        btndesactivar = new javax.swing.JButton();
        btnactivar = new javax.swing.JButton();
        txttotalregistros = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Categorias");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/categoria_1.png"))); // NOI18N

        tabGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Formulario de categorias", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Sans Unicode", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/ima.png"))); // NOI18N
        jLabel1.setText(" Nombre de Categorias");

        txtbuscarcategoria.setForeground(new java.awt.Color(153, 153, 153));
        txtbuscarcategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtbuscarcategoria.setText("Buscar...");
        txtbuscarcategoria.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtbuscarcategoriaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbuscarcategoriaFocusLost(evt);
            }
        });
        txtbuscarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscarcategoriaActionPerformed(evt);
            }
        });

        btnbuscarcategoria.setBackground(new java.awt.Color(255, 153, 255));
        btnbuscarcategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnbuscarcategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/lupa.png"))); // NOI18N
        btnbuscarcategoria.setText("Buscar Categoria");
        btnbuscarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarcategoriaActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(new java.awt.Color(255, 153, 255));
        btnregistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/registro.png"))); // NOI18N
        btnregistrar.setText("Registrar Categoria");

        btneditar.setBackground(new java.awt.Color(255, 153, 255));
        btneditar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/editar.png"))); // NOI18N
        btneditar.setText("Editar Categoria");

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 204));
        jScrollPane1.setBorder(null);

        tablalistado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablalistado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablalistado);

        btndesactivar.setBackground(new java.awt.Color(255, 153, 153));
        btndesactivar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btndesactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/x.png"))); // NOI18N
        btndesactivar.setText("Desactivar Categoria");
        btndesactivar.setBorder(null);
        btndesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndesactivarActionPerformed(evt);
            }
        });

        btnactivar.setBackground(new java.awt.Color(153, 255, 153));
        btnactivar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnactivar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/check.png"))); // NOI18N
        btnactivar.setText("Activar Categoria");
        btnactivar.setBorder(null);
        btnactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactivarActionPerformed(evt);
            }
        });

        txttotalregistros.setText("Total de Registro: ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtbuscarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbuscarcategoria)
                        .addGap(18, 18, 18)
                        .addComponent(btnregistrar)
                        .addGap(18, 18, 18)
                        .addComponent(btneditar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(btndesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95)
                        .addComponent(txttotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtbuscarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarcategoria)
                    .addComponent(btnregistrar)
                    .addComponent(btneditar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btndesactivar, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                        .addComponent(txttotalregistros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnactivar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tabGeneral.addTab("Listado de Categorias", jPanel2);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/categoria_1.png"))); // NOI18N
        jLabel3.setText(" Nombre de Categoria");

        txtnombre.setForeground(new java.awt.Color(153, 153, 153));
        txtnombre.setText("Escriba la categoria");
        txtnombre.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtnombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnombreFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/descripcion.png"))); // NOI18N
        jLabel4.setText(" Descripción ");

        txtdescripcion.setColumns(20);
        txtdescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtdescripcion.setRows(5);
        txtdescripcion.setText("Pon una descripción de la categoria");
        txtdescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtdescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtdescripcionFocusLost(evt);
            }
        });
        jScrollPane2.setViewportView(txtdescripcion);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("(*) Indica que es un campos obligatorio");

        jButton1.setBackground(new java.awt.Color(204, 153, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/guardar.png"))); // NOI18N
        jButton1.setText(" Guardar");
        jButton1.setBorder(null);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jButton2.setBackground(new java.awt.Color(204, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/presentacion/imagenes/cancel_1.png"))); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(null);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtnombre)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 370, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(396, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        tabGeneral.addTab("Registrar formulario de categoria", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabGeneral)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabGeneral)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbuscarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarcategoriaActionPerformed
        this.listar(txtbuscarcategoria.getText());
    }//GEN-LAST:event_btnbuscarcategoriaActionPerformed

    private void txtbuscarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscarcategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscarcategoriaActionPerformed

    private void txtnombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusGained
        if(txtnombre.getText().equals("Escriba la categoria")){
           txtnombre.setText("");
           txtnombre.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtnombreFocusGained

    private void txtnombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnombreFocusLost
        if(txtnombre.getText().equals("")){
           txtnombre.setText("Escriba la categoria");
           txtnombre.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtnombreFocusLost

    private void txtdescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionFocusGained
       if(txtdescripcion.getText().equals("Pon una descripción de la categoria")){
           txtdescripcion.setText("");
           txtdescripcion.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtdescripcionFocusGained

    private void txtdescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtdescripcionFocusLost
        if(txtdescripcion.getText().equals("")){
           txtdescripcion.setText("Pon una descripción de la categoria");
           txtdescripcion.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_txtdescripcionFocusLost

    private void txtbuscarcategoriaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbuscarcategoriaFocusGained
         if(txtbuscarcategoria.getText().equals("Buscar...")){
           txtbuscarcategoria.setText("");
           txtbuscarcategoria.setForeground(new Color(0,0,0));
        } 
    }//GEN-LAST:event_txtbuscarcategoriaFocusGained

    private void txtbuscarcategoriaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbuscarcategoriaFocusLost
        if(txtbuscarcategoria.getText().equals("")){
           txtbuscarcategoria.setText("Buscar...");
           txtbuscarcategoria.setForeground(new Color(153,153,153));
        } 
    }//GEN-LAST:event_txtbuscarcategoriaFocusLost

    private void btndesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndesactivarActionPerformed
        if(tablalistado.getSelectedRowCount()==1){
            String id = String.valueOf(tablalistado.getValueAt(tablalistado.getSelectedRow(), 0));
            String nombre = String.valueOf(tablalistado.getValueAt(tablalistado.getSelectedRow(), 1));
            if(JOptionPane.showConfirmDialog(this, "¿Deseas desactivar el registro: "+nombre+" ?","Desactivar",JOptionPane.YES_NO_OPTION)== 0){
                String resp=this.CONTROL.desactivar(Integer.parseInt(id));
                if(resp.equals("OK")){
                    this.mensajeOK("Registro desactivado");
                    this.listar("");
                }else{
                    this.mensajeError(resp);
                }
            }
        }else{
            this.mensajeError("Selecciona un registro para desactivar");
        }
    }//GEN-LAST:event_btndesactivarActionPerformed

    private void btnactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactivarActionPerformed
        if(tablalistado.getSelectedRowCount()==1){
            String id = String.valueOf(tablalistado.getValueAt(tablalistado.getSelectedRow(), 0));
            String nombre = String.valueOf(tablalistado.getValueAt(tablalistado.getSelectedRow(), 1));
            if(JOptionPane.showConfirmDialog(this, "¿Deseas activar el registro: "+nombre+" ?","activar",JOptionPane.YES_NO_OPTION)== 0){
                String resp=this.CONTROL.activar(Integer.parseInt(id));
                if(resp.equals("OK")){
                    this.mensajeOK("Registro activado");
                    this.listar("");
                }else{
                    this.mensajeError(resp);
                }
            }
        }else{
            this.mensajeError("Selecciona un registro para activar");
        }
    }//GEN-LAST:event_btnactivarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnactivar;
    private javax.swing.JButton btnbuscarcategoria;
    private javax.swing.JButton btndesactivar;
    private javax.swing.JButton btneditar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabGeneral;
    private javax.swing.JTable tablalistado;
    private javax.swing.JTextField txtbuscarcategoria;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttotalregistros;
    // End of variables declaration//GEN-END:variables
}
