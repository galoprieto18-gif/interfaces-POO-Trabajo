
package ec.edu.ups.carrito.controllers;

import ec.edu.ups.carrito.models.Producto;
import ec.edu.ups.carrito.views.ActualizarProductoView;
import ec.edu.ups.carrito.views.BuscarProductoView;
import ec.edu.ups.carrito.views.CrearProductoView;
import ec.edu.ups.carrito.views.EliminarProductoView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class ProductoController {
    private Producto producto;
    private CrearProductoView crearProductoView;
    private BuscarProductoView buscarProductoView;
    private ArrayList<Producto> productos ;
    private EliminarProductoView eliminarProductoView;
    private ActualizarProductoView actualizarProductoView;

    public ProductoController(CrearProductoView crearProductoView, BuscarProductoView buscarProductoView, EliminarProductoView eliminarProductoView, ActualizarProductoView actualizarProductoView, ProductoController productoController) {        
        this.crearProductoView = crearProductoView;
        configurarEventoscrearProducto();
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
        producto = new Producto(codigo, nombre, precio);
        productos.add(producto);
        System.out.println("Producto creado exitosamente!");
    }
    
    public void buscarProducto(){
        int codigoBuscar = Integer.parseInt(buscarProductoView.getLbCodigoBs().getText());
        if(producto.getCodigo() == codigoBuscar){
            System.out.println("Producto encontrado exitosamente");
            return ; 
        }
        System.out.println("Producto no encontrado (Codigo incorrecto) ");
    }
    
    public void eliminarProducto(){
        int codigoEliminar = Integer.parseInt(eliminarProductoView.getjTextFieldCodigoEliminar().getText());
        if(producto.getCodigo() == codigoEliminar){
            producto = null; 
            System.out.println("Producto eliminado exitosamente");
            return ; 
        }
        System.out.println("Producto no encontrado (Codigo incorrecto) ");
    }
    
    public void actualizarProducto(){
        int codigoActualizar = Integer.parseInt(actualizarProductoView.getjTextFieldCodigoAC().getText());
        String nuevoNombre = actualizarProductoView.getjTextFieldNNombreAC().getText();
        Double nuevoPrecio = Double.parseDouble(actualizarProductoView.getjTextFieldNPrecioAC().getText());
        
        if(producto.getCodigo() == codigoActualizar){
            producto.setNombre(nuevoNombre);
            producto.setPrecio(nuevoPrecio);
            System.out.println("Producto actualizado exitosamente");
        }
        System.out.println("Producto no encontrado (Codigo incorrecto) ");
    }
    
    public void configurarEventoscrearProducto(){
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