package edu.collections.map;

import edu.collections.clases.Alumno;

import java.time.LocalDate;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        Map<String, Alumno> alumnos = new HashMap<>();
        alumnos.put("11111111A", new Alumno("11111111A", "Ana", "López", "ana.lopez@email.com", LocalDate.of(2000,5,10), 7.5));
        alumnos.put("22222222B", new Alumno ("22222222B", "Javier", "López", "javier.lopez@email.com", LocalDate.of(2000,5,10), 8.5));
        alumnos.put("22222222B", new Alumno ("22222222B", "Juan", "López", "javier.lopez@email.com", LocalDate.of(2000,5,10), 8.5));
        alumnos.put("33333333C", new Alumno ("33333333C", "Mario", "López", "javier.lopez@email.com", LocalDate.of(2000,5,10), 8.5));
        alumnos.put("44444444D", new Alumno ("44444444D", "Oscar", "López", "javier.lopez@email.com", LocalDate.of(2000,5,10), 8.5));
        alumnos.put("55555555E", new Alumno ("55555555E", "Pepa", "López", "javier.lopez@email.com", LocalDate.of(2000,5,10), 8.5));
        System.out.println(alumnos.get("11111111A"));
        System.out.println(alumnos.get("99999999J"));

        System.out.println(alumnos.containsKey("11111111A"));
        System.out.println(alumnos.containsKey("99999999J"));

        System.out.println(alumnos.containsValue(new Alumno("11111111A", "Ana", "López", "ana.lopez@email.com", LocalDate.of(2000,5,10), 7.5)));
        System.out.println(alumnos.containsValue(new Alumno("11911111D", "Ana", "López", "ana.lopez@email.com", LocalDate.of(2000,5,10), 7.5)));

        System.out.println(alumnos);

        Set<String> clavesDni = alumnos.keySet();
        for(String clave : clavesDni){
            System.out.println(clave);
        }

        List<Alumno> alumnosList = (List<Alumno>) alumnos.values();
        Set<Alumno> alumnosSet = (Set<Alumno>) alumnos.values();
        Collection<Alumno> alumnosCollection = alumnos.values();
        Object[] alumnosArrayList = alumnosCollection.toArray();
    }
}
