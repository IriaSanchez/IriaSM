package org.example;
import java.sql.*;


public class Servicio {

    //Método insertar
    public int insertar(Futbolista futbolista)  throws SQLException {

        Connection c = ConexionHikari.obtenerConexion();
        PreparedStatement s = null;

        int id = 0;

        try {
            s = c.prepareStatement("INSERT INTO Futbolistas (Nombre,Club,Media,Ultimo_Partido) VALUES(?,?,?,?)",s.RETURN_GENERATED_KEYS);
            s.setString(1,futbolista.getNombre());
            s.setString(2,futbolista.getClub());
            s.setFloat(3,futbolista.getMedia());
            s.setTimestamp(4,futbolista.getUltimo_partido());

            s.executeUpdate();

            ResultSet generatedKeys = s.getGeneratedKeys();
            generatedKeys.next();
            id = generatedKeys.getInt(1);


        } catch (SQLException e) {
            throw new RuntimeException(e);

        } finally {
            if (s != null) s.close();
            if (c != null) c.close();
        }

        return id;
    }




    //Método consultar
    public Futbolista consultar(int id) throws SQLException {

        Futbolista futbolista = new Futbolista();
        Connection c = ConexionHikari.obtenerConexion();
        PreparedStatement s = null;

        try{

            s = c.prepareStatement("SELECT * FROM Futbolistas WHERE Id = ?",s.RETURN_GENERATED_KEYS);
            s.setInt(1,id);

            ResultSet res = s.executeQuery();

            while (res.next()) {
                futbolista.setNombre(res.getString("Nombre"));
                futbolista.setClub(res.getString("Club"));
                futbolista.setMedia(res.getFloat("Media"));
                futbolista.setUltimo_partido(res.getTimestamp("Ultimo_Partido"));

            }


    } finally {
        if (s != null) s.close();
        if (c != null) c.close();
    }
        return futbolista;
}










    //Método eliminar
    public void eliminar(){

    }

    //Método actualizar
    public void actualizar(){

    }








}
