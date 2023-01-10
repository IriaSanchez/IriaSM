package org.example;

import java.io.*;
import java.util.ArrayList;

public class Ejercicio3 {

    public static void main( String[] args ) throws ClassNotFoundException, FileNotFoundException {

        ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

        pilotos.add(new Piloto(44, "Pedro", 1.80));
        pilotos.add(new Piloto(22, "Iria", 1.60));

        RandomAccessFile raf = null;


        try{

            raf = new RandomAccessFile("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Examen_AD_Iria_Sanchez\\Examen_AD_Iria_Sanchez\\Ejercicio3.dat","rw");

            for (Piloto piloto:pilotos) {

                StringBuffer sb = new StringBuffer(piloto.getApodo());
                sb.setLength(25);

                raf.writeInt(piloto.getNumero());
                raf.writeDouble(piloto.getAltura());

            }

            String apodo ="";

            for (int i=0; i < 25; i++){
                apodo+=raf.readChar();
            }

            int numero = raf.readInt();
            double altura = raf.readDouble();


            String resultado = numero + "-" + apodo + "-" + altura ;
            System.out.println(resultado);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        escribirFichero(pilotos,"C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Examen_AD_Iria_Sanchez\\Examen_AD_Iria_Sanchez\\Ejercicio3.dat");
        leerFichero("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Examen_AD_Iria_Sanchez\\Examen_AD_Iria_Sanchez\\Ejercicio3.dat");

    }


    private static void escribirFichero(ArrayList<Piloto> pilotos, String ruta){

        File fichero = new File(ruta);
        FileOutputStream ficStream = null;
        ObjectOutput ficObj = null;

        try {

            ficStream = new FileOutputStream(fichero);
            ficObj = new ObjectOutputStream(ficStream);

            for (Piloto piloto : pilotos) {
                ficObj.writeObject(piloto);

            }

        } catch (Exception e) {
            e.printStackTrace();

        }finally {
            try {
                if (ficStream != null) ficStream.close();
                if (ficObj != null) ficObj.close();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }



    private static void leerFichero(String ruta) throws ClassNotFoundException {

        ArrayList<Piloto> pilotos = new ArrayList<Piloto>();

        File fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Examen_AD_Iria_Sanchez\\Examen_AD_Iria_Sanchez\\Ejercicio3.dat");
        FileInputStream ficStream = null;
        ObjectInputStream ficObj = null;
        Piloto piloto = new Piloto();

        try {

            ficStream = new FileInputStream(fichero);
            ficObj = new ObjectInputStream(ficStream);

            while (true) {
                try {
                    pilotos.add((Piloto) ficObj.readObject());
                } catch (EOFException e) {
                    break ;
                }
            }


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}


