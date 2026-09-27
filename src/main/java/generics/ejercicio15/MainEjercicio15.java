package generics.ejercicio15;

public class MainEjercicio15 {

    public static void main(String[] args) {

        CalculadoraAvanzada<Integer> calculadora =
                new CalculadoraAvanzada<>();

        System.out.println("Suma:");
        System.out.println(calculadora.sumar(20, 10));

        System.out.println("\nResta:");
        System.out.println(calculadora.restar(20, 10));

        System.out.println("\nMáximo:");
        System.out.println(calculadora.maximo(20, 10));

        System.out.println("\nMínimo:");
        System.out.println(calculadora.minimo(20, 10));
    }
}