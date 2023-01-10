package org.example;

import java.io.Serializable;

public class Piloto implements Serializable {

    private int numero;
    private String apodo;
    private double altura;

    public Piloto() {
    }

    public Piloto(int numero, String apodo, double altura) {
        this.numero = numero;
        this.apodo = apodo;
        this.altura = altura;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "numero=" + numero +
                ", apodo='" + apodo + '\'' +
                ", altura=" + altura +
                '}';
    }
}
