package org.example;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.IOException;

public class Ejercicio2 {

    public static void main( String[] args ) throws IOException, SAXException {

        leerXML("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Examen_AD_Iria_Sanchez\\Examen_AD_Iria_Sanchez\\Ejercicio2.XML");

    }

        private static void leerXML(String ruta){


            try {

            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
            Document documento = (Document) creadorDocumento.parse("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Examen_AD_Iria_Sanchez\\Examen_AD_Iria_Sanchez\\Ejercicio2.XML");

            documento.getDocumentElement().normalize();

            Element raiz = documento.getDocumentElement();
            NodeList listaVolcanes = raiz.getElementsByTagName("volcan");

            //Recorremos la lista de volcanes

            for (int i = 0; i < listaVolcanes.getLength(); i++) {

                //DEL NODO volcan SACAMOS Nombre y Clasificacion

                Node volcan = listaVolcanes.item(i);

                if (volcan.getNodeType() == Node.ELEMENT_NODE) {

                    Element elemNombre = (Element) volcan;
                    String valNombre = elemNombre.getAttribute("Nombre");
                    Element elemCla = (Element) volcan;
                    String valCla = elemCla.getAttribute("Clasificacion");


                    //DEL NODO datosVolcanes SACAMOS la altura

                    NodeList datosVolcanes = volcan.getChildNodes();

                    Element elemAltura = (Element) volcan;

                    //NODO altura
                    Node nodoAltura = elemAltura.getElementsByTagName("altura").item(0);
                    String valAltura = nodoAltura.getTextContent();

                    System.out.println(valNombre+" - " +valCla+" - " +valAltura);

                }
            }

        } catch (Exception e) {
                e.printStackTrace();
        }


    }

}
