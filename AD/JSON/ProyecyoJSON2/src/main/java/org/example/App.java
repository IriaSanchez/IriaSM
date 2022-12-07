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

        String ruta = "C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\JSON\\ProyecyoJSON2\\JSON.json";

        try {

            ArrayList <AlumnoJSON> alumnos = leerJSON(ruta);
            String json = escribirJSON(alumnos);
            System.out.println(json);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static ArrayList <AlumnoJSON> leerJSON (String ruta) throws FileNotFoundException {

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        FileReader fr = new FileReader(ruta);
        AlumnoJSON [] alumnos = gson.fromJson (fr, AlumnoJSON[].class);

        return new ArrayList<AlumnoJSON>(Arrays.asList(alumnos));
    }

    public static String escribirJSON (ArrayList <AlumnoJSON> listaAlumnos) throws FileNotFoundException{
        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create();
        String json = gson.toJson(listaAlumnos);

        return json;
    }
}
