package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

public class App
{
    public static void main( String[] args ) {

        String ruta = "C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\JSON\\\\MascotasJSON\\MascotasJSON.json";

        try {

            ArrayList <MascotasJSON> mascotas = leerJSON(ruta);
            String json = escribirJSON(mascotas);
            System.out.println(json);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList <MascotasJSON> leerJSON (String ruta) throws FileNotFoundException {

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        FileReader fr = new FileReader(ruta);
        MascotasJSON [] alumnos = gson.fromJson (fr, MascotasJSON[].class);

        return new ArrayList<MascotasJSON>(Arrays.asList(alumnos));
    }

    public static String escribirJSON (ArrayList <MascotasJSON> listaMascotas) throws FileNotFoundException{
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        String json = gson.toJson(listaMascotas);

        return json;
    }
}
