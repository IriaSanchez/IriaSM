package org.example;

import java.io.FileInputStream;
import java.io.IOException;

//Crear un programa que realice una copia entre dos ficheros indicados.
//Deberá leer de un fichero de texto que creemos y realizar una copia a un nuevo fichero.
//Debe comprobar que el de origen existe y el de destino no existe. Si no se cumple, mensaje de error y cancelar

public class Ejercicio3 {

    public static void main(String[] args) throws IOException {


        FileInputStream archivo = null;

        try {
            archivo = new FileInputStream("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Acceso_Secuencial_Binario\\Prueba.txt");

            int i = archivo.read();


            if (archivo.skip()) {
                System.out.println("Existe" + archivo.getFD());
            } else {
                System.out.println("No existe");
            }


        } catch (IOException e) {
            e.printStackTrace();

            //Para que cierre el fichero pase lo que pase.

        } finally {
            try {

                if (archivo != null) archivo.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
