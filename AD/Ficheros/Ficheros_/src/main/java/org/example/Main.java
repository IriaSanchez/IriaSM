package org.example;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {


           //Creamos el primer directorio. Si existe, nos imprime el nombre:

            File primer_directorio = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ficheros\\Directorios\\primer_directorio");

            if (primer_directorio.exists()) {
                System.out.println("Ya existe" + primer_directorio.getName());
            } else {
                primer_directorio.mkdir();
            }

            //Creamos el segundo directorio.  Si existe, nos imprime el nombre:

        File segundo_directorio = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ficheros\\Directorios\\segundo_directorio");

        if (segundo_directorio.exists()) {
            System.out.println("Ya existe" + segundo_directorio.getName());
        } else {
            segundo_directorio.mkdir();
        }


        //Creamos el primer fichero dentro del primer directorio. Si existe, nos imprime el nombre:

        File primer_fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ficheros\\Directorios\\primer_directorio\\fichero1");

        if (primer_fichero.exists()) {
            System.out.println("Ya existe" + primer_fichero.getName());
        } else {
            primer_fichero.createNewFile();
        }

        //Creamos el segundo fichero dentro del primer directorio. Si existe, nos imprime el nombre:


        File segundo_fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ficheros\\Directorios\\primer_directorio\\fichero2");

        if (segundo_fichero.exists()) {
            System.out.println("Ya existe" + segundo_fichero.getName());
        } else {
            segundo_fichero.createNewFile();
        }

        //Creamos el tercer fichero dentro del primer directorio. Si existe, nos imprime el nombre:

        File tercer_fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ficheros\\Directorios\\segundo_directorio\\fichero3");

        if (tercer_fichero.exists()) {
            System.out.println("Ya existe" + tercer_fichero.getName());
        } else {
            tercer_fichero.createNewFile();
        }


        //Creamos el cuarto fichero a la altura del resto de directorios. Si existe, nos imprime el nombre:

        File cuarto_fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Ficheros\\Directorios\\fichero4");

        if (cuarto_fichero.exists()) {
            System.out.println("Ya existe" + cuarto_fichero.getName());
        } else {
            cuarto_fichero.createNewFile();
        }
    }
}