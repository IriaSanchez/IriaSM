package org.example;

//Creamos la clase Alumno:
public class Alumno {


    //Atributos:
    private String Nombre;
    private int Edad;
    private double NotaMedia;

    //Constructor vacío
    public Alumno() {
    }

    //Constructores
    public Alumno(String nombre, int edad, double notaMedia) {
        Nombre = nombre;
        Edad = edad;
        NotaMedia = notaMedia;
    }

    //Get y set

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public double getNotaMedia() {
        return NotaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        NotaMedia = notaMedia;
    }
}