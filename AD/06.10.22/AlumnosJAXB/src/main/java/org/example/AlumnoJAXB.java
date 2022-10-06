package org.example;


import javax.xml.bind.annotation.XmlElement;

public class AlumnoJAXB {

    private int id;
    private String nombre;
    private int edad;

    public AlumnoJAXB() {
    }

    public AlumnoJAXB(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    @XmlElement
    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    @XmlElement
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    @XmlElement
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "AlumnoJAXB{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}