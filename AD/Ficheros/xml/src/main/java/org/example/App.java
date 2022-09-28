package org.example;


import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class App
{
    public static void main( String[] args ) {


        try {

            //Creamos la instancia de DocumentBuilderFactory
            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            //Creamos instancia de DocumentBuilder
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
            //Creamos instancia de Document indicando el fichero que debe parsear
            Document documento = (Document) creadorDocumento.parse("C:\\Users\\FP\\Desktop\\AccesoADatos\\empleados.xml");
            //Obtener el elemento raiz del documento
            Element raiz = documento.get



        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
