package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {

    public static void main(String[] args) throws IOException {

        FileReader fnotas = null;
        BufferedReader bnotas = null;

        try {

            fnotas = new FileReader("C:\\Users\\FP\\Desktop\\AccesoADatos\\notas.txt");
            bnotas = new BufferedReader(fnotas);

            StringBuilder todasNotas = new StringBuilder();
            String lineaNotas = bnotas.readLine();

            while (lineaNotas != null) {
                todasNotas.append(lineaNotas);
                lineaNotas = bnotas.readLine();
            }


            String[] notas = todasNotas.toString().split("[|]");
            double media = 0.0;

            for (String nota : notas) {
                media += Double.parseDouble(nota);
            }

            media = media / notas.length;
            System.out.println(media);

        } catch (
                Exception e) {
            e.printStackTrace();

        } finally {
            {

                try {
                    if (fnotas != null) fnotas.close();
                    if (bnotas != null) bnotas.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


//    FileWriter (File fichero)
//    FileWriter(File file, boolean append)
//    FileWriter(String fileName)
//    FileWriter (String ruta, boolean añadir)

//
//try {
//
//        } catch (
//        Exception e) {
//        e.printStackTrace();
//        }