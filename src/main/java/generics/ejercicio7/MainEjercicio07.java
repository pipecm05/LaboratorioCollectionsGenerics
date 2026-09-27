package generics.ejercicio7;

public class MainEjercicio07 {

    public static <T extends Number> double sumar(T numero1, T numero2) {

        return numero1.doubleValue() + numero2.doubleValue();
    }

    public static void main(String[] args) {

        double resultado1 = sumar(10, 20);

        double resultado2 = sumar(15.5, 4.5);

        double resultado3 = sumar(10.5f, 5.5f);

        System.out.println("Suma de enteros:");
        System.out.println(resultado1);

        System.out.println("\nSuma de decimales:");
        System.out.println(resultado2);

        System.out.println("\nSuma de float:");
        System.out.println(resultado3);
    }
}