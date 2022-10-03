package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class MascotasEscritura {


    public static void main(String[] args) throws IOException, SAXException {

        try {

            //Creamos la instancia de DocumentBuilderFactory y DocumentBuilder
            //SIEMPRE LAS MISMAS
            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();

            //Creamos instancia de Document indicando el fichero que debe parsear
            //Objeto de tipo documento donde le pasamos la ruta del docuemnto xml en nuestro ordenador
            Document documento = (Document) creadorDocumento.parse("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\29.09.22\\Mascotas.xml");




            //Obtener el elemento raiz del documento
            Element raiz = documento.getDocumentElement();

            //Crear nuevo elemento mascota
            Element emascota =  documento.createElement("mascota");
            //Le indicamos que cuelgue del elemento raiz
            raiz.appendChild(emascota);

               //Creamos el atributo de mascota, que será Nombre="Leo"
               emascota.setAttribute("Nombre", "Leo");

                        //Crear nuevo elemento tipo que cuelga de mascota, que cuelga de mascotas(raiz)
                        Element etipo = documento.createElement("tipo");
                        //Al tipo le añado el texto "gato"
                        etipo.appendChild(documento.createTextNode("gato"));
                        //Tiene que colgar del elemento mascota
                        emascota.appendChild(etipo);



                        //Crear nuevo elemento edad que cuelga de mascota, que cuelga de mascotas(raiz)
                        Element eedad = documento.createElement("edad");
                        //A la edad le añado el texto "6"
                        eedad.appendChild(documento.createTextNode("6"));
                        //Tiene que colgar del elemento mascota
                        emascota.appendChild(eedad);



                        //Crear nuevo elemento genero que cuelga de mascota, que cuelga de mascotas(raiz)
                        Element egenero = documento.createElement("genero");
                        //Al genero le añado el texto "macho"
                        egenero.appendChild(documento.createTextNode("macho"));
                        //Tiene que colgar del elemento mascota
                        emascota.appendChild(egenero);



                        //Pasamos los cambios al documento fisico
                        TransformerFactory transformerFactory = TransformerFactory.newInstance();
                        Transformer transformer = transformerFactory.newTransformer();
                        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
                        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "3");
                        DOMSource domSource = new DOMSource(documento);
                        StreamResult result = new StreamResult(new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\29.09.22\\MascotasCopia.xml"));
                        transformer.transform(domSource,result);










        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }


    }
}

