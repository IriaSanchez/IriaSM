package org.example;

import java.io.Serializable;

public class Subtarea implements Serializable {

    private int id;
    private int idTarea;
    private String nombre;
    private Tarea tarea;




    public Subtarea() {
    }

    public Subtarea(int id, int idTarea, String nombre) {
        this.id = id;
        this.idTarea = idTarea;
        this.nombre = nombre;
    }

    public Subtarea(int idTarea, String nombre) {
        this.idTarea = idTarea;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdTarea() {
        return idTarea;
    }

    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public String toString() {
        return "Subtarea{" +
                "id=" + id +
                ", idTarea=" + idTarea +
                ", nombre='" + nombre + '\'' +
                ", tarea=" + tarea +
                '}';
    }
}
