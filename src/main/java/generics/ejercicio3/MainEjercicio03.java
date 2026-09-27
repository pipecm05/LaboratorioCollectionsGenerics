package generics.ejercicio3;

public class MainEjercicio03 {

    public static void main(String[] args) {

        ListaContenedor<String> nombres = new ListaContenedor<>();

        nombres.agregar("Carlos");
        nombres.agregar("Maria");
        nombres.agregar("Juan");

        System.out.println("Primer nombre:");
        System.out.println(nombres.obtener(0));


        ListaContenedor<Integer> numeros = new ListaContenedor<>();

        numeros.agregar(10);
        numeros.agregar(20);
        numeros.agregar(30);

        System.out.println("\nSegundo número:");
        System.out.println(numeros.obtener(1));
    }
}