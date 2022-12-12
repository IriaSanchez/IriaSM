package org.example;

import java.io.*;

public class codificados {
    public static void main(String[] args) throws IOException {


//        El fichero adjunto está en codificación Cp420,
//        crea un programa que muestre el contenido del mismo por consola.
//
//        Resultado esperado
//        EJERCICIO RESUELTO CORRECTAMENTE


        try {

            //Creamos el BufferedReader y le damos la ruta al InputStreamReader
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO4_codificados\\Cp420.txt"), "Cp420"));


            //Creamos una variable para el texto que va a salir por consola
            String texto = "";


            while ((texto = in.readLine()) != null) {
                System.out.println(texto);
            }


        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}