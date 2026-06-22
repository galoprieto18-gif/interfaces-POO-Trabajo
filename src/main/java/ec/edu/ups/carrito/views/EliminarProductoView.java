
package ec.edu.ups.carrito.views;

import ec.edu.ups.carrito.models.Producto;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author ASUS_USER
 */
public class EliminarProductoView extends javax.swing.JInternalFrame {
    
    public EliminarProductoView() {
        initComponents();
    }

    public JButton getjButtonAceptarEl() {
        return jButtonAceptarEl;
    }

    public void setjButtonAceptarEl(JButton jButtonAceptarEl) {
        this.jButtonAceptarEl = jButtonAceptarEl;
    }

    public JButton getjButtonCancelarEl() {
        return jButtonCancelarEl;
    }

    public void setjButtonCancelarEl(JButton jButtonCancelarEl) {
        this.jButtonCancelarEl = jButtonCancelarEl;
    }
  
    

    public JTextField getjTextFieldCodigoEliminar() {
        return jTextFieldCodigoEliminar;
    }

    public void setjTextFieldCodigoEliminar(JTextField jTextFieldCodigoEliminar) {
        this.jTextFieldCodigoEliminar = jTextFieldCodigoEliminar;
    }

    public void mostrarProducto(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje);
        dispose(); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCodigoEliminar = new javax.swing.JTextField();
        jButtonAceptarEl = new javax.swing.JButton();
        jButtonCancelarEl = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Eliminar Producto");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Codigo : ");

        jLabel2.setFont(new java.awt.Font("Ebrima", 3, 12)); // NOI18N
        jLabel2.setText("Eliminar producto");

        jTextFieldCodigoEliminar.addActionListener(this::jTextFieldCodigoEliminarActionPerformed);

        jButtonAceptarEl.setText("Aceptar");

        jButtonCancelarEl.setText("Cancelar");
        jButtonCancelarEl.addActionListener(this::jButtonCancelarElActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonAceptarEl)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonCancelarEl))
                            .addComponent(jTextFieldCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarEl)
                    .addComponent(jButtonCancelarEl))
                .addGap(192, 192, 192))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoEliminarActionPerformed

    private void jButtonCancelarElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarElActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonCancelarElActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAceptarEl;
    private javax.swing.JButton jButtonCancelarEl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigoEliminar;
    // End of variables declaration//GEN-END:variables
}
