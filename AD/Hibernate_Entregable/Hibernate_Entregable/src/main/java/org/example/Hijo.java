package org.example;
import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;

@Entity
@Table(name = "hijo")
public class Hijo implements Serializable {

    private int id;
    private String nombre;
    private int idPersonaje;

    public Hijo() {
    }

    public Hijo(int id, String nombre, int idPersonaje) {
        this.id = id;
        this.nombre = nombre;
        this.idPersonaje = idPersonaje;
    }

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   @Column
    public int getIdPersonaje() {
        return idPersonaje;
    }

    public void setIdPersonaje(int idPersonaje) {
        this.idPersonaje = idPersonaje;
    }

    @Override
    public String toString() {
        return "Hijo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", idPersonaje=" + idPersonaje +
                '}';
    }
}
