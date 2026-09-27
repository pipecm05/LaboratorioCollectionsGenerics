package collection.ejercicio04;
import java.util.PriorityQueue;
import java.util.Queue;

public class MainEjercicio04 {

    public static void main(String[] args) {

        Queue<Tarea> tareas = new PriorityQueue<>();

        tareas.add(new Tarea("Hacer informe", 3));
        tareas.add(new Tarea("Entregar proyecto", 5));
        tareas.add(new Tarea("Estudiar para parcial", 4));
        tareas.add(new Tarea("Organizar archivos", 1));
        tareas.add(new Tarea("Enviar correo", 2));

        System.out.println("Tareas atendidas según prioridad:");

        while (!tareas.isEmpty()) {

            Tarea tarea = tareas.poll();

            System.out.println(
                    tarea.getNombre() +
                            " - Prioridad: " +
                            tarea.getPrioridad()
            );
        }
    }
}