package org.example;
import java.io.*;
import java.util.ArrayList;


//        Crea un programa que lea el fichero y muestre por consola todos sus datos llamando
//        al método toString() de la clase Ciudad.
//
//        Resultado esperado
//
//        Ciudad{nombre='La Paz', pais='Bolivia', region='Sudamerica', elevacion=3869}
//        Ciudad{nombre='Quito', pais='Ecuador', region='Sudamerica', elevacion=2784}
//        Ciudad{nombre='Toluca', pais='Mexico', region='Centroamérica', elevacion=2648}
public class ficheros_objetos {
    public static void main( String[] args ) {


        // Array nuevo para poder leer en el fichero
        ArrayList <Ciudad> ciudades = new ArrayList <Ciudad> ();
        //Para poder leer
        FileInputStream ficheroLectura = null;
        //Para acceder a los objetos
        ObjectInputStream ficheroObjetoLectura = null;


        try {

            //Objeto fichero
            File fichero = new File("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO6_ficheros_objetos\\ciudades_1.dat");

            //Leemos en el fichero
            ficheroLectura = new FileInputStream(fichero);

            //Accedemos
            ficheroObjetoLectura = new ObjectInputStream(ficheroLectura);

            while (true){

                try {
                    ciudades.add((Ciudad) ficheroObjetoLectura.readObject());
                }catch (IOException e){
                    break;
                }
            }

            for (Ciudad ciudad: ciudades) {

                System.out.println(ciudad.toString());

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
