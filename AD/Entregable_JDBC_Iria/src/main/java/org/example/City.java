package org.example;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class City {

    private String Nombre;
    private String Code;

    public City() {
    }

    public City(String nombre, String code) {
        Nombre = nombre;
        Code = code;
    }

    @XmlAttribute(name = "Name")
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    @XmlAttribute(name = "Code")
    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    @Override
    public String toString() {
        return "City{" +
                "Nombre='" + Nombre + '\'' +
                ", Code='" + Code + '\'' +
                '}';
    }
}
