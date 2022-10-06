package org.example;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio {

    public static void main(String[] args ) throws JAXBException {

        File file = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\alumnos.xml");
        ArrayList<AlumnoJAXB> alumnos = new ArrayList<AlumnoJAXB>();

        if(file.exists()){

            JAXBContext jaxbContext = JAXBContext.newInstance(Alumnos.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Alumnos listaAlumnos = (Alumnos) jaxbUnmarshaller.unmarshal(file);
            alumnos = (listaAlumnos !=null ? listaAlumnos.getListaAlumnos() : new ArrayList<AlumnoJAXB>());

        }else {
            System.out.println("No se ha podido encontrar el fichero indicado");
        }
        System.out.println(alumnos);
    }



        private static void realizarGuardadoXML(ArrayList <AlumnoJAXB> alumnos, String ruta) throws JAXBException, IOException{

        File file = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\alumnos.xml");

            if (!file.exists()) {
                file.createNewFile();

            }
            JAXBContext jaxbContext = JAXBContext.newInstance(Alumnos.class);
            Marshaller jasbMarshaller = jaxbContext.createMarshaller();

            jasbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            Alumnos al = new Alumnos();
            al.setListaAlumnos(alumnos);
            jasbMarshaller.marshal(al,file);
        }

    }

