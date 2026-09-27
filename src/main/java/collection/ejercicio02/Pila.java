package collection.ejercicio02;
import java.util.Stack;

public class Pila {

    private Stack<Object> elementos;

    public Pila() {
        elementos = new Stack<>();
    }

    public boolean insertar(Object elemento) {

        // Si la pila está vacía, se puede insertar cualquier tipo
        if (elementos.isEmpty()) {
            elementos.push(elemento);
            return true;
        }

        // Obtener el elemento que está en la cima
        Object elementoCima = elementos.peek();

        // Verificar que ambos sean del mismo tipo
        if (elemento.getClass().equals(elementoCima.getClass())) {
            elementos.push(elemento);
            return true;
        }

        return false;
    }

    public Object retirar() {

        if (!elementos.isEmpty()) {
            return elementos.pop();
        }

        return null;
    }

    public Object cima() {

        if (!elementos.isEmpty()) {
            return elementos.peek();
        }

        return null;
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }

    public void mostrar() {
        System.out.println(elementos);
    }
}