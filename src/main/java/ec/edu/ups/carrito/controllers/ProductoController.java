
package ec.edu.ups.carrito.controllers;

import ec.edu.ups.carrito.dao.ProductoDAO;
import ec.edu.ups.carrito.models.Producto;
import ec.edu.ups.carrito.views.ActualizarProductoView;
import ec.edu.ups.carrito.views.BuscarProductoView;
import ec.edu.ups.carrito.views.CrearProductoView;
import ec.edu.ups.carrito.views.EliminarProductoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ProductoController {
    private ProductoDAO productoDAO;
    private CrearProductoView crearProductoView;
    private BuscarProductoView buscarProductoView;
    private ArrayList<Producto> productos ;
    private EliminarProductoView eliminarProductoView;
    private ActualizarProductoView actualizarProductoView;

    public ProductoController(CrearProductoView crearProductoView, BuscarProductoView buscarProductoView, EliminarProductoView eliminarProductoView, ActualizarProductoView actualizarProductoView, ProductoDAO productoDAO) {        
        this.crearProductoView = crearProductoView;
        this.productoDAO = productoDAO;
        configurarEventosCrearProducto();
       this.buscarProductoView = buscarProductoView;
       this.productos = new ArrayList<>();
        configurarEventosBuscarProducto();
       this.eliminarProductoView = eliminarProductoView;
        configurarEventosEliminarProducto();
      this.actualizarProductoView = actualizarProductoView;
         configurarEventosActualizarProducto();
  }    

   

    public void crearProducto(){
        int codigo = Integer.parseInt(crearProductoView.getTxtCodigo().getText());
        String nombre = crearProductoView.getTxtNombre().getText();
        double precio = Double.parseDouble(crearProductoView.getTxtPrecio().getText());
        
        Producto producto = new Producto(codigo, nombre, precio);
        productoDAO.crear(producto);
        crearProductoView.mostrarInformacion("Producto creado exitosamente");
        
    }

    
    public void buscarProducto(){
        int codigoBuscar = Integer.parseInt(buscarProductoView.getLbCodigoBs().getText());
        
        Producto producto = productoDAO.buscar(codigoBuscar);
        productoDAO.buscar(codigoBuscar);
        if(producto != null){
           buscarProductoView.mostrarProductoBuscar(producto);
        }else{
           JOptionPane.showMessageDialog(null, "Producto no econtrado");
         
        }
}
    
    public void eliminarProducto(){
        int codigo = Integer.parseInt(eliminarProductoView.getjTextFieldCodigoEliminar().getText());
        
            Producto producto = productoDAO.buscar(codigo);
            if(producto != null){
            eliminarProductoView.mostrarProductoEli(producto);
            int respuesta = JOptionPane.showConfirmDialog(
                    null, 
                    "¿Deseas eliminar ? \n",
                    "Confirmar eliminacion",
                    JOptionPane.YES_OPTION);
                    if( respuesta == JOptionPane.YES_NO_OPTION){
                        productoDAO.Eliminar(codigo);
                        JOptionPane.showMessageDialog(null, "Producto eliminado");
                    }
            }
    }
    
    public void actualizarProducto(){
        int codigoActualizar = Integer.parseInt(actualizarProductoView.getjTextFieldCodigoAC().getText());
        String nuevoNombre = actualizarProductoView.getjTextFieldNNombreAC().getText();
        Double nuevoPrecio = Double.parseDouble(actualizarProductoView.getjTextFieldNPrecioAC().getText());
        
        Producto producto = new Producto(codigoActualizar, nuevoNombre, nuevoPrecio);
        productoDAO.actualizar(codigoActualizar, producto);
        JOptionPane.showMessageDialog(null, "Producto actualizado correctamente");
    } 

    public void configurarEventosCrearProducto(){
        crearProductoView.getBntAceptar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearProducto();
            }
        });
    }
    
   public void configurarEventosBuscarProducto(){
       buscarProductoView.getBtnAceptarBs().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               buscarProducto();
           }
       });
   }
   
   public void configurarEventosEliminarProducto(){
       eliminarProductoView.getjButtonAceptarEl().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarProducto();
            }
       });
   }
   
   public void configurarEventosActualizarProducto(){
       actualizarProductoView.getjButtonAceptarAC().addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
                actualizarProducto();
            }
        });
   }
}

