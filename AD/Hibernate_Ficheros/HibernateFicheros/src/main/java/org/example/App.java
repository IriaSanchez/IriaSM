package org.example;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.type.StringType;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class App
{

    public static void main( String[] args )
    {
        ////////////////////
        //Llamamos al método
        ////////////////////
        //crearTarea();
        //leerTarea();
        //modificarTarea();
        //eliminarTarea();
        //consultarTareasSQL();
        //consultarTareasHQL();


        ////////////////////
        //Llamamos al método
        ////////////////////
        //crearSubtarea();
        leerSubtarea();
        //modificarSubtarea();
        //eliminarSubtarea();
        //consultarSubtareasSQL();
        //consultarSubtareasHQL();


        //Session session = sessionFactory.getCurrentSession();
    }

    public static void crearTarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        //Indicamos formato de fecha y hora
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm");
        Date date = null;

        try{
            //Parseamos la fecha y hora a insertar
            date = dateFormat.parse("23/01/2023 12:30");

        }catch (ParseException e){
            throw new RuntimeException(e);
        }

        long time = date.getTime();
        //Creamos objeto tarea y le pasamos datos (constructor en clase Tarea pero sin id porque es autoincremental)
        //Indicamos campo nombre, descripción y estado
        //El campo fecha lo recogemos del time que lo recoge del date anterior

        Tarea tarea = new Tarea("Obra Aula Nosa",
                "Obra en Aula 0 Aula Nosa",
                new Timestamp(time), "Pendiente");

        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(tarea);
        //Finaliza la transacción
        transaction.commit();
    }


    public static void leerTarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Tarea tarea = session.get(Tarea.class,1);
        //Imprimimos por consola
        System.out.println(tarea);

        //Recorre las subtareas para poder imprimir las subtareas que cuelgan de esa tarea
        for (Subtarea subtarea : tarea.getSubtareas()){
            System.out.println(subtarea);
        }



        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();

        HibernateUtil.closeSessionFactory();

    }

    public static void modificarTarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Tarea tarea = session.get(Tarea.class,3);
        //Modificamos
        tarea.setEstado("Realizada");
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }

    public static void eliminarTarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Tarea tarea = session.get(Tarea.class,3);
        //Borramos
        session.delete(tarea);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    public static void consultarTareasSQL(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Creamos el objeto
        Query<Tarea> query = session.createNativeQuery("Select * from Tarea", Tarea.class);
        List<Tarea> listaTareas = query.list();
        //Imprimimos
        System.out.println(listaTareas);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();

    }

    public static void consultarTareasHQL(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();


        //Creamos el objeto
        Query<Tarea> query = session.createQuery("from Tarea where estado= :estado",Tarea.class);
        query.setParameter("estado","Pendiente", StringType.INSTANCE);
        List<Tarea> listaTareas = query.list();
        System.out.println(listaTareas);

        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();




    }













/////
    //////
    //////
    ///////
    /////



    public static void crearSubtarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();


        //Insertamos
        Subtarea subtarea = new Subtarea(1,"Hola Caracola");

        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(subtarea);
        //Finaliza la transacción
        transaction.commit();
        HibernateUtil.closeSessionFactory();

    }


    public static void leerSubtarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Subtarea subtarea = session.get(Subtarea.class,2);
        //Imprimimos por consola
        System.out.println(subtarea);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }

    public static void modificarSubtarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Subtarea subtarea = session.get(Subtarea.class,1);
        //Modificamos
        subtarea.setNombre("HOLA");
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }

    public static void eliminarSubtarea(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Subtarea subtarea = session.get(Subtarea.class,1);
        //Borramos
        session.delete(subtarea);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();

    }


    public static void consultarSubtareasSQL(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Creamos el objeto
        Query<Subtarea> query = session.createNativeQuery("Select * from Subtarea", Subtarea.class);
        List<Subtarea> listaSubtareas = query.list();
        //Imprimimos
        System.out.println(listaSubtareas);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();

    }

    public static void consultarSubtareasHQL(){

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();

        //Creamos el objeto
        Query<Subtarea> query = session.createQuery("from Subtarea where nombre= :nombre",Subtarea.class);
        query.setParameter("nombre","Obra Aula Nosa", StringType.INSTANCE);
        List<Subtarea> listaSubtareas = query.list();
        System.out.println(listaSubtareas);

        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();




    }

}
