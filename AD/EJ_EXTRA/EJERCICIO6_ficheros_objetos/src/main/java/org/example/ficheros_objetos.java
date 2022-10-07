package org.example;

import java.io.*;
import java.util.ArrayList;

public class ficheros_objetos {

    public static void main( String[] args ) {


//        Crea un programa que lea el fichero y muestre por consola todos sus datos llamando
//        al método toString() de la clase Ciudad.
//
//        Resultado esperado
//
//        Ciudad{nombre='La Paz', pais='Bolivia', region='Sudamerica', elevacion=3869}
//        Ciudad{nombre='Quito', pais='Ecuador', region='Sudamerica', elevacion=2784}
//        Ciudad{nombre='Toluca', pais='Mexico', region='Centroamérica', elevacion=2648}


        ArrayList <Ciudad> ciudades = new ArrayList<Ciudad>();

        ciudades.add(new Ciudad ("La Paz", "Bolivia", "Sudamerica", 3869));
        ciudades.add(new Ciudad ("Quito", "Ecuador", "Sudamerica", 2784));
        ciudades.add(new Ciudad ("Toluca", "Mexico", "Centroamérica", 2648));


        //Objeto fichero
        File fichero = new File("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO5_ficheros_objetos\\ciudades_1.dat");

        //Para poder escribir:
        FileOutputStream ficheroEscritura = null;
        //Para poder leer
        FileInputStream ficheroLectura = null;


        //Para acceder a los objetos
        ObjectOutputStream ficheroObjetoEscritura = null;
        ObjectInputStream ficheroObjetoLectura = null;


        // Variable booleana para actualizar el bucle while
        boolean continuar = true;

        // Array nuevo para poder leer en el fichero
        ArrayList <Ciudad> ciudades_2 = new ArrayList <Ciudad> ();


        try {

            //Escribimos en el fichero
            ficheroEscritura = new FileOutputStream(fichero);
            ficheroObjetoEscritura = new ObjectOutputStream(ficheroEscritura);

            for (Ciudad Ciudad: ciudades) {
                ficheroObjetoEscritura.writeObject(ciudades);
            }

            //Leemos en el fichero
            ficheroLectura = new FileInputStream(fichero);
            ficheroObjetoEscritura = new ObjectOutputStream(ficheroEscritura);

            while (continuar){

                try {
                    ciudades_2.add((Ciudad) ficheroObjetoLectura.readObject());
                }catch (EOFException e){
                    continuar = false;
                }
            }

            for (Ciudad Ciudad: ciudades_2) {

                System.out.println(Ciudad.toString());

            }


        } catch (Exception e) {
            e.fillInStackTrace();

        }finally {

            try {
                if (ficheroEscritura != null) ficheroEscritura.close();
                if (ficheroObjetoEscritura != null) ficheroObjetoEscritura.close();
                if (ficheroLectura != null) ficheroLectura.close();
                if (ficheroObjetoLectura != null) ficheroObjetoLectura.close();


            } catch (IOException e) {
            e.printStackTrace();            }
        }


    }



}
