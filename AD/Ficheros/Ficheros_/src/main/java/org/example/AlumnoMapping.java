package org.example;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class AlumnoMapping {

    public static ArrayList<Alumno> leerAlumnos(String pathFichero) {

        ArrayList<Alumno> alumnos = new ArrayList<>();

        File fic = new File(pathFichero);
        FileInputStream ficStream = null;
        ObjectInputStream ficObj = null;
        Alumno alumno = new Alumno();
    }try

    {

        ficStream = new FileInputStream(fic);
        ficObj = new ObjectInputStream(ficStream);

        while (true) {
            try {
                alumnos.add((Alumno) ficObj.readObject());
            } catch (EOFException e) {
                return alumnos;
            }
            ;
        }
    }catch(
    Exception e)

    {

        e.printStackTrace();
        return null;
    }finally

    {

        try {
            if (ficStream != null) ficStream.close();
            if (ficObj != null) ficObj.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void escribirpersona(String s, ArrayList<Persona> persona) {
    }
}
