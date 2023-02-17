package org.example;


import java.util.List;

public class App
{
    public static void main( String[] args ) {

        EmpleadoService service = new EmpleadoService();

        Empleado empleado = new Empleado("Maria", 48,1000);


        //Llamar método insertar
        int idInsertado = service.insertar(empleado);

        //Llamar método consultar
        Empleado empleado1 = service.consultar(idInsertado);
        System.out.println(empleado1);

        //Llamar método modificar
        empleado1.setNombre("Pepita");
        service.modificar(empleado1);

        //Llamar método listar
        List<Empleado> empleados = service.listarTodo();
        System.out.println(empleados);

    }
}
