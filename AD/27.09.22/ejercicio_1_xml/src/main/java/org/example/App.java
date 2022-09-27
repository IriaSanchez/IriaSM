package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class App {
    public static void main(String[] args) {


        try {

            //Creamos la instancia de DocumentBuilderFactory y DocumentBuilder
            //SIEMPRE LAS MISMAS
            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();

            ///////////////////////////////////////////////////////////////////////////

            //Creamos instancia de Document indicando el fichero que debe parsear
            //Objeto de tipo documento donde le pasamos la ruta del docuemnto xml en nuestro ordenador
            Document documento = (Document) creadorDocumento.parse("C:\\Users\\pedro\\OneDrive\\Documentos\\GitHub\\IriaSM\\AD\\27.09.22\\Peliculas.xml");


            //Obtener el elemento raiz del documento
            Element raiz = documento.getDocumentElement();
            // Para poder mostrarlo por pantalla uso el método .getTagName para obtener el elemento raiz (PELICULAS)
            System.out.println(raiz.getTagName());



            //Obtener la lista de nodos con NodeList que tiene etiqueta "PELICULAS"
            NodeList listaPeliculas = raiz.getElementsByTagName("PELICULAS");

            // Para poder recoger estas etiquetas que hemos seleccionado y poder ver sus hijos, hacemos primero un bucle for
            // que recoge en un elemento Node a los "PELICULA" que hay, en este caso hay 2, para luego en el segundo bucle for
            // que hacemos poder recoger los hijos de cada "PELICULA" y finalmente mostrar el contenido de los último por
            // pantalla.


            for ( int i = 0; i< listaPeliculas.getLength(); i++) {

                //Obtener datos de una película
                Node pelicula = listaPeliculas.item(i);

                // Será i+1 porque es index0 y no me interesa que diga Pelicula 0, sino que comience en Pelicula 1
                System.out.println("Pelicula "+(i+1));
                //Obtener la lista de los datos que contiene esa película (nombre, director, actor)
                NodeList datosPelicula = pelicula.getChildNodes();

                //Recuperar un dato concreto de pelicula
                Element elemento = (Element) pelicula;
                Node nodoNombre = elemento.getElementsByTagName("NOMBRE").item(0);
                String valNombre = nodoNombre.getTextContent();
                System.out.println("Nombre = "+valNombre);

                //Recorrer la lista de todos los datos que contiene la pelicula
                for (int j = 0; j<datosPelicula.getLength(); j++) {

                    //Obtener de la lista de datos un dato tras otro
                    Node dato = datosPelicula.item(j);

                    // Antes de poder obtener el texto, se comprueba si es un NODE ELEMENT o si es un NODE TEXT
                    // Este if evita errores en el caso de que el elemento que
                    // viene despues no sea de tipo ELEMENT sino que sea un Texto,
                    // aunque en nuestro caso no es así

                    if (dato.getNodeType() == Node.ELEMENT_NODE){

                        //Mostrar el nombre del tipo de dato
                        System.out.println(dato.getNodeName()+": ");

                        //El valor está contenido en un hijo del nodo Element
                        Node datoContenido =dato.getFirstChild();

                        //Mostrar el valor contenido en el nodo, que debe ser de tipo Text
                        if (datoContenido!=null && datoContenido.getNodeType()== Node.TEXT_NODE)
                            System.out.println(datoContenido.getNodeValue());
                    }
                }
                //Se deja un salto de línea de separacion entre cada pelicula
                System.out.println();
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}


