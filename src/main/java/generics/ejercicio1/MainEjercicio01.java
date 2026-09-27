package generics.ejercicio1;
public class MainEjercicio01 {

    public static void main(String[] args) {

        Caja<String> cajaTexto = new Caja<>();

        cajaTexto.guardar("Hola Felipe");

        System.out.println("Contenido de la caja de texto:");
        System.out.println(cajaTexto.obtener());


        Caja<Integer> cajaNumero = new Caja<>();

        cajaNumero.guardar(100);

        System.out.println("\nContenido de la caja numérica:");
        System.out.println(cajaNumero.obtener());


        Caja<Double> cajaDecimal = new Caja<>();

        cajaDecimal.guardar(25.5);

        System.out.println("\nContenido de la caja decimal:");
        System.out.println(cajaDecimal.obtener());
    }
}