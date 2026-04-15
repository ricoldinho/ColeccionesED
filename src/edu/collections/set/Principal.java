package edu.collections.set;

import edu.collections.clases.Alumno;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Principal {
    public static void main(String[] args) {
        Set<Alumno> alumnos = new HashSet<>();
        HashSet<Alumno> alumnosTest = new HashSet<>();

        System.out.println(alumnos.isEmpty());
        alumnos.add(new Alumno("11111111A", "Ana", "López", "ana.lopez@email.com",
                LocalDate.of(2002, 3, 12), 7.5));
        System.out.println(alumnos.isEmpty());
        System.out.println(alumnos.size());
        alumnos.clear();
        System.out.println(alumnos.size());

        alumnos.add(new Alumno("11111111A", "Ana", "López", "ana.lopez@email.com",
                LocalDate.of(2002, 3, 12), 7.5));

        alumnos.add(new Alumno("22222222B", "Pedro", "Martín", "pedro.martin@email.com",
                LocalDate.of(2001, 7, 25), 6.8));

        alumnos.add(new Alumno("33333333C", "Lucía", "Gómez", "lucia.gomez@email.com",
                LocalDate.of(2003, 1, 5), 8.9));

        alumnos.add(new Alumno("44444444D", "Carlos", "Ruiz", "carlos.ruiz@email.com",
                LocalDate.of(2000, 11, 30), 5.4));

        alumnos.add(new Alumno("55555555E", "María", "Sánchez", "maria.sanchez@email.com",
                LocalDate.of(2002, 6, 18), 9.2));

        alumnos.add(new Alumno("66666666F", "Javier", "Pérez", "javier.perez@email.com",
                LocalDate.of(2001, 9, 9), 6.1));

        alumnos.add(new Alumno("77777777G", "Laura", "Díaz", "laura.diaz@email.com",
                LocalDate.of(2003, 4, 22), 7.9));

        alumnos.add(new Alumno("88888888H", "David", "Moreno", "david.moreno@email.com",
                LocalDate.of(2000, 12, 14), 5.9));

        alumnos.add(new Alumno("99999999I", "Elena", "Romero", "elena.romero@email.com",
                LocalDate.of(2002, 8, 3), 8.3));

        alumnos.add(new Alumno("00000000J", "Sergio", "Navarro", "sergio.navarro@email.com",
                LocalDate.of(2001, 2, 27), 6.7));

        alumnos.add(new Alumno("00000000J", "Sergio", "Navarro", "sergio.navarro@email.com",
                LocalDate.of(2001, 2, 27), 6.7));

        alumnos.add(new Alumno("00000000J", "Sergio", "Navarro", "sergio.navarro@email.com",
                LocalDate.of(2001, 2, 27), 6.7));

        alumnos.remove(new Alumno("99999999I", "Elena", "Romero", "elena.romero@email.com",
                LocalDate.of(2002, 8, 3), 8.3));

        for (Alumno alumno : alumnos) {
            System.out.println(alumno);
        }


    }
}
