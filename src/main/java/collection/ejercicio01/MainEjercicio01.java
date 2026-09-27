package collection.ejercicio01;

public class MainEjercicio01 {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Producto producto1 = new Producto("P003", "Teclado", 80000);
        Producto producto2 = new Producto("P001", "Mouse", 45000);
        Producto producto3 = new Producto("P002", "Monitor", 600000);

        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);
        empresa.agregarProducto(producto3);

        System.out.println("PRODUCTOS DE LA EMPRESA:");

        empresa.mostrarProductos();

        System.out.println("\nBUSCAR PRODUCTO:");

        Producto encontrado = empresa.buscarProducto("P002");

        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}