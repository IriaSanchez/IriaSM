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

        //Creamos ArrayList:

        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        //Añadimos datos al ArrayList:

        alumnos.add(new Alumno("Maria     ", 22, 5.5));
        alumnos.add(new Alumno("Juan      ", 20, 9.5));
        alumnos.add(new Alumno("Pepe      ", 18, 6.6));


        //Creamos el fichero Random:

        RandomAccessFile fichero = null;


        try {

            fichero = new RandomAccessFile("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ejercicio6.txt", "rw");

            //ArrayList de tipo Alumno, recorre cada posicion (alumno) y dos puntos mas nombre del ArrayList que queremos recorrer

            for (Alumno alumno : alumnos) {

                fichero.writeChars(alumno.getNombre());
                fichero.writeInt(alumno.getEdad());
                fichero.writeDouble(alumno.getNotaMedia());

            }

            fichero.seek(19 * (2 - 1));

            String nombre = "";

            for (int i = 0; i < 11; i++) {

                nombre += fichero.readChar();
            }
        } catch (
                Exception e) {
            e.printStackTrace();

        } finally {

            fichero.close();
        }
    }
}



