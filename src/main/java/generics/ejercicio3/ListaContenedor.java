package generics.ejercicio3;

import java.util.ArrayList;

public class ListaContenedor<T> implements Contenedor<T> {

    private ArrayList<T> elementos;

    public ListaContenedor() {
        elementos = new ArrayList<>();
    }

    @Override
    public void agregar(T item) {
        elementos.add(item);
    }

    @Override
    public T obtener(int indice) {
        return elementos.get(indice);
    }
}