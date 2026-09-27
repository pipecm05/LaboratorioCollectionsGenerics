package collection.ejercicio05;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MainEjercicio05 {

    public static void main(String[] args) {

        Map<String, Producto> hashMap = new HashMap<>();

        Map<String, Producto> linkedHashMap = new LinkedHashMap<>();

        Map<String, Producto> treeMap = new TreeMap<>();

        Producto producto1 = new Producto("Mouse", 45000);
        Producto producto2 = new Producto("Teclado", 80000);
        Producto producto3 = new Producto("Monitor", 600000);

        // HashMap
        hashMap.put("P003", producto1);
        hashMap.put("P001", producto2);
        hashMap.put("P002", producto3);

        // LinkedHashMap
        linkedHashMap.put("P003", producto1);
        linkedHashMap.put("P001", producto2);
        linkedHashMap.put("P002", producto3);

        // TreeMap
        treeMap.put("P003", producto1);
        treeMap.put("P001", producto2);
        treeMap.put("P002", producto3);

        System.out.println("HASHMAP:");
        System.out.println(hashMap);

        System.out.println("\nLINKEDHASHMAP:");
        System.out.println(linkedHashMap);

        System.out.println("\nTREEMAP:");
        System.out.println(treeMap);
    }
}