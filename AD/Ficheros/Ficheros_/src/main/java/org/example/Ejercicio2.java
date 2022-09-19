package org.example;

import java.io.FileInputStream;
import java.io.IOException;

//ACCESO SECUENCIAL-BINARIO-LECTURA
//Clase del ejercicio

public class Ejercicio2 {

    //Método Main:

    public static void main(String[] args) throws IOException {

        //Creamos el objeto FileInputStream y añadimos la ruta donde esté el archivo, en mi caso un .txt
        //dentro del try catch

        try {
            FileInputStream archivo = new FileInputStream("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Acceso_Secuencial_Binario\\Prueba.txt");

            //Declaramos la variable y la leemos (1º byte del fichero)
            int i = archivo.read();
            String salDec = new String("");
            String salHex = new String("");
            String salChar = new String("");


            while (i != -1) {
                salDec = salDec + i + "-";
                salHex = salHex + Integer.toHexString(i) + "-";
                salChar = salChar + (char) i + "-";
                i = archivo.read();
            }


            //Imprime todo el String:

            System.out.println(salDec);
            System.out.println(salHex);
            System.out.println(salChar);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


