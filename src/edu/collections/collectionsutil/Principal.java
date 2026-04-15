package edu.collections.collectionsutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Principal {
    public static void main(String[] args) {
        // 1. Instanciación
        // Creamos una lista de tipo String
        ArrayList<String> tareas = new ArrayList<>();

        // 2. Método add() - Agregar elementos
        tareas.add("Aprender Java");
        tareas.add("Configurar el IDE");
        tareas.add("Beber café");
        tareas.add("Dominar Collections");

        System.out.println("--- Lista Inicial ---");
        System.out.println(tareas);

        // 3. Método size() - Obtener el tamaño
        System.out.println("\nTotal de tareas: " + tareas.size());

        // 4. Método get() - Acceder a un elemento por índice
        String primeraTarea = tareas.get(0);
        System.out.println("La primera tarea es: " + primeraTarea);

        // 5. Método set() - Modificar un elemento
        tareas.set(2, "Beber mucho café"); // Cambiamos "Beber café" por esto
        System.out.println("Lista tras modificar el café: " + tareas);

        // 6. Método contains() - Buscar si existe un elemento
        boolean tieneJava = tareas.contains("Aprender Java");
        System.out.println("¿Está 'Aprender Java' en la lista?: " + tieneJava);

        // 7. Método remove() - Eliminar elementos (por objeto o por índice)
        tareas.remove("Configurar el IDE"); // Por objeto
        tareas.remove(0); // Por índice (elimina "Aprender Java")

        // 8. Uso de la clase Collections para ordenar
        tareas.add("Peinar Nico");
        tareas.add("Silenciar movil Iker");
        tareas.add("Responder a Jose Luis");
        Collections.sort(tareas);
        System.out.println("\n--- Lista tras eliminar y ordenar ---");
        System.out.println(tareas);
        System.out.println("\n--- Lista revertida ---");
        Collections.reverse(tareas);
        System.out.println(tareas);
        System.out.println("\n--- Lista mezclada ---");
        Collections.shuffle(tareas);
        System.out.println(tareas);
        System.out.println("\n--- Contenido de max de List de Strings ---");
        System.out.println(Collections.max(tareas));
        System.out.println("\n--- Contenido de min de List de Strings ---");
        System.out.println(Collections.min(tareas));

        // 9. Recorrer la colección (Iteración)
        System.out.println("\nRecorriendo con un for-each:");
        for (String t : tareas) {
            System.out.println("- " + t);
        }

        List<String> flujoFiltrado = tareas.stream().filter(tarea -> tarea.contains("be")).toList();
        System.out.println(flujoFiltrado);
        

        // 10. Método clear() e isEmpty() - Limpiar la lista
        tareas.clear();
        System.out.println("\n¿Está la lista vacía?: " + tareas.isEmpty());


    }
}
