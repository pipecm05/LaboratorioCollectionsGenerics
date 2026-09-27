package collection.ejercicio07;
import java.util.LinkedList;

public class MainEjercicio07 {

    public static void main(String[] args) {

        LinkedList<String> cola = new LinkedList<>();

        // Agregar clientes al final de la cola
        cola.add("Carlos");
        cola.add("Maria");
        cola.add("Juan");

        System.out.println("Cola inicial:");
        System.out.println(cola);

        // Agregar un cliente urgente al inicio
        cola.addFirst("Pedro - URGENTE");

        System.out.println("\nDespués de agregar un cliente urgente:");
        System.out.println(cola);

        // Atender al primer cliente
        String clienteAtendido = cola.removeFirst();

        System.out.println("\nCliente atendido:");
        System.out.println(clienteAtendido);

        System.out.println("\nCola después de atender:");
        System.out.println(cola);

        // Atender otro cliente
        clienteAtendido = cola.removeFirst();

        System.out.println("\nCliente atendido:");
        System.out.println(clienteAtendido);

        System.out.println("\nCola final:");
        System.out.println(cola);
    }
}