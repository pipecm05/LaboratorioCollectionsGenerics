package collection.ejercicio06;
import java.util.ArrayList;
import java.util.Comparator;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    // Agregar un producto
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    // Buscar producto por código
    public Producto buscarProducto(String codigo) {

        for (Producto producto : productos) {

            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }

        return null;
    }

    // Eliminar productos agotados
    public void eliminarAgotados() {

        productos.removeIf(producto -> producto.getCantidad() == 0);
    }

    // Ordenar alfabéticamente por nombre
    public void ordenarPorNombre() {

        productos.sort(
                Comparator.comparing(Producto::getNombre)
        );
    }

    // Ordenar por precio
    public void ordenarPorPrecio() {

        productos.sort(
                Comparator.comparingDouble(Producto::getPrecio)
        );
    }

    // Mostrar todos los productos
    public void mostrarProductos() {

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}