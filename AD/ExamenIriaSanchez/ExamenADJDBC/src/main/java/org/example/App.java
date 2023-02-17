package org.example;

import java.sql.SQLException;
import java.util.List;

public class App
{
    public static void main( String[] args ) throws SQLException {


        EmpleadoService service = new EmpleadoService();

        Empleado empleado = new Empleado("Paco", 10,500);
        Empleado empleado1 = new Empleado("Carlos", 50,5000);


        //Llamar método insertar
        int idInsertado = service.insertar(empleado);
        int idInsertado1 = service.insertar(empleado1);



        //Llamar método listar
        List<Empleado> empleados = service.listarTodo();
        System.out.println(empleados);


        //Llamar método modificar
        empleado.setNombre("MariPili");
        service.modificar(empleado);

        //Llamar método listar
        List<Empleado> empleados2 = service.listarTodo();
        System.out.println(empleados2);

    }
}
