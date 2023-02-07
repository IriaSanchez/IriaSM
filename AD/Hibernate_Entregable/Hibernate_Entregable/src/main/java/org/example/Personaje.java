package org.example;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Personajes")

public class Personaje implements Serializable {

    private int id;
    private String personaje;
    private String apodo;
    private boolean estudianteDeHogwarts;
    private String casaDeHogwarts;
    private String interpretadoPor;

    public Personaje() {
    }

    public Personaje(int id, String personaje, String apodo, boolean estudianteDeHogwarts, String casaDeHogwarts, String interpretadoPor) {
        this.id = id;
        this.personaje = personaje;
        this.apodo = apodo;
        this.estudianteDeHogwarts = estudianteDeHogwarts;
        this.casaDeHogwarts = casaDeHogwarts;
        this.interpretadoPor = interpretadoPor;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getPersonaje() {
        return personaje;
    }

    public void setPersonaje(String personaje) {
        this.personaje = personaje;
    }

    @Column
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    @Column
    public boolean isEstudianteDeHogwarts() {
        return estudianteDeHogwarts;
    }

    public void setEstudianteDeHogwarts(boolean estudianteDeHogwarts) {
        this.estudianteDeHogwarts = estudianteDeHogwarts;
    }

    @Column
    public String getCasaDeHogwarts() {
        return casaDeHogwarts;
    }

    public void setCasaDeHogwarts(String casaDeHogwarts) {
        this.casaDeHogwarts = casaDeHogwarts;
    }

    @Column
    public String getInterpretadoPor() {
        return interpretadoPor;
    }

    public void setInterpretadoPor(String interpretadoPor) {
        this.interpretadoPor = interpretadoPor;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "id=" + id +
                ", personaje='" + personaje + '\'' +
                ", apodo='" + apodo + '\'' +
                ", estudianteDeHogwarts=" + estudianteDeHogwarts +
                ", casaDeHogwarts='" + casaDeHogwarts + '\'' +
                ", interpretadoPor='" + interpretadoPor + '\'' +
                '}';
    }
}

