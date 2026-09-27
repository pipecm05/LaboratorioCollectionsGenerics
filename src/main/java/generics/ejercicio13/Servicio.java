package generics.ejercicio13;

import java.util.List;

public interface Servicio<T extends Number & Comparable<T>> {

    T minimo(List<T> lista);

    T maximo(List<T> lista);
}