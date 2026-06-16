/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package ec.edu.ups.carrito.views;

import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author ASUS_USER
 */
public class ActualizarProductoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form ActualizarProductoView
     */
    public ActualizarProductoView() {
        initComponents();
    }

    public JButton getjButtonAceptarAC() {
        return jButtonAceptarAC;
    }

    public void setjButtonAceptarAC(JButton jButtonAceptarAC) {
        this.jButtonAceptarAC = jButtonAceptarAC;
    }

    public JButton getjButtonCancelarAC() {
        return jButtonCancelarAC;
    }

    public void setjButtonCancelarAC(JButton jButtonCancelarAC) {
        this.jButtonCancelarAC = jButtonCancelarAC;
    }

    public JTextField getjTextFieldCodigoAC() {
        return jTextFieldCodigoAC;
    }

    public void setjTextFieldCodigoAC(JTextField jTextFieldCodigoAC) {
        this.jTextFieldCodigoAC = jTextFieldCodigoAC;
    }

    public JTextField getjTextFieldNNombreAC() {
        return jTextFieldNNombreAC;
    }

    public void setjTextFieldNNombreAC(JTextField jTextFieldNNombreAC) {
        this.jTextFieldNNombreAC = jTextFieldNNombreAC;
    }

    public JTextField getjTextFieldNPrecioAC() {
        return jTextFieldNPrecioAC;
    }

    public void setjTextFieldNPrecioAC(JTextField jTextFieldNPrecioAC) {
        this.jTextFieldNPrecioAC = jTextFieldNPrecioAC;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldCodigoAC = new javax.swing.JTextField();
        jTextFieldNNombreAC = new javax.swing.JTextField();
        jTextFieldNPrecioAC = new javax.swing.JTextField();
        jButtonAceptarAC = new javax.swing.JButton();
        jButtonCancelarAC = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Producto");

        jLabel1.setFont(new java.awt.Font("Ebrima", 3, 12)); // NOI18N
        jLabel1.setText("Actualizar Producto");

        jLabel2.setText("Buscar Codigo: ");

        jLabel3.setText("Nuevo Nombre: ");

        jLabel4.setText("Nuevo Precio: ");

        jButtonAceptarAC.setText("Aceptar");

        jButtonCancelarAC.setText("Cancelar");
        jButtonCancelarAC.addActionListener(this::jButtonCancelarACActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldCodigoAC, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNNombreAC)
                                    .addComponent(jTextFieldNPrecioAC)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jButtonAceptarAC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarAC)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldCodigoAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldNNombreAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNPrecioAC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarAC)
                    .addComponent(jButtonCancelarAC))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelarACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarACActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarACActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarAC;
    private javax.swing.JButton jButtonCancelarAC;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldCodigoAC;
    private javax.swing.JTextField jTextFieldNNombreAC;
    private javax.swing.JTextField jTextFieldNPrecioAC;
    // End of variables declaration//GEN-END:variables
}
