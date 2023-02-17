package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {

    private static final String SQL_INSERT = "INSERT INTO Empleados (Nombre,Edad,Salario_Fijo) " + " VALUES (?,?,?)";
    private static final String SQL_SELECT = "SELECT * FROM Empleados";
    private static final String CAMPO_ID = "ID";
    private static final String CAMPO_NOMBRE = "Nombre";
    private static final String CAMPO_EDAD = "Edad";
    private static final String CAMPO_SALARIOFIJO = "Salario_Fijo";
    private static final String SQL_UPDATE = "UPDATE Empleados SET Nombre = ?,Edad = ?,Salario_Fijo = ?"
            + " WHERE Id = ?";




    //INSERTAR

    public int insertar(Empleado empleado) throws SQLException {

        Connection connection = Conexion.obtenerConexion();
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = connection.prepareStatement(SQL_INSERT, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setInt(2, empleado.getEdad());
            preparedStatement.setFloat(3, empleado.getSalarioFijo());

            preparedStatement.executeUpdate();

            ResultSet generatedKeys = preparedStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                return generatedKeys.getInt(1);
            } else {
                return 0;
            }

        } catch (SQLException e) {
            connection.rollback();
            throw new RuntimeException(e);
        } finally {

            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        }
    }


    public List<Empleado> listarTodo() throws SQLException {

        Connection connection = Conexion.obtenerConexion();
        PreparedStatement preparedStatement = null;

        try {
            preparedStatement = connection.prepareStatement(SQL_SELECT);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Empleado> lista = new ArrayList<>();

            while (resultSet.next()) {
                Empleado empleado = new Empleado();

                empleado.setId(resultSet.getInt(CAMPO_ID));
                empleado.setNombre(resultSet.getString(CAMPO_NOMBRE));
                empleado.setEdad(resultSet.getInt(CAMPO_EDAD));
                empleado.setSalarioFijo(resultSet.getInt(CAMPO_SALARIOFIJO));

                lista.add(empleado);
            }
            return lista;

        } finally {

        }
    }


    //MODIFICAR

    public void modificar(Empleado empleado) throws SQLException {

        Connection connection = Conexion.obtenerConexion();
        PreparedStatement preparedStatement = null;

        try {

            preparedStatement = connection.prepareStatement(SQL_UPDATE);

            preparedStatement.setString(1, empleado.getNombre());
            preparedStatement.setInt(2, empleado.getEdad());
            preparedStatement.setFloat(3, empleado.getSalarioFijo());

            preparedStatement.executeUpdate();
        } finally {
            // Cerramos sentencia y conexión
            if (preparedStatement!=null) preparedStatement.close();
            if (connection!=null) connection.close();
        }
    }



}
