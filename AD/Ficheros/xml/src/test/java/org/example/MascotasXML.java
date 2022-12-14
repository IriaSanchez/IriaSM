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
import java.util.ArrayList;

public class MascotasXML {

    


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
            //Obtener la lista de nodos con NodeList que tiene etiqueta "mascotas"
            NodeList listaMascotas = raiz.getElementsByTagName("mascota");


            //Creemos un nuevo ArrayList
            ArrayList <Mascota> arrayMascotas = new ArrayList<Mascota>();

            //Recorremos la colección
            for ( int i = 0; i<listaMascotas.getLength(); i++) {

                //Obtener datos de una mascota
                Node mascota = listaMascotas.item(i);

                NodeList datosMascota = mascota.getChildNodes();




                //Recuperar el dato nombre
                Element elemento = (Element) mascota;
                Node nodoNombre = elemento.getAttributeNode("Nombre");
                String valNombre = nodoNombre.getTextContent();
                System.out.println("Nombre = " + valNombre);

                //Recuperar el dato tipo
                Node nodoTipo = elemento.getElementsByTagName("tipo").item(0);
                String valTipo = nodoTipo.getTextContent();
                System.out.println("Tipo = "+valTipo);

                //Recuperar el dato edad
                Node nodoEdad = elemento.getElementsByTagName("edad").item(0);
                String valEdad = nodoEdad.getTextContent();
                System.out.println("Edad = "+valEdad);

                //Recuperar el dato genero
                Node nodoGenero = elemento.getElementsByTagName("genero").item(0);
                String valGenero = "";

                //Le indicamos que si no aparece género, saque un mensaje por consola
                if (nodoGenero == null){

                    System.out.println("No tiene género");
                //De lo contrario, muestra el género
                }else {
                    valGenero = nodoGenero.getTextContent();
                    System.out.println("Genero = " + valGenero);

                }





                //Se crea un nuevo objeto de tipo Mascota
                Mascota objeto = new Mascota(valNombre, valTipo, valEdad, valGenero);
                //Se van añadiendo datos al nuevo arraylist (arrayMascotas)
                arrayMascotas.add(objeto);

            }
            for(Mascota objeto : arrayMascotas){

                //Buscamos a Churchill y le modificamos el género
                if (objeto.getNombre().equals("Churchill")){
                    objeto.setGenero("Macho");
                }

            }

            //Se crea la mascota Leo y se añade a la lista

            Mascota mascota = new Mascota();
            mascota.setNombre("Leo");
            mascota.setTipo("Gato");

            //Se añade
            arrayMascotas.add(mascota);

            //Recorremos el array e imprimimos
            for(Mascota objeto : arrayMascotas){


            System.out.println(objeto);
        }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }
    }
}
