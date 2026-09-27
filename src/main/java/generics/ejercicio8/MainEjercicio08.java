package generics.ejercicio8;

public class MainEjercicio08 {

    public static void main(String[] args) {

        Comparador<Integer> comparadorNumeros =
                new Comparador<>();

        Integer mayorNumero =
                comparadorNumeros.mayor(20, 15);

        System.out.println("Mayor número:");
        System.out.println(mayorNumero);


        Comparador<String> comparadorTexto =
                new Comparador<>();

        String mayorTexto =
                comparadorTexto.mayor("Perro", "Gato");

        System.out.println("\nMayor texto:");
        System.out.println(mayorTexto);
    }
}