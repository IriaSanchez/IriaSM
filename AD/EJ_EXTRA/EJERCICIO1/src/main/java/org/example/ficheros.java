package org.example;






//        Crea manualmente, mediante el explorador de Windows, un directorio en C:\Pruebas
//        y crea dentro de este los ficheros Fichero1.txt y Fichero2.txt manualmente
//        Crea un programa que lea TODOS los ficheros que contenga el directorio C:\Prueba,
//        y cree dentro de dicho directorio otro llamado Copia,
//        copiando dentro de este los ficheros del original añadiendo en el nombre de
//        los mismos la fecha en que se realiza la copia.
//        (formato fecha = AAAAMMDD)
//        Nota: Si se añaden más ficheros al directorio Pruebas el programa debería copiarlos sin necesidad de cambiar el código
//
//        Resultado esperado:
//
//        C:\Pruebas
//                |-Fichero1.txt
//                |-Fichero2.txt
//                |-...
//             |-Copia
//                |-Fichero1_20221001.txt
//                |-Fichero2_20221001.txt
//                |-...

import java.io.*;

public class ficheros {


    public static void main(String[] args) {

        //Creamos el primer directorio. Si existe, nos imprime el nombre:
        File prueba = new File("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\Prueba");

        if (prueba.exists()) {
            System.out.println("Ya existe" + prueba.getName());
        } else {
            prueba.mkdir();
        }

        //Creamos el segundo directorio.  Si existe, nos imprime el nombre:
        File copia = new File("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\Copia");

        if (copia.exists()) {
            System.out.println("Ya existe" + copia.getName());
        } else {
            copia.mkdir();
        }

        //Creamos los ficheros de origen y destino:
        String fichero1 = "C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\Prueba\\Fichero1.txt";
        String fichero2 = "C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\Prueba\\Fichero2.txt";

        String copia1 = "C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\Copia\\Fichero1_20221007.txt";
        String copia2 = "C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\Copia\\Fichero2_20221007.txt";


        try {

            //Creamos los objetos de origen que apuntan a los ficheros creados:
            File fichero1_Origen = new File(fichero1);
            File fichero2_Origen = new File(fichero2);

            //Creamos los ficheros de destino:
            File copia1_Destino = new File(copia1);
            File copia2_Destino = new File(copia2);

            //Copiamos de origen a destino llamando a la función copiarFicheros:

            if (copiaFicheros(fichero1_Origen, copia1_Destino)) {
                System.out.println("Primer fichero copiado");
            }
            if (copiarFicheros2 (fichero2_Origen,copia2_Destino)) {
               System.out.println("Segundo fichero copiado");
             }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

    //Creamos la función copiaFicheros :

    private static boolean copiaFicheros(File fichero1_Origen, File copia1_Destino) {

        InputStream in = null;
        OutputStream out = null;

        try {

            in = new FileInputStream(fichero1_Origen);
            out = new FileOutputStream(copia1_Destino);

            int x = in.read();

            while (x != -1) {
                out.write(x);
                x = in.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {

            try {

                if (in != null) in.close();
                if (out != null) out.close();

            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;
    }




    //Creamos la función copiaFicheros2 :

    private static boolean copiarFicheros2(File fichero2_Origen, File copia2_Destino) {

        InputStream in = null;
        OutputStream out = null;

        try {

            in = new FileInputStream(fichero2_Origen);
            out = new FileOutputStream(copia2_Destino);

            int x = in.read();

            while (x != -1) {
                out.write(x);
                x = in.read();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {

            try {

                if (in != null) in.close();
                if (out != null) out.close();

            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

        }
        return true;
    }
}










