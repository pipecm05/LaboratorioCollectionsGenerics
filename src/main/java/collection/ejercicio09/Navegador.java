package collection.ejercicio09;
import java.util.Stack;

public class Navegador {

    private Stack<String> historial;

    public Navegador() {
        historial = new Stack<>();
    }

    // Visitar una nueva página
    public void visitarPagina(String pagina) {
        historial.push(pagina);
    }

    // Volver a la página anterior
    public String volver() {

        if (historial.size() > 1) {
            historial.pop();
            return historial.peek();
        }

        return null;
    }

    // Ver la página actual
    public String paginaActual() {

        if (!historial.isEmpty()) {
            return historial.peek();
        }

        return null;
    }

    // Mostrar historial
    public void mostrarHistorial() {
        System.out.println(historial);
    }
}