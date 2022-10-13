package org.example;

import java.util.ArrayList;

public class Escena {

    private int codigo;
    private String texto;
    ArrayList<Opciones> opciones = new ArrayList<Opciones>();

    public Escena() {
    }

    public Escena(int codigo, String texto, ArrayList<Opciones> opciones) {
        this.codigo = codigo;
        this.texto = texto;
        this.opciones = opciones;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Opciones> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opciones> opciones) {
        this.opciones = opciones;
    }

    @Override
    public String toString() {
        return "Escena{" +
                "codigo=" + codigo +
                ", texto='" + texto + '\'' +
                ", opciones=" + opciones +
                '}';
    }
}