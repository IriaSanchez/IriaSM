package org.example;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

//Es la clase por la que va a entrar indicandole el elemento raiz de nuestro xml(el principal)
@XmlRootElement(name = "listaAlumnos")
public class Alumnos {

    //dentro del elemento listaalumnos hay un arraylist
    private ArrayList <AlumnoJAXB> listaAlumnos;

    //se crean getters y setters
    public ArrayList<AlumnoJAXB> getListaAlumnos() {
        return listaAlumnos;
    }

    //Le indicamos que necesitamos que cargue cuando encuentre la etiqueta alumno
    @XmlElement(name = "alumno")
    public void setListaAlumnos(ArrayList <AlumnoJAXB> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }
}