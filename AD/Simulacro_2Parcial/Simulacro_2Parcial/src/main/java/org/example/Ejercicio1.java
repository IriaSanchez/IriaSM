package org.example;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio1
{
    public static void main( String[] args ) throws SQLException, ParseException {


        //Formateamos el timestamp
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("23/09/2007");
        long time = date.getTime();

        //Crear una instancia de la clase Servicios
        Servicio servicio = new Servicio();


        //Crear un nuevo objeto y le pasamos los datos
        Futbolista futbolista = new Futbolista("Messi","PSG",8,new Timestamp(time));
        //Llamar a método insertar para registrar objeto en BD
        //servicio.insertar(futbolista);

        //Comprobamos con un system el nº de id del futbolista insertado
        int id= servicio.insertar(futbolista);
        //System.out.println(id);

        //Imprimimimos el futbolista recuperandolo del objeto futbolista
        Futbolista futbolista1 = servicio.consultar(id);
        System.out.println(futbolista1);



        //Recuperar el objeto con método consultar e imprimirlo
        //Modificar alguno de sus atributos
        //Recuperar el objeto con método consultar el objeto e imprimirlo
        //Eliminar el objeto





    }

    public static Connection conectarBD() {
        String connectionURL =
                "jdbc:sqlserver://localhost:1433;"
                        + "database=pruebas;"
                        + "user=sa;"
                        + "password=ADMIN;"
                        + "encrypt=true;"
                        + "trustServerCertificate=true;"
                        + "loginTimeout=5;";

        try {
            Connection connection = DriverManager.getConnection(connectionURL);
            System.out.println("Conexión OK");
            return connection;

        } catch (SQLException e) {
            System.out.println("Conexión KO");
            throw new RuntimeException(e);
        }
    }



}
