package collection.ejercicio06;
public class MainEjercicio06 {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        Producto producto1 =
                new Producto("P001", "Teclado", 80000, 5);

        Producto producto2 =
                new Producto("P002", "Mouse", 45000, 10);

        Producto producto3 =
                new Producto("P003", "Monitor", 600000, 0);

        Producto producto4 =
                new Producto("P004", "Audifonos", 120000, 3);

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);
        inventario.agregarProducto(producto3);
        inventario.agregarProducto(producto4);

        System.out.println("INVENTARIO ORIGINAL:");
        inventario.mostrarProductos();

        System.out.println("\nBUSCAR PRODUCTO P002:");

        Producto encontrado = inventario.buscarProducto("P002");

        if (encontrado != null) {
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\nPRODUCTOS ORDENADOS POR NOMBRE:");

        inventario.ordenarPorNombre();
        inventario.mostrarProductos();

        System.out.println("\nPRODUCTOS ORDENADOS POR PRECIO:");

        inventario.ordenarPorPrecio();
        inventario.mostrarProductos();

        System.out.println("\nELIMINANDO PRODUCTOS AGOTADOS:");

        inventario.eliminarAgotados();

        inventario.mostrarProductos();
    }
}