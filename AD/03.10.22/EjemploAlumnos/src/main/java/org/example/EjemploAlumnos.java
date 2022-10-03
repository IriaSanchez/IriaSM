package org.example;


import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

import java.util.ArrayList;

public class EjemploAlumnos
{
    public static void main( String[] args ) {

        try {
            //Con XMLReader implementamos un lector
            XMLReader lector = XMLReaderFactory.createXMLReader();
            //Se crea un parseador llamado parser
            ParseadorAlumnosSAX parser = new ParseadorAlumnosSAX();
            //Se le pide que lea el fichero e indicamos ubicacion
            lector.setContentHandler(parser);
            InputSource fichero = new InputSource("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\alumnos.xml");
            lector.parse(fichero);

            ArrayList <Alumno> lista = parser.obtenerResultado();
            System.out.println(lista);

        }catch (Exception ex){
            System.out.println("Excepción en el procesamiento del XML");
            ex.printStackTrace();
        }
    }
}
