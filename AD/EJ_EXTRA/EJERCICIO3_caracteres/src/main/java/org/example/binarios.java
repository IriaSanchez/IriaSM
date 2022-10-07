package org.example;


import java.io.*;

public class binarios {


//    Crea un programa que lea un fichero que contenga un texto y genere otro fichero
//    con el mismo texto pero convirtiendo todas las letras c en mayúsculas.
//    Ejemplo de contenido
//
//    En un lugar de La Mancha, de cuyo nombre no quiero acordarme,
//    no ha mucho tiempo que vivía un hidalgo de los de lanza y astillero,
//    adarga antigua, rocín flaco y galgo corredor...
//
//    Resultado esperado
//
//    En un lugar de La ManCha, de Cuyo nombre no quiero aCordarme,
//    no ha muCho tiempo que vivía un hidalgo de los de lanza y astillero,
//    adarga antigua, roCín flaco y galgo Corredor...


    public static void main(String[] args) {

        try {
            //Creamos los ficheros de origen y destino
            String original = "C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO3_caracteres\\original.txt";
            String copia = "C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO3_caracteres\\copia.txt";

            //Creamos los objetosde origen y destino:
            File fOriginal = new File(original);
            File fCopia = new File(copia);


            //Copiamos de origen a destino llamando a la función copiarFicheros:

            if (copiaFicheros(fOriginal, fCopia)) {
                System.out.println("Ficheros copiados");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    //Creamos la función copiaFicheros :

    private static boolean copiaFicheros(File fOriginal, File fCopia) {

        InputStream in = null;
        OutputStream out = null;


        try {
            in = new FileInputStream(fOriginal);
            out = new FileOutputStream(fCopia);

            int x = in.read();

            while (x != -1) {


                //Le indico que si encuentra el valor 99 en ASCII que es c, lo convierta a valor 67 que es C

                if (x == 99){
                    x = 67;
                }


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