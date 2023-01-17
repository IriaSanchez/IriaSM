package org.example;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;

public class App {

    public static void main( String[] args ) {

        leerXML();

    }

    public static  Location  leerXML(){

        File fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Entregable_JDBC_Iria\\es.xml");
        Location location = new Location();


        try {
            if (fichero.exists()) {
                JAXBContext context = JAXBContext.newInstance(Location.class);
                Unmarshaller unmarshaller = context.createUnmarshaller();

                Location lista = (Location) unmarshaller.unmarshal(fichero);

                if(lista != null) {
                    location.getCountryRegion();
                }

                System.out.println(location);
            }else {
                System.out.println("Fichero no encontrado");
            }
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
