package generics.ejercicio6;

public class MainEjercicio06 {

    public static void main(String[] args) {

        CajaNumerica<Integer> numeroEntero =
                new CajaNumerica<>(10);

        CajaNumerica<Double> numeroDecimal =
                new CajaNumerica<>(15.5);

        System.out.println("Número entero:");
        System.out.println(numeroEntero.getNumero());

        System.out.println("Doble:");
        System.out.println(numeroEntero.doble());

        System.out.println("\nNúmero decimal:");
        System.out.println(numeroDecimal.getNumero());

        System.out.println("Doble:");
        System.out.println(numeroDecimal.doble());
    }
}