package org.example;

import java.sql.*;

public class App {
    public static void main(String[] args) throws SQLException {

        buscarJugadores();
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


    public static void crearTabla() throws SQLException {
        Connection c = conectarBD();
        Statement s = null;

        try {
            s = c.createStatement();
            String sentenciaDDL =
                    "CREATE TABLE Jugadores("
                            + "id int IDENTITY(1,1) PRIMARY KEY,"
                            + "nombre varchar(20) NOT NULL,"
                            + "dorsal int NOT NULL)";
            s.executeUpdate(sentenciaDDL);
            System.out.println("Crear tabla OK");
        } catch (SQLException e) {
            System.out.println("Crear tabla KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }

    public static void anhadirCampo() throws SQLException {

        Connection c = conectarBD();
        Statement s = null;

        try {
            s = c.createStatement();
            String anhadirCampo =
                    "ALTER TABLE Jugadores ADD Equipo VARCHAR(20)";
            s.executeUpdate(anhadirCampo);
            System.out.println("Crear campo OK");
        } catch (SQLException e) {
            System.out.println("Crear campo KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }


    public static void insertarJugador() throws SQLException {

        Connection c = conectarBD();
        PreparedStatement s = null;

        try {
            s = c.prepareStatement("INSERT INTO Jugadores (nombre,dorsal,Equipo) VALUES (?,?,?) ");
            s.setString(1, "Lucas");
            s.setInt(2, 7);
            s.setString(3, "Deportivo");
            s.executeUpdate();
            System.out.println("Insertar jugador OK");
        } catch (SQLException e) {
            System.out.println("Insertar jugador KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }


    public static void eliminarCampo() throws SQLException {

        Connection c = conectarBD();
        PreparedStatement s = null;

        try {
            s = c.prepareStatement("DELETE FROM Jugadores WHERE nombre = ?");
            s.setString(1, "Lucas");

            s.executeUpdate();
            System.out.println("Eliminar jugador OK");
        } catch (SQLException e) {
            System.out.println("Eliminar jugador KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }

    public static void modificarCampo() throws SQLException {

        Connection c = conectarBD();
        PreparedStatement s = null;

        try {
            s = c.prepareStatement("UPDATE Jugadores SET dorsal = ? WHERE nombre = ?");
            s.setInt(1, 10);
            s.setString(2, "Lucas");


            s.executeUpdate();
            System.out.println("Modificar jugador OK");
        } catch (SQLException e) {
            System.out.println("Modificar jugador KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }


    public static void buscarJugadores() throws SQLException {

       // Connection c = conectarBD();
        Connection c = ConexionHikari.obtenerConexion();
        PreparedStatement s = null;

        try {
            s = c.prepareStatement("SELECT * FROM Jugadores WHERE nombre = ?");
            s.setString(1, "Lucas");
            ResultSet res = s.executeQuery();
            while (res.next()) {
                String impresion = "ID="
                        + res.getInt("id")
                        + ", Nombre="
                        + res.getString("nombre");
                System.out.println(impresion);
            }
        } catch (SQLException e) {
            System.out.println("Consulta KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }

    public static void llamarProcedimiento() throws SQLException {

        Connection c = conectarBD();
        CallableStatement s = null;

        try {
            s = c.prepareCall("{call obtenerJugadores(?)}");
            s.setString(1, "Lucas");
            ResultSet res = s.executeQuery();

            while (res.next()) {
                String impresion =

                        "ID = "
                                + res.getInt("id")

                                + ",Nombre = "
                                + res.getString("nombre");
                System.out.println(impresion);
            }
        } catch (SQLException e) {
            System.out.println("Consulta KO");
            throw new RuntimeException(e);

        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }

    public static void modificarProcedimiento() throws SQLException {

        Connection c = conectarBD();
        CallableStatement s = null;

        try {
            s = c.prepareCall("{call ficharJugadores(?,?)}");
            s.setString(1, "Lucas");
            s.setString(2,"Barça");
            int res = s.executeUpdate();


        } catch (SQLException e) {
            System.out.println("Consulta KO");
            throw new RuntimeException(e);

        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }
    }


    public static void gestionTransacciones() throws SQLException{

        Connection c = conectarBD();
        c.setAutoCommit(false);
        PreparedStatement s = null;

        try {
            s = c.prepareStatement("INSERT INTO Jugadores (nombre,dorsal) VALUES (?,?) ");
            s.setString(1, "Mackay");
            s.setInt(2, 1);
            s.executeUpdate();
            System.out.println("Insertar jugador OK");

            s.setString(1, "Quiles");
            s.setInt(2, 9);
            s.executeUpdate();
            System.out.println("Insertar jugador 2 OK");


            c.commit();

        } catch (Exception e) {
            c.rollback();
            System.out.println("Insertar jugador KO");
            throw new RuntimeException(e);
        } finally {
            if (s != null) s.close();
             c.close();
        }
    }











}