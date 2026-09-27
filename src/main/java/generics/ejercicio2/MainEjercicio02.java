package generics.ejercicio2;

public class MainEjercicio02 {

    public static <T> void mostrarElemento(T elemento) {

        System.out.println("Elemento: " + elemento);
    }

    public static void main(String[] args) {

        mostrarElemento("Hola");
        mostrarElemento(100);
        mostrarElemento(25.5);
        mostrarElemento(true);
    }
}