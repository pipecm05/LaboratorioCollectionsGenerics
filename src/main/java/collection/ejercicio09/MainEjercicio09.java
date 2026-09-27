package collection.ejercicio09;
public class MainEjercicio09 {

    public static void main(String[] args) {

        Navegador navegador = new Navegador();

        navegador.visitarPagina("Google");
        navegador.visitarPagina("YouTube");
        navegador.visitarPagina("GitHub");
        navegador.visitarPagina("ChatGPT");

        System.out.println("Historial de navegación:");
        navegador.mostrarHistorial();

        System.out.println("\nPágina actual:");
        System.out.println(navegador.paginaActual());

        System.out.println("\nVolviendo a la página anterior:");

        String pagina = navegador.volver();

        System.out.println("Página actual: " + pagina);

        System.out.println("\nHistorial después de volver:");
        navegador.mostrarHistorial();

        System.out.println("\nVolviendo nuevamente:");

        pagina = navegador.volver();

        System.out.println("Página actual: " + pagina);

        System.out.println("\nHistorial final:");
        navegador.mostrarHistorial();
    }
}