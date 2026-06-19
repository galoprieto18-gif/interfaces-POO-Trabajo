
package ec.edu.ups.carrito.views;

import ec.edu.ups.carrito.models.Producto;
import javax.swing.JButton;
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

    public JTextField getTxtMostrarPrecioEli() {
        return TxtMostrarPrecioEli;
    }

    public void setTxtMostrarPrecioEli(JTextField TxtMostrarPrecioEli) {
        this.TxtMostrarPrecioEli = TxtMostrarPrecioEli;
    }

    public JTextField getTxtMostrarProductoEli() {
        return TxtMostrarProductoEli;
    }

    public void setTxtMostrarProductoEli(JTextField TxtMostrarProductoEli) {
        this.TxtMostrarProductoEli = TxtMostrarProductoEli;
    }
    public void mostrarProductoEli(Producto producto){
        TxtMostrarProductoEli.setText(producto.getNombre());
        TxtMostrarPrecioEli.setText(String.valueOf(producto.getPrecio()));
        
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
        jLabel3 = new javax.swing.JLabel();
        TxtMostrarProductoEli = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TxtMostrarPrecioEli = new javax.swing.JTextField();

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

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Precio : ");

        TxtMostrarProductoEli.addActionListener(this::TxtMostrarProductoEliActionPerformed);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Producto :");

        TxtMostrarPrecioEli.addActionListener(this::TxtMostrarPrecioEliActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMostrarPrecioEli, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtMostrarProductoEli, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldCodigoEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jButtonAceptarEl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCancelarEl)))
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
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMostrarProductoEli, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMostrarPrecioEli, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptarEl)
                    .addComponent(jButtonCancelarEl))
                .addGap(102, 102, 102))
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

    private void TxtMostrarProductoEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMostrarProductoEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMostrarProductoEliActionPerformed

    private void TxtMostrarPrecioEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMostrarPrecioEliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMostrarPrecioEliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TxtMostrarPrecioEli;
    private javax.swing.JTextField TxtMostrarProductoEli;
    private javax.swing.JButton jButtonAceptarEl;
    private javax.swing.JButton jButtonCancelarEl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldCodigoEliminar;
    // End of variables declaration//GEN-END:variables
}
