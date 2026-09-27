package collection.ejercicio08;
public class MainEjercicio08 {

    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();

        editor.agregarCambio("Escribir: Hola");
        editor.agregarCambio("Escribir: Hola Felipe");
        editor.agregarCambio("Agregar: !");
        editor.agregarCambio("Agregar: ¿");

        System.out.println("HISTORIAL DE CAMBIOS:");

        editor.mostrarHistorial();

        System.out.println("\nÚltimo cambio:");
        System.out.println(editor.ultimoCambio());

        System.out.println("\nDeshaciendo último cambio:");

        String cambioDeshecho = editor.deshacer();

        System.out.println("Cambio eliminado: " + cambioDeshecho);

        System.out.println("\nHISTORIAL DESPUÉS DE DESHACER:");

        editor.mostrarHistorial();

        System.out.println("\nDeshaciendo otro cambio:");

        cambioDeshecho = editor.deshacer();

        System.out.println("Cambio eliminado: " + cambioDeshecho);

        System.out.println("\nHISTORIAL FINAL:");

        editor.mostrarHistorial();
    }
}