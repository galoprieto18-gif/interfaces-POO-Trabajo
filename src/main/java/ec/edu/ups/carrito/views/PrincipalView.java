
package ec.edu.ups.carrito.views;

import ec.edu.ups.carrito.controllers.ProductoController;
import ec.edu.ups.carrito.dao.ProductoDAO;
import ec.edu.ups.carrito.dao.ProductoDAOMemoria;

  

    public class PrincipalView extends javax.swing.JFrame {
        private CrearProductoView crearProductoView;
        private BuscarProductoView buscarProductoView;
        private EliminarProductoView eliminarProductoView;
        private ActualizarProductoView actualizarProductoView;
        private ProductoController productoController;
        private ProductoDAO productoDAO;
        
        public PrincipalView() {
            initComponents();
        crearProductoView =new CrearProductoView ();
        buscarProductoView = new BuscarProductoView();
        eliminarProductoView =new  EliminarProductoView();
        actualizarProductoView = new ActualizarProductoView();
        productoDAO = new ProductoDAOMemoria();
        
        
        productoController = new ProductoController(
                crearProductoView,
                buscarProductoView,
                eliminarProductoView,
                actualizarProductoView,
                productoDAO);
        }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        ProductosMenu = new javax.swing.JMenu();
        lbCrear = new javax.swing.JMenuItem();
        lbBuscar = new javax.swing.JMenuItem();
        lbEliminar = new javax.swing.JMenuItem();
        lbActualizar = new javax.swing.JMenuItem();
        agregarProductoCarrito = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ProductosMenu.setMnemonic('f');
        ProductosMenu.setText("Productos ");
        ProductosMenu.addActionListener(this::ProductosMenuActionPerformed);

        lbCrear.setMnemonic('o');
        lbCrear.setText("Crear ");
        lbCrear.addActionListener(this::lbCrearActionPerformed);
        ProductosMenu.add(lbCrear);

        lbBuscar.setMnemonic('s');
        lbBuscar.setText("Buscar ");
        lbBuscar.addActionListener(this::lbBuscarActionPerformed);
        ProductosMenu.add(lbBuscar);

        lbEliminar.setMnemonic('a');
        lbEliminar.setText("Eliminar");
        lbEliminar.addActionListener(this::lbEliminarActionPerformed);
        ProductosMenu.add(lbEliminar);

        lbActualizar.setMnemonic('x');
        lbActualizar.setText("Actualizar ");
        lbActualizar.addActionListener(this::lbActualizarActionPerformed);
        ProductosMenu.add(lbActualizar);

        menuBar.add(ProductosMenu);

        agregarProductoCarrito.setMnemonic('e');
        agregarProductoCarrito.setText("Carrito\n");
        agregarProductoCarrito.setActionCommand("Carrito ");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Agregar\n");
        cutMenuItem.addActionListener(this::cutMenuItemActionPerformed);
        agregarProductoCarrito.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Eliminar");
        agregarProductoCarrito.add(copyMenuItem);

        menuBar.add(agregarProductoCarrito);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbActualizarActionPerformed
        if (!actualizarProductoView.isVisible()) {
            desktopPane.remove(actualizarProductoView);
            actualizarProductoView.setVisible(true);
            desktopPane.add(actualizarProductoView);
        }
    }//GEN-LAST:event_lbActualizarActionPerformed

    private void lbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCrearActionPerformed
        if (!crearProductoView.isVisible()){
            desktopPane.remove(crearProductoView);
            crearProductoView.setVisible(true);
            desktopPane.add(crearProductoView);
        }
    }//GEN-LAST:event_lbCrearActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void ProductosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductosMenuActionPerformed

    }//GEN-LAST:event_ProductosMenuActionPerformed

    private void lbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbBuscarActionPerformed

            if(!buscarProductoView.isVisible()){
            desktopPane.remove(buscarProductoView);
            buscarProductoView.setVisible(true);
            desktopPane.add(buscarProductoView);
        }
    }//GEN-LAST:event_lbBuscarActionPerformed

    private void lbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbEliminarActionPerformed
        if (!eliminarProductoView.isVisible())  {
            desktopPane.remove(eliminarProductoView);
            eliminarProductoView.setVisible(true);
            desktopPane.add(eliminarProductoView);
        }
    }//GEN-LAST:event_lbEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ProductosMenu;
    private javax.swing.JMenu agregarProductoCarrito;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem lbActualizar;
    private javax.swing.JMenuItem lbBuscar;
    private javax.swing.JMenuItem lbCrear;
    private javax.swing.JMenuItem lbEliminar;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables
}

