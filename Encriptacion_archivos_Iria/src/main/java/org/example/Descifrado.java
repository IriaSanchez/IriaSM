package org.example;
import java.io.*;
import java.security.*;
import javax.crypto.*;

    public class Descifrado {

    public static void main(String[] args) {

        try {

            //Recuperamos clave secreta
            ObjectInputStream objInput = new ObjectInputStream(new FileInputStream("clave.ken"));
            Key claveSecreta = (Key) objInput.readObject();
            objInput.close ();

            //Objeto Cipher para desencriptar
            Cipher objCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            objCipher.init(Cipher.DECRYPT_MODE, claveSecreta);

            //Objeto CipherInputStream cuyo contenido se va a descifrar
            CipherInputStream cipInput = new CipherInputStream(new FileInputStream("SUSO.Cifrado"), objCipher);

            int tamBloque = objCipher.getBlockSize();
            byte[] bytes = new byte[tamBloque];

            //Fichero con contenido ya descifrado que se crea
            FileOutputStream fileout = new FileOutputStream("SUSOdescifrado.pdf");



            int i = cipInput.read(bytes);
            while (i != -1) {
                fileout.write(bytes, 0, i);
                i = cipInput.read(bytes);
            }

            fileout.close ();
            cipInput.close();

            System.out.println("Fichero descifrado con clave secreta.");

        } catch (Exception e) {e.printStackTrace();}
    }
}