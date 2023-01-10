package org.example;
import java.io.*;

public class Ejercicio1 {

    public static void main( String[] args ) throws IOException {

        crearDirectorio();
        crearFichero();

    }
    private static void crearDirectorio(){

        File directorioCreado = new File("C:\\ExamenFic");

    }
    private static void crearFichero() throws IOException {


        try {

            //Indicamos el fichero donde escribir y la codificación
            new OutputStreamWriter(new FileOutputStream("C:\\ExamenFic\\Saludo.txt"), "ISO_8859_1");

            //Con el buffer envío texto al fichero
            BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\ExamenFic\\Saludo.txt"), "ISO_8859_1"));

            //Le pasamos el texto que queremos escribir
            buf.write("El hombre que mueve montañas empieza apartando piedras pequeñas");
            //Cerramos buffer
            buf.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        }
}
