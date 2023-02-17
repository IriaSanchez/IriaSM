package org.example;
import java.io.*;
import java.security.*;
import javax.crypto.*;

    public class Cifrado {

        public static void main(String[] args) {

            try {
                //Generamos la clave secreta y lo guardamos en un archivo llamado clave.ken
                KeyGenerator generaClave = KeyGenerator.getInstance("AES");
                generaClave.init (128);

                SecretKey claveSecreta = generaClave.generateKey();

                ObjectOutputStream claveOutput = new ObjectOutputStream(new FileOutputStream("clave.ken"));
                claveOutput.writeObject(claveSecreta);
                claveOutput.close ();


                //Recuperamos la clave:
                ObjectInputStream claveInput = new ObjectInputStream(new FileInputStream("clave.ken"));
                Key clave = (Key) claveInput.readObject();
                claveInput.close();

                //Objeto Cipher para encriptar
                Cipher objCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
                objCipher.init(Cipher.ENCRYPT_MODE, clave);

                //Fichero a cifrar
                FileInputStream ficheroSuso = new FileInputStream("SUSO.pdf");

                //Objeto CipherOutputStream que encripta el fichero
                CipherOutputStream chiperOutput = new CipherOutputStream(new FileOutputStream("SUSO.Cifrado"), objCipher);

                int tamBloque = objCipher.getBlockSize();
                byte[] bytes = new byte[tamBloque];

                //LEEMOS BLOQUES DE BYTES DEL FICHERO PDF
                //Y LO VAMOS ESCRIBIENDO AL CipherOutputStream

                int i = ficheroSuso.read(bytes);
                while (i != -1) {
                    chiperOutput.write(bytes, 0, i);

                    i = ficheroSuso.read(bytes);
                }

                chiperOutput.flush();
                chiperOutput.close ();
                ficheroSuso.close ();

                System.out.println("Fichero cifrado con clave secreta.");

            } catch (Exception e) {e .printStackTrace ();}
        }
}