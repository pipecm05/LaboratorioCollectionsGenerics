package generics.ejercicio11;

public class EntidadPersistente<T extends Number & Comparable<T>> {

    private T valor;

    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public boolean esMayorQue(T otro) {
        return valor.compareTo(otro) > 0;
    }
}