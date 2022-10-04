package org.example;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class ParseadorMascotasSAX extends DefaultHandler {
    private ArrayList <Mascota> listado;
    private Mascota mascota;
    private String valorElemento;

    enum tiposNodo{
        MASCOTA,
        TIPO,
        EDAD,
        GENERO
    }

    public ParseadorMascotasSAX(){

        super();
    }

    @Override
    public void startDocument() throws SAXException{
        listado = new ArrayList<Mascota>();
    }
    @Override

    public void startElement (String uri, String localName, String qName, Attributes attributes) {
        if (localName != null) {
            switch (tiposNodo.valueOf(localName.toUpperCase())) {

                case MASCOTA:
                    mascota = new Mascota();
                    String nombre = attributes.getValue("Nombre");

                    if (nombre != null) {
                        mascota.setNombre(nombre);
                    }
                    break;
            }
        }
    }

    @Override

    public void endElement (String uri, String localName, String qName) throws SAXException{

        if (localName != null){

            switch (tiposNodo.valueOf(localName.toUpperCase())){

                case MASCOTA:
                    listado.add(mascota);
                    break;
                case TIPO:
                    mascota.setTipo(valorElemento);
                    break;
                case EDAD:
                    mascota.setEdad(String.valueOf(Integer.parseInt(valorElemento)));
                    break;
                case GENERO:
                    mascota.setGenero (valorElemento);
                    break;
            }
        }
    }

    @Override
    public void characters (char[] ch, int start, int length) throws SAXException{
        valorElemento = new String(ch,start,length);
    }
    public ArrayList <Mascota> obtenerResultado (){
        return listado;
    }
}
