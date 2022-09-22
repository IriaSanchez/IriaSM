package org.example;

import java.io.*;
//                Crear una aplicación que, dado un fichero en codificación UTF-8,
//                lo lea en dicha codificación y loguarde en otro fichero distinto en codificación ISO-8859-1.
//                El contenido del fichero debe ser el siguiente:
//                Esto es el contenido ñ
//                del fichero de pruebas
//                 Verificad mediante webhex.net los bytes de cada uno de los ficheros.


public class Ejercicio5 {

    public static void main(String[] args) throws IOException {

        FileInputStream fichero_UTF = null;
        InputStreamReader lecturaUTF = null;

        FileOutputStream fichero_ISO = null;
        OutputStreamWriter lecturaISO = null;

        try {

            //Fichero de entrada y ruta
            fichero_UTF = new FileInputStream("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\PruebaUTF.txt");
            //Lectura del fichero de entrada creado anteriormente y codificacion
            lecturaUTF = new InputStreamReader(fichero_UTF, "UTF-8");

            //Fichero de salida y ruta
            fichero_ISO = new FileOutputStream("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\PruebaISO.txt");
            //Lectura del fichero de salida creado anteriormente y codificacion
            lecturaISO = new OutputStreamWriter(fichero_ISO, "ISO-8859-1");

            //Lectura avanzada: leemos el fichero de entrada
            int x = 0;
            x = lecturaUTF.read();

            while (x != -1) {

                //Escribimos sobre el fichero de salida
                lecturaISO.write(x);
                //Volvemos a leer en el fichero de entrada ( hasta que sea distinto a -1)
                x = lecturaUTF.read();

            }
        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            //Cerramos todos los ficheros

            lecturaUTF.close();
            lecturaISO.close();
            fichero_ISO.close();
            fichero_UTF.close();
        }
    }
}


//
//        try {
//
//        } catch (Exception e) {
//        e.printStackTrace();
//        }

