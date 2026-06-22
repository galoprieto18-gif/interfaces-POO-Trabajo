
package ec.edu.ups.carrito.controllers;

import ec.edu.ups.carrito.dao.ProductoDAO;
import ec.edu.ups.carrito.models.Producto;
import ec.edu.ups.carrito.views.ActualizarProductoView;
import ec.edu.ups.carrito.views.BuscarProductoView;
import ec.edu.ups.carrito.views.CrearProductoView;
import ec.edu.ups.carrito.views.EliminarProductoView;
import ec.edu.ups.carrito.views.ListarProductoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ProductoController {
    private ProductoDAO productoDAO;
    private CrearProductoView crearProductoView;
    private BuscarProductoView buscarProductoView;
    private ArrayList<Producto> productos ;
    private EliminarProductoView eliminarProductoView;
    private ActualizarProductoView actualizarProductoView;
    private ListarProductoView listarProductoView;

    public ProductoController(CrearProductoView crearProductoView, BuscarProductoView buscarProductoView, EliminarProductoView eliminarProductoView, ActualizarProductoView actualizarProductoView, ProductoDAO productoDAO, ListarProductoView listarProductoView) {        
        this.crearProductoView = crearProductoView;
        this.productoDAO = productoDAO;
        this.listarProductoView = listarProductoView;
      
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
        String nombre = crearProductoView.getTxtCrearNombre().getText();
        double precio = Double.parseDouble(crearProductoView.getTxtCrearPrecio().getText());
        
        Producto producto = new Producto(codigo, nombre, precio);
        productoDAO.crear(producto);
        crearProductoView.mostrarInformacion("Producto creado exitosamente");
        
    }

    
    public void buscarProducto(){
        int codigoBuscar = Integer.parseInt(buscarProductoView.getLbCodigoBs().getText());
        Producto producto = productoDAO.buscar(codigoBuscar);
        if(producto != null){
           buscarProductoView.mostrarProductoBuscar(producto);
        }else{
           buscarProductoView.mostrarProducto("Producto Encontrado");
        }
}
    public void eliminarProducto(){
        int codigo = Integer.parseInt(eliminarProductoView.getjTextFieldCodigoEliminar().getText());
        Producto producto = productoDAO.buscar(codigo);
        
            if(producto != null){
                int respuesta = JOptionPane.showConfirmDialog(eliminarProductoView, "¿Deseas eliminar ?" + producto.getNombre(), "Confirmar eliminacion",JOptionPane.YES_OPTION);
                    if( respuesta == 0){
                        productoDAO.Eliminar(codigo);
                        eliminarProductoView.mostrarProducto("Producto eliminado correctamente");
                        
                       
                    }else{
                        eliminarProductoView.mostrarProducto("Accion cancelada");
                    }
            }else{
                eliminarProductoView.mostrarProducto("Codigo o producto inexistente");
            }
    }
    
    public void actualizarProducto(){
       int codigo = Integer.parseInt(actualizarProductoView.getjTextFieldCodigoAC().getText());
        Producto productoExt = productoDAO.buscar(codigo);
        
        if( productoExt != null){
            int respuesta = JOptionPane.showConfirmDialog(eliminarProductoView, "¿Quieres actualizar este producto: " + productoExt.getNombre() + " ?" , "Confirmar", JOptionPane.YES_NO_OPTION); 
            if(respuesta == 0){
                String nuevoNombre = actualizarProductoView.getjTextFieldNNombreAC().getText(); 
                double nuevoprecio = Double.parseDouble(actualizarProductoView.getjTextFieldNPrecioAC().getText()); 
                Producto productoAc = new Producto(codigo,nuevoNombre,nuevoprecio);
                productoDAO.actualizar(codigo,productoAc);
                
                actualizarProductoView.mostrarInformacion("Producto actualizado correctamente :)");
                
                actualizarProductoView.getjTextFieldNNombreAC().setText("");
                actualizarProductoView.getjTextFieldNPrecioAC().setText("");
                actualizarProductoView.getjTextFieldNPrecioAC().setText("");
                
                listarProducto();
            }else{
                actualizarProductoView.mostrarInformacion("Actualizacion candelada");
            }
        }else{
            actualizarProductoView.mostrarInformacion("No se encontro el producto (Codigo no existe)");
        }
    }
    public void listarProducto(){
        List<Producto>listaActualizada = productoDAO.listar();
        listarProductoView.cargarDatos(listaActualizada);
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

