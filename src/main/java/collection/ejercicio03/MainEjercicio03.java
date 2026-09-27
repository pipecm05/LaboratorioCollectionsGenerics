package collection.ejercicio03;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainEjercicio03 {

    public static void main(String[] args) {

        Set<String> elementos = new HashSet<>();

        elementos.add("Java");
        elementos.add("Python");
        elementos.add("C++");
        elementos.add("Java");
        elementos.add("JavaScript");
        elementos.add("Python");

        System.out.println("Elementos de la lista:");

        Iterator<String> iterador = elementos.iterator();

        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println(elemento);
        }
    }
}