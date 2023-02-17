package org.example;

import java.io.Serializable;

public class Empleado implements Serializable {

    private int id;
    private String nombre;
    private int edad;
    private float salarioFijo;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, float salarioFijo) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioFijo = salarioFijo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(float salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salarioFijo=" + salarioFijo +
                '}';
    }
}
