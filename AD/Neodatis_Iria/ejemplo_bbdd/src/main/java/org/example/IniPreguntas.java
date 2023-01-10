package org.example;
import java.util.ArrayList;

public class IniPreguntas {

    public static void main( String[] args ) throws Exception {


        //////////PRIMERA PREGUNTA////////////

        //ArrayList de opciones para almacenar todas las posibles opciones:
        ArrayList<Opcion> opciones1 = new ArrayList<Opcion>();

        //Creamos todas las opciones indicando cuales son false y la única true
        Opcion resp1_preg1 = new Opcion("99", false);
        Opcion resp2_preg1 = new Opcion("100", false);
        Opcion resp3_preg1 = new Opcion("110", false);
        Opcion resp4_preg1 = new Opcion("116", true);

        //Almacenamos las opciones en el ArrayList
        opciones1.add(resp1_preg1);
        opciones1.add(resp2_preg1);
        opciones1.add(resp3_preg1);
        opciones1.add(resp4_preg1);

        //Creamos el objeto con el texto y las opciones del ArrayList e imprimimos
        Pregunta pregunta1 = new Pregunta("¿Cuánto duró la Guerra de los Cien Años?", opciones1);

        System.out.println(pregunta1);



        //////////SEGUNDA PREGUNTA////////////

        //ArrayList de opciones para almacenar todas las posibles opciones:
        ArrayList<Opcion> opciones2 = new ArrayList<Opcion>();

        //Creamos todas las opciones indicando cuales son false y la única true
        Opcion resp1_preg2 = new Opcion("Estonia", false);
        Opcion resp2_preg2 = new Opcion("Lituania", false);
        Opcion resp3_preg2 = new Opcion("Tallin", false);
        Opcion resp4_preg2 = new Opcion("Riga", true);

        //Almacenamos las opciones en el ArrayList
        opciones2.add(resp1_preg2);
        opciones2.add(resp2_preg2);
        opciones2.add(resp3_preg2);
        opciones2.add(resp4_preg2);

        //Creamos el objeto con el texto y las opciones del ArrayList e imprimimos
        Pregunta pregunta2 = new Pregunta(" ¿Cuál es la capital de Letonia?", opciones2);

        System.out.println(pregunta2);


        //////////TERCERA PREGUNTA////////////

        //ArrayList de opciones para almacenar todas las posibles opciones:
        ArrayList<Opcion> opciones3 = new ArrayList<Opcion>();

        //Creamos todas las opciones indicando cuales son false y la única true
        Opcion resp1_preg3 = new Opcion("Pablo Picasso", false);
        Opcion resp2_preg3 = new Opcion("Goya", false);
        Opcion resp3_preg3 = new Opcion("Munch", false);
        Opcion resp4_preg3 = new Opcion("Miguel Ángel", true);

        //Almacenamos las opciones en el ArrayList
        opciones3.add(resp1_preg3);
        opciones3.add(resp2_preg3);
        opciones3.add(resp3_preg3);
        opciones3.add(resp4_preg3);

        //Creamos el objeto con el texto y las opciones del ArrayList e imprimimos
        Pregunta pregunta3 = new Pregunta("¿Qué gran artista es conocido por haber pintado la Capilla Sixtina?", opciones3);

        System.out.println(pregunta3);



        PreguntaDAO preg = new PreguntaDAO();
        preg.almacenar(pregunta1);
        preg.almacenar(pregunta2);
        preg.almacenar(pregunta3);



    }

}
