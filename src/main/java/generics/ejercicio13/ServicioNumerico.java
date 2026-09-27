package generics.ejercicio13;

import java.util.List;

public class ServicioNumerico<T extends Number & Comparable<T>>
        implements Servicio<T> {

    @Override
    public T minimo(List<T> lista) {

        T minimo = lista.get(0);

        for (T numero : lista) {

            if (numero.compareTo(minimo) < 0) {
                minimo = numero;
            }
        }

        return minimo;
    }

    @Override
    public T maximo(List<T> lista) {

        T maximo = lista.get(0);

        for (T numero : lista) {

            if (numero.compareTo(maximo) > 0) {
                maximo = numero;
            }
        }

        return maximo;
    }
}