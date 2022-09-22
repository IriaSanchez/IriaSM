package org.example;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;


//Crear clase Alumno con atributos:
// Nombre CHAR (10)
//Edad INT
//NotaMedia DOUBLE
//Insertar en un ArrayList <Alumno> datops de varios alumnos
//Recorrer ArrayList y por cada alumno recuperado,
//grabar sus atributos en un fichero (RandomAccessFile) como tipos primitivos.
//Una vez grabados todos los alumnos, acceder directamente al segundo alumno grabado,
//e imprimir por consola sus atributos

public class Ejercicio6 {

    public static void main(String[] args) throws IOException {

        class Alumno {

            private char Nombre;
            private int Edad;
            private double NotaMedia;

            public Alumno() {

                ArrayList Alumno = new ArrayList();

                Alumno.add("Maria,22,5.5");
                Alumno.add("Juan,20,9.5");
                Alumno.add("Pepe, 18, 6.6");

                for (int x = 0; x < Alumno.size(); x++) {

                    String Alumnos = (String) Alumno.get(x);
                    System.out.println(Alumnos);
                }
            }

        }

        RandomAccessFile fichero = null;

        try {

            //fichero = new RandomAccessFile(Alumno);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//
//        try {
//
//        } catch (Exception e) {
//        e.printStackTrace();
//        }

