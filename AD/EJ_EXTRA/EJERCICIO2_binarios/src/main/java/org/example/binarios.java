package org.example;


import java.io.*;

public class binarios
{
    public static void main( String[] args ) throws IOException {

//        PARTE 1
//        En mitad de un examen, tu compañero desea enviarte un mensaje mediante un fichero.
//        Por miedo a que el profesor lo intercepte, y pueda leer el contenido, decide encriptar
//        el mensaje.
//        Tu compañero decide que cada letra estará representada por 1 byte, por ejemplo,
//        decide que la letra A
//        sea el valor de byte 200, por tanto, si al leer el fichero te encuentras con
//        un byte con el valor 200 sabrás que ahí hay una A.
//
//        Crea un programa que lea el fichero adjunto y muestre por consola el mensaje
//        que te envía tu compañero.
//        El valor del byte asignado a cada letra es el siguiente
//        (todas las letras son mayúsculas):
//
//        A (200), B (201), C (202), D (203), E (204), F (205),
//        G (206), H (207), I (208), J (209), K (210), L (211), M (212),
//        N (213), O (214), P (215), Q (216), R (217), S (218), T (219),
//        U (220), V (221), W (222), X (223), Y (224), Z (225)
//
//        Resultado esperado
//        APROBADO
//
//        PARTE 2
//        Crea un programa para poder generar un fichero con el mensaje GRACIAS y enviarlo a tu compañero con la encriptación elegida.
//        Resultado esperado (al abrir el fichero con el bloc de notas)
//
//        ÎÙÈÊÐÈÚ


        FileInputStream encriptado = null;
        InputStreamReader lectura_encriptado = null;

        FileOutputStream descifrado = null;
        OutputStreamWriter lectura_descifrado = null;

        try {

            //Indicamos fichero de entrada encriptado y su ruta:
            encriptado = new FileInputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO2_binarios\\encriptado.txt");
            //Lo leemos indicando la codificación:
            lectura_encriptado = new InputStreamReader(encriptado,"ASCII");

            //Indicamos fichero de salida descifrado y su ruta:
            descifrado = new FileOutputStream("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO2_binarios\\descifrado.txt");
            //Lo leemos indicando la codificación:
            lectura_descifrado = new OutputStreamWriter(descifrado, "UTF-8");




            //Lectura avanzada: leemos el fichero de entrada
            int x = 200;
            x = encriptado.read();

            while (x != -1){

                //Escribimos sobre el fichero de salida:
                lectura_descifrado.write(x);
                //Volvemos a leer en el fichero de entrada ( hasta que sea distinto a -1)
                x = encriptado.read();

            }



        } catch (Exception e) {
            e.printStackTrace();

        }finally {

            //Cerramos todos los ficheros:
            encriptado.close();
            lectura_encriptado.close();
            descifrado.close();
            lectura_descifrado.close();
        }


    }
}
