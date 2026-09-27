package generics.ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class MainEjercicio13 {

    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();

        numeros.add(30);
        numeros.add(10);
        numeros.add(50);
        numeros.add(20);
        numeros.add(40);

        ServicioNumerico<Integer> servicio =
                new ServicioNumerico<>();

        System.out.println("Lista:");
        System.out.println(numeros);

        System.out.println("\nNúmero mínimo:");
        System.out.println(servicio.minimo(numeros));

        System.out.println("\nNúmero máximo:");
        System.out.println(servicio.maximo(numeros));
    }
}