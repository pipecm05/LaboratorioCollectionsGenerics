package collection.ejercicio08;
import java.util.Vector;

public class EditorTexto {

    private Vector<String> historial;

    public EditorTexto() {
        historial = new Vector<>();
    }

    // Agregar un nuevo cambio
    public void agregarCambio(String cambio) {
        historial.add(cambio);
    }

    // Deshacer el último cambio
    public String deshacer() {

        if (!historial.isEmpty()) {
            return historial.remove(historial.size() - 1);
        }

        return null;
    }

    // Mostrar el historial
    public void mostrarHistorial() {

        for (String cambio : historial) {
            System.out.println(cambio);
        }
    }

    // Ver el último cambio
    public String ultimoCambio() {

        if (!historial.isEmpty()) {
            return historial.lastElement();
        }

        return null;
    }
}