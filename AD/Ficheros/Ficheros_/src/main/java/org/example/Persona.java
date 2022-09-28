package org.example;

import java.io.Serializable;

public class Persona implements Serializable {
    // Atributos
    private String nombre;
    private String apellidos;
    private String fecha;

    public Persona(String nombre, String apellidos, String fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fecha = fecha;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    // Metodo para llamarlo en vez de usar System.out.println();, imprime por consola
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}