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


public class App {

    public static void main(String[] args) throws IOException, SAXException {

        ArrayList<Aventura> arrayAventura = new ArrayList<Aventura>();

        try {

            //Creamos la instancia de DocumentBuilderFactory y DocumentBuilder
            //SIEMPRE LAS MISMAS
            DocumentBuilderFactory fabricaCreadorDocumento = DocumentBuilderFactory.newInstance();
            DocumentBuilder creadorDocumento = fabricaCreadorDocumento.newDocumentBuilder();
            //Creamos instancia de Document indicando el fichero que debe parsear
            //Objeto de tipo documento donde le pasamos la ruta del documento xml en nuestro ordenador
            Document documento = (Document) creadorDocumento.parse("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Aventura\\Aventura_LCG.xml");
            //Obtener el elemento raiz del documento
            Element raiz = documento.getDocumentElement();
            documento.getDocumentElement().normalize();


            //Creamos el elemento aventura que es la raiz
            Element elementoAventura = (Element) raiz;
            //Dentro del elemento raiz aventura, sacamos el atributo título
            Node nodoTitulo = elementoAventura.getAttributeNode("titulo");
            //Imprimimos el titulo de la aventura
            String valTitulo = (nodoTitulo != null) ? nodoTitulo.getTextContent() : null;

            System.out.println("************************************");
            System.out.println( valTitulo);
            System.out.println("************************************");

            //Objeto aventura
            Aventura aventura = new Aventura(valTitulo, new ArrayList<Escena>());



            //De la lista de aventura, recogemos el elemento escena
            NodeList listaAventura = raiz.getElementsByTagName("escena");

            //Recorremos toda la listaAventura

          for (int i = 0; i < listaAventura.getLength(); i++) {


              //Creamos el nodo escena
              Node nodoEscena = listaAventura.item(i);
            //  System.out.println("Escena: " + i);

              //Creamos el elemento escena
              Element elementoEscena = (Element) nodoEscena;

              //Dentro del elemento escena, sacamos el atributo codigo
              Node nodoCodigo = elementoEscena.getAttributeNode("codigo");
              //Imprimimos el código de la aventura
              String valCodigo = (nodoCodigo != null) ? nodoCodigo.getTextContent() : null;
            //  System.out.println("Codigo: " + valCodigo);


              //Creamos la lista de todos los datos del elemento del nodo escena
              NodeList datosAventura = nodoEscena.getChildNodes();

              //Dentro del elemento escena, sacamos el elemento texto
              Node nodoTexto = elementoEscena.getElementsByTagName("texto").item(0);
              String valTexto = (nodoTexto != null) ? nodoTexto.getTextContent() : null;
              System.out.println("//////////////////////////////////////////////////");
              System.out.println("Texto: " +valTexto);
              System.out.println("//////////////////////////////////////////////////");




              //De la lista de escena, recogemos el elemento opcion
              NodeList listaOpciones = elementoEscena.getElementsByTagName("opcion");

              ArrayList<Opciones> opciones = new ArrayList<Opciones>();
              //Recorremos la lista de opciones
              for (int x = 0; x < listaOpciones.getLength(); x++) {

                  //Creamos el nodo opcion
                  Node nodoOpcion = listaOpciones.item(x);
                  //Creamos el elemento opciones
                  Element elementoOpciones = (Element) nodoOpcion;

                  //Creamos el nodo OpcionUsuario
                  Node nodoOpcionUsuario = elementoOpciones.getAttributeNode("OpcionUsuario");
                  String valOpcionUsuario = (nodoOpcionUsuario != null) ? nodoOpcionUsuario.getTextContent() : null;



                  //Creamos el nodo texto
                  Node nodoTexto2 = elementoOpciones.getAttributeNode("texto");
                  String valTexto2 = (nodoTexto2 != null) ? nodoTexto2.getTextContent() : null;
                  System.out.println("Opción: " + valOpcionUsuario +": " +valTexto2);


                  //Creamos el nodo resultado
                  Node nodoResultado = elementoOpciones.getAttributeNode("resultado");
                  String valResultado = (nodoResultado != null) ? nodoResultado.getTextContent() : null;
                 // System.out.println("Resultado: " + valResultado);

              }

              //Objeto de escena
              Escena escena = new Escena(Integer.parseInt(valCodigo) ,valTexto, opciones);
          }

            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }



