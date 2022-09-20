package org.example;

import java.io.*;

public class Ejercicio3 {

    public static void main(String[] args) {

        String origen = "C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Acceso_Secuencial_Binario\\Prueba.txt";
        String copia = "C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Acceso_Secuencial_Binario\\Prueba_copia.txt";

        try {
            //Se crea el objeto de origen
            File fOrigen = new File(origen);

            if (!fOrigen.exists()) {
                System.out.println("No existe");
                return;
            }
            //Se crea el objeto de destino
            File fDestino = new File(copia);

            //Si el destino existe
            if (fDestino.exists()) {
                System.out.println("Ya existe");
                return;
            }

            //Se copian de origen a destino
            if (copiarFicheros(fOrigen, fDestino)) {
                System.out.println("Ficheros copiados");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static boolean copiarFicheros(File fOrigen, File fDestino) {

        InputStream in = null;
        OutputStream out = null;


        try {

            in = new FileInputStream(fOrigen);
            out = new FileOutputStream(fDestino);

            int car = in.read();

            while (car != -1) {
                out.write(car);
                car = in.read();
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
