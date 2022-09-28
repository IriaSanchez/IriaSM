package org.example;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio7 {
    public static void main(String[] args) {
        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("Pablo", "Rodriguez de la Fuente", "1998-02-02"));
        personas.add(new Persona("Pedro", "Almodovar Ramirez", "1989-01-10"));
        personas.add(new Persona("Rubén", "Martinez Martinez", "1999-05-21"));
        personas.add(new Persona("María", "Rodriguez Lago", "1975-07-20"));

        // Declaramos variables
        File fichero = new File("C:\\Users\\FP\\Desktop\\Asignaturas\\acceso a datos\\personas.txt");
        // Para poder escribir
        FileOutputStream ficheroEscribir = null;     // Para poder escribir en el fichero
        ObjectOutputStream ficheroObjetoEscribir = null;      // Para poder acceder a los objetos y escribirlos
        // Para poder leer
        FileInputStream ficheroLeer = null; // Para poder leer el fichero
        ObjectInputStream ficheroObjetoLeer = null;
        // Variable booleana para actualizar el bucle while
        boolean continuar = true;
        // Array nuevo para poder leer en el fichero
        ArrayList<Persona> personas1 = new ArrayList<Persona>();

        try {
            // Escribo primeramente en el fichero txt
            ficheroEscribir = new FileOutputStream(fichero);
            ficheroObjetoEscribir = new ObjectOutputStream(ficheroEscribir);

            // Escribimos en el txt todos los objetos persona
            for (Persona persona : personas) {
                ficheroObjetoEscribir.writeObject(persona);
            }

            // Leo lo que tiene el fichero para poder imprimirlo por consola
            ficheroLeer = new FileInputStream(fichero);
            ficheroObjetoLeer = new ObjectInputStream(ficheroLeer);

            // Recorro un bucle while, mientras continuar sea true, en el que, voy rellenando el arraylist donde voy a leer luego lo que he rellenado
            while (continuar) {
                try {
                    personas1.add((Persona) ficheroObjetoLeer.readObject());   // primero añado al nuevo arraylist de la lectura que estamos haciendo del objeto
                } catch (EOFException e) {
                    continuar = false;
                }
            }
            // Recorro con un ArrayList el segundo array que he creado para poder leer y escribir por consola lo guardado con el metodo .toString que he puesto en la clase Persona que yo he creado
            for (Persona persona : personas1) {
                System.out.println(persona.toString());
            }
        } catch (Exception e) {
            e.fillInStackTrace();
        } finally {
            try {
                // Cierro todos los procesos
                if (ficheroEscribir != null) ficheroEscribir.close();
                if (ficheroObjetoEscribir != null) ficheroObjetoEscribir.close();
                if (ficheroLeer != null) ficheroLeer.close();
                if (ficheroObjetoLeer != null) ficheroObjetoLeer.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }


}
