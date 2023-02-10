package org.example;
import java.sql.Timestamp;

public class Futbolista {

    private int id;
    private String nombre;
    private String club;
    private float media;
    private Timestamp ultimoPartido;

    public Futbolista() {
    }

    public Futbolista(String nombre, String club, float media, Timestamp ultimoPartido) {
        this.nombre = nombre;
        this.club = club;
        this.media = media;
        this.ultimoPartido = ultimoPartido;
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

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public Timestamp getUltimo_partido() {
        return ultimoPartido;
    }

    public void setUltimo_partido(Timestamp ultimo_partido) {
        this.ultimoPartido = ultimo_partido;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", club='" + club + '\'' +
                ", media=" + media +
                ", ultimoPartido=" + ultimoPartido +
                '}';
    }
}
