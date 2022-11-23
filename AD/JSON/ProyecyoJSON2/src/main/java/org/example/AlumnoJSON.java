package org.example;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AlumnoJSON {
    @Expose(serialize = false, deserialize = true)

    private int id;

    @SerializedName("nombre")
    @Expose
    private String nombre;

    @Expose
    private int edad;

}
