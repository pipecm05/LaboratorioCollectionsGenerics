package generics.ejercicio11;

public class MainEjercicio11 {

    public static void main(String[] args) {

        EntidadPersistente<Integer> numero =
                new EntidadPersistente<>(50);

        System.out.println("Valor almacenado:");
        System.out.println(numero.getValor());

        System.out.println("\n¿Es mayor que 30?");
        System.out.println(numero.esMayorQue(30));

        System.out.println("\n¿Es mayor que 70?");
        System.out.println(numero.esMayorQue(70));
    }
}