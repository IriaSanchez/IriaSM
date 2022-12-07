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




        //Objeto fichero
        File fichero = new File("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO6_ficheros_objetos\\ciudades_1.dat");

        //Para poder leer
        FileInputStream ficheroLectura = null;


        //Para acceder a los objetos
        ObjectInputStream ficheroObjetoLectura = null;


        // Variable booleana para actualizar el bucle while
        boolean continuar = true;

        // Array nuevo para poder leer en el fichero
        ArrayList <Ciudad> ciudades_2 = new ArrayList <Ciudad> ();


        try {


            //Leemos en el fichero
            ficheroLectura = new FileInputStream(fichero);

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
                if (ficheroLectura != null) ficheroLectura.close();
                if (ficheroObjetoLectura != null) ficheroObjetoLectura.close();


            } catch (IOException e) {
            e.printStackTrace();            }
        }


    }



}
