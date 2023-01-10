package org.example;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class EJ7_XML {

    public static void main(String[] args) throws IOException, SAXException {

        try {

            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
            Document documento = (Document) creadorDocumento.parse("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\EJ_EXTRA\\EJERCICIO7_XML\\Peliculas.xml");

            Element raiz = documento.getDocumentElement();
            NodeList listaPeliculas = raiz.getElementsByTagName("pelicula");

            //Recorremos la lista de peliculas

            for ( int i = 0; i<listaPeliculas.getLength(); i++){

                //DEL NODO pelicula SACAMOS categoria

                Node pelicula = listaPeliculas.item(i);

                if (pelicula.getNodeType() == Node.ELEMENT_NODE){
                    Element elem2 = (Element) pelicula;
                    String valNombre2 = elem2.getAttribute("categoria");



                //DEL NODO datosPeliculas SACAMOS el título

                NodeList datosPeliculas = pelicula.getChildNodes();

                Element elemTitulo = (Element) pelicula;

                //NODO titulo
                Node nodoTitulo = elemTitulo.getElementsByTagName("titulo").item(0);
                String valTitulo = nodoTitulo.getTextContent();


                //DEL NODO titulo sacamos el atributo idioma

                if (nodoTitulo.getNodeType() == Node.ELEMENT_NODE){

                    Element elem = (Element) nodoTitulo;
                    String valNombre = elem.getAttribute("idioma");

                System.out.println(valTitulo+" - " +valNombre2+" - " +valNombre);

                }
            }
            }

            } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
