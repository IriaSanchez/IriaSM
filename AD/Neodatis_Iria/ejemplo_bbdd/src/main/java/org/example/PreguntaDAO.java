package org.example;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.Objects;

import java.util.ArrayList;

public class PreguntaDAO {

    public void almacenar(Pregunta pregunta) throws Exception{


        ODB odb = null;

        try{
            //Abrimos bbdd o creamos si no existe
            odb = ODBFactory.open("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\bbdd_trivial.db");

            //Almacenamos
            odb.store(pregunta);



        } catch (Exception e) {
            throw new RuntimeException(e);

        } finally {
            if (odb != null){
                odb.close();
            }

        }


    }

    public ArrayList<Pregunta> listar() throws Exception {

        //Creamos un arraylist para listar
        ArrayList<Pregunta> listar = new ArrayList<Pregunta>();

        ODB odb = null;

        //la abrimos pasando la ruta
        try{
            odb = ODBFactory.open("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\bbdd_trivial.db");
            //Se crea un objeto preguntas y se recoge con get lo que haya en la clase Pregunta
            Objects preguntas = odb.getObjects((Pregunta.class));

            //listamos
            while (preguntas.hasNext()){

                listar.add((Pregunta) preguntas.next());

            }
        } finally {
            if (odb != null){
                odb.close();
            }
        }


        return listar;
    }

}


