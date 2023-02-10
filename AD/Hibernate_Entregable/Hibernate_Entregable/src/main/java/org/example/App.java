package org.example;

import com.google.gson.Gson;
import com.google.gson.JsonArray;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class App
{
    public static void main( String[] args ) {
        HttpURLConnection connection = null;
        OutputStreamWriter wr = null;
        String line = null;

        try {
            // LLamar a API
            URL serverAddress = new URL("https://harry-potter-api.onrender.com/personajes");
            connection = (HttpURLConnection) serverAddress.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setReadTimeout(10000);
            connection.connect();

            // Leer resultados API
            BufferedReader rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();

            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }

            // Formatear resultados API
            JsonArray objetoJson = new Gson().fromJson(sb.toString(), JsonArray.class);


            for(int i = 0; i<objetoJson.size();i++){

                //Objeto personaje
                Personaje personaje = new Personaje();

                //Recogemos los datos del personaje,apodo,etc;
                personaje.setPersonaje(objetoJson.get(i).getAsJsonObject().get("personaje").getAsString());
                personaje.setApodo(objetoJson.get(i).getAsJsonObject().get("apodo").getAsString());
                personaje.setEstudianteDeHogwarts(objetoJson.get(i).getAsJsonObject().get("estudianteDeHogwarts").getAsBoolean());
                personaje.setCasaDeHogwarts(objetoJson.get(i).getAsJsonObject().get("casaDeHogwarts").getAsString());
                personaje.setInterpretadoPor(objetoJson.get(i).getAsJsonObject().get("interpretado_por").getAsString());

                //Llamamos al método
                crearPersonaje(personaje);


                //Formateamos resultados de los hijos
                JsonArray hijos = objetoJson.get(i).getAsJsonObject().get("hijos").getAsJsonArray();

                for (int j = 0; j < hijos.size();j++){

                    //Objeto hijo
                    Hijo hijo = new Hijo();
                    hijo.setNombre(hijos.get(j).getAsString());
                    hijo.setIdPersonaje(personaje.getId());

                    //Llamamos al método
                    crearHijo(hijo);

                }
            }



            leerPersonaje();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            connection.disconnect();
        }
    }

    public static void leerPersonaje(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();

        Personaje personaje = session.get(Personaje.class,1);
        System.out.println(personaje);
        transaction.commit();

    }


    public static void crearPersonaje(Personaje personaje) {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(personaje);
        //Finaliza la transacción
        transaction.commit();
        //HibernateUtil.closeSessionFactory();

    }

    public static void crearHijo(Hijo hijo) {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(hijo);
        //Finaliza la transacción
        transaction.commit();
        //HibernateUtil.closeSessionFactory();

    }
    }