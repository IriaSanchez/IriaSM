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


public class App {

    public static void main(String[] args) throws IOException, SAXException {

        try {

            //Creamos la instancia de DocumentBuilderFactory y DocumentBuilder
            //SIEMPRE LAS MISMAS
            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();

            //Creamos instancia de Document indicando el fichero que debe parsear
            //Objeto de tipo documento donde le pasamos la ruta del documento xml en nuestro ordenador

            Document documento = (Document) creadorDocumento.parse("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Aventura\\Aventura_La_Coruña.xml");

            //Obtener el elemento raiz del documento
            Element raiz = documento.getDocumentElement();
            NodeList listaAventura = raiz.getElementsByTagName("aventura");
            System.out.println(listaAventura);



        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);


        }
    }
}