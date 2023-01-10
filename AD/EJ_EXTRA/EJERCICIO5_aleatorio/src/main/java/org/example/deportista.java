package org.example;

public class deportista {



//    Nota: Un deportista se compone de los siguientes atributos:
//
//    Nombre (String de longitud fija de 25 caracteres), cada caracter ocupa 2 bytes, entonces ocupan 50
//    Edad (int) ocupa 4 bytes
//    Salario en millones (double) ocupa 8 bytes
//    Ingresos por publicidad en millones (double) ocupa 8 bytes

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
