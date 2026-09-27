package generics.ejercicio14;

import java.util.List;

public class Ordenador<T extends Comparable<T>> {

    public void ordenar(List<T> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {

            for (int j = 0; j < lista.size() - 1 - i; j++) {

                if (lista.get(j).compareTo(lista.get(j + 1)) > 0) {

                    T temporal = lista.get(j);

                    lista.set(j, lista.get(j + 1));

                    lista.set(j + 1, temporal);
                }
            }
        }
    }
}