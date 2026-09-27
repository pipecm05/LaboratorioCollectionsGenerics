package collection.ejercicio02;
public class MainEjercicio02 {

    public static void main(String[] args) {

        Pila pila = new Pila();

        System.out.println("Insertando elementos:");

        System.out.println("10: " + pila.insertar(10));
        System.out.println("20: " + pila.insertar(20));
        System.out.println("30: " + pila.insertar(30));

        System.out.println("\nIntentando insertar un String:");

        System.out.println("\"Hola\": " + pila.insertar("Hola"));

        System.out.println("\nContenido de la pila:");
        pila.mostrar();

        System.out.println("\nElemento en la cima:");
        System.out.println(pila.cima());

        System.out.println("\nRetirando elemento:");
        System.out.println(pila.retirar());

        System.out.println("\nPila después de retirar:");
        pila.mostrar();
    }
}