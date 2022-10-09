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

            for ( int i = 0; i<listaPeliculas.getLength(); i++){

                Node titulo = listaPeliculas.item(i);

                NodeList datosPeliculas = titulo.getChildNodes();

                Element elemTitulo = (Element) titulo;

                //NODO titulo
                Node nodoTitulo = elemTitulo.getElementsByTagName("titulo").item(0);
                String valTitulo = nodoTitulo.getTextContent();
                System.out.println(valTitulo);


                //DEL NODO titulo sacamos el atributo idioma

                if (nodoTitulo.getNodeType() == Node.ELEMENT_NODE){

                    Element elem = (Element) nodoTitulo;
                    String valNombre = elem.getAttribute("idioma");

                    System.out.println(valNombre);
                }


                //DEL NODO pelicula SACAMOS categoria

//                if (nodoPelicula.getNodeType() == Node.ELEMENT_NODE){
//
//                    Element elem2 = (Element) nodoPelicula;
//                    String valNombre2 = elem2.getAttribute("categoría");
//
//                    System.out.println(valNombre2);
//                }


            }

            } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
