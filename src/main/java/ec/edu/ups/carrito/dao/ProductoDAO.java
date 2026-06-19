
package ec.edu.ups.carrito.dao;

import ec.edu.ups.carrito.models.Producto;

/**
 *
 * @author ASUS_USER
 */
public interface ProductoDAO {

   

   
    void crear(Producto produto);
    Producto buscar(int codigo);
    void actualizar(int codigo, Producto producto);
    void Eliminar(int codigo);

    
}
