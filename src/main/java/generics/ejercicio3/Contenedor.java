package generics.ejercicio3;

public interface Contenedor<T> {

    void agregar(T item);

    T obtener(int indice);
}