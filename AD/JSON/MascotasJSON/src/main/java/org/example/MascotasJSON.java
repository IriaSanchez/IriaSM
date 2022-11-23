package org.example;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MascotasJSON {

    @Expose (serialize = false, deserialize = true)

    @SerializedName("Nombre")
    private String nombre;

    @SerializedName("tipo")
    @Expose
    private String tipo;

    @SerializedName("edad")
    @Expose
    private int edad;

    @SerializedName("genero")
    @Expose
    private String genero;


}



