
package ec.edu.ups.carrito.dao;

import ec.edu.ups.carrito.models.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS_USER
 */
public class ProductoDAOMemoria implements ProductoDAO{
   private List<Producto> lista;
   
   public ProductoDAOMemoria(){
       lista = new ArrayList<>();
   }
   

    @Override
    public void crear(Producto produto) {
        lista.add(produto);
        
    }
    

    @Override
    public Producto buscar(int codigo) {
        for(Producto producto : lista){
            if(producto.getCodigo() == codigo){
                System.out.println("Codigo");
            }
        }
        return null;
    }
    @Override
    public void actualizar(int codigo, Producto producto) {
        for(int i = 0 ; i < lista.size(); i++){
            Producto productoEncontrado = lista.get(i);
            if(productoEncontrado.getCodigo() == codigo){
                lista.set(i, producto);
                break;
            }
        }
    }

    @Override
    public void Eliminar(int codigo) {
        Producto productoEncontrado = buscar (codigo);
        if(productoEncontrado !=null){
        lista.remove(productoEncontrado);
    }
}
}