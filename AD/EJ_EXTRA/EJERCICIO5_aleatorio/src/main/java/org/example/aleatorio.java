package org.example;
import java.io.IOException;
import java.io.RandomAccessFile;




//        Se adjunta un fichero con los deportistas mejor pagados.
//        Debes crear un programa que abra el fichero y se posicione directamente
//        en el tercer deportista mejor pagado e imprima sus datos por consola separados
//        por guiones.
//
//        Resultado esperado
//        Cristiano Ronaldo        -37-60.1-55.8


public class aleatorio {

    public static void main( String[] args ) throws IOException {

        RandomAccessFile fDeportistas = null;

        try {

            //Fichero y ruta
            fDeportistas = new RandomAccessFile("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO5_aleatorio\\deportistas.txt", "r");

            //Posicionar el puntero del fichero en la posición indicada
            fDeportistas.seek(70*2);

            String nombre = "";

                for(int i = 0; i < 25; i++){
                    nombre += fDeportistas.readChar();
                }

                int edad = fDeportistas.readInt();
                double salario = fDeportistas.readDouble();
                double publicidad = fDeportistas.readDouble();

                String resultado = nombre + "-" + edad + "-" + salario + "-" + publicidad;
                System.out.println(resultado);




        } catch (Exception e) {
            e.printStackTrace();

        } finally {

            try {

                if (fDeportistas != null) fDeportistas.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

