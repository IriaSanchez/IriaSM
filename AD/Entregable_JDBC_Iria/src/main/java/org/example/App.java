package org.example;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class App {

    public static void main(String[] args) throws JAXBException {
        leerXML();
    }

    public static Location leerXML() throws JAXBException {

        File fichero = new File("C:\\Users\\FP\\Documents\\GitHub\\IriaSM\\AD\\Entregable_JDBC_Iria\\es.xml");
        Location location = new Location();


            if (fichero.exists()) {
                JAXBContext jaxbContext = JAXBContext.newInstance(Location.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                location = (Location) jaxbUnmarshaller.unmarshal(fichero);
            } else {

                System.out.println("Fichero no encontrado");
            }
            for (int i = 0; i < location.getCountryRegion().size(); i++) {
                System.out.println(location.getCountryRegion().get(i));
            }

                return location;
            }


    public static void insertarBDUnoaUno(Location location) throws SQLException {
        Connection c = ConexionHikari.obtenerConexion();
        PreparedStatement s = null;
        long inicio = System.currentTimeMillis();
        try {
            s = c.prepareStatement("INSERT INTO Ciudades (codigo, nombre) VALUES (?,?)");

            for (CountryRegion countryRegion: location.getCountryRegion()) {
                if (countryRegion.getState() != null) {
                    for (State state: countryRegion.getState()) {
                        if(state.getCity()!=null){
                            for (City city: state.getCity()) {
                                s.setString(1, city.getCode());
                                s.setString(2, city.getName());
                                s.executeUpdate();
                            }
                        }

                    }
                }
            }

            System.out.println("Insertado ciudad Ok");
            long tiempo = System.currentTimeMillis() - inicio ;
            System.out.println(tiempo);
        }catch (SQLException e){
            System.out.println("Insertado ciudad KO");
            throw new RuntimeException(e);
        }finally {
            if(s!=null) s.close();
            if(c!=null) c.close();
        }


    }
    public static void insertarLote(Location location) throws SQLException {
        Connection c = ConexionHikari.obtenerConexion();
        PreparedStatement s = null;
        long inicio = System.currentTimeMillis();
        try {
            s = c.prepareStatement("INSERT INTO Ciudades (codigo, nombre) VALUES (?,?)");

            for (CountryRegion contry: location.getCountryRegion()) {
                if (contry.getState() != null) {
                    for (State state: contry.getState()) {
                        if(state.getCity()!=null){
                            for (City city: state.getCity()) {
                                s.setString(1, city.getCode());
                                s.setString(2, city.getName());
                                s.addBatch();
                            }
                        }

                    }
                }
            }
            s.executeBatch();
            System.out.println("Insertado lote Ok");
            long tiempo = System.currentTimeMillis() - inicio ;
            System.out.println(tiempo);
        }catch (SQLException e){
            System.out.println("Insertado lote KO");
            throw new RuntimeException(e);
        }finally {
            if(s!=null) s.close();
            if(c!=null) c.close();
        }

    }
}

