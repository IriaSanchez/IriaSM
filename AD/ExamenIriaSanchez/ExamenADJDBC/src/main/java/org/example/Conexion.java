package org.example;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {

    private static final HikariConfig config = new HikariConfig();
    private static final HikariDataSource ds;

    private static final String JDBC_URL = "jdbc:sqlserver://localhost:1433;";
    private static final String USERNAME = "sa";
    private static final String PASSWORD = "ADMIN";
    private static final String DATABASE = "database";
    private static final String DATABASE_VALOR = "ExamenAD";
    private static final String ENCRYPT = "encrypt";
    private static final String ENCRYPT_VALOR = "true";
    private static final String TRUST_SERVER_CERTIFICATE = "trustServerCertificate";
    private static final String TRUST_SERVER_CERTIFICATE_VALOR = "true";

    static {
        config.setJdbcUrl(JDBC_URL);
        config.setUsername(USERNAME);
        config.setPassword(PASSWORD);
        config.addDataSourceProperty(DATABASE, DATABASE_VALOR);
        config.addDataSourceProperty(ENCRYPT, ENCRYPT_VALOR);
        config.addDataSourceProperty(TRUST_SERVER_CERTIFICATE, TRUST_SERVER_CERTIFICATE_VALOR);
        ds = new HikariDataSource(config);
    }

    public static Connection obtenerConexion() throws SQLException {
        return ds.getConnection();
    }
}

