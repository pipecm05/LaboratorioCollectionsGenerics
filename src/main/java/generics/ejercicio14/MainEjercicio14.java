package generics.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio14 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(50);
        numeros.add(10);
        numeros.add(40);
        numeros.add(20);
        numeros.add(30);

        Ordenador<Integer> ordenador =
                new Ordenador<>();

        System.out.println("Lista original:");
        System.out.println(numeros);

        ordenador.ordenar(numeros);

        System.out.println("\nLista ordenada:");
        System.out.println(numeros);
    }
}