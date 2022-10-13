package org.example;

public class deportista {

    //Atributos
    static String nombre;
    private static int edad;
    static double salario;
    static double publicidad;

    //Constructor vacío
    public deportista() {
    }

    //Constructores
    public deportista(String nombre, int edad, double salario, double publicidad) {

        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.publicidad = publicidad;
    }

    //Getters y setters:


    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(double publicidad) {
        this.publicidad = publicidad;
    }
}
