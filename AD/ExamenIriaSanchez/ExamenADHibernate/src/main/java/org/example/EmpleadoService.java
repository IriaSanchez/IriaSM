package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class EmpleadoService {

    SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

    private static final String HQL_SELECT = "from Empleado";

    public int insertar(Empleado empleado){

        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.save(empleado);
        transaction.commit();
        return empleado.getId();
    }

    public Empleado consultar(int id){
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Empleado empleado = session.get(Empleado.class, id);
        transaction.commit();
        return empleado;
    }


    public void modificar(Empleado empleado) {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        session.update(empleado);
        transaction.commit();
    }

    public List<Empleado> listarTodo() {
        Session session = sessionFactory.getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query<Empleado> query = session.createQuery(HQL_SELECT,Empleado.class);
        List<Empleado> lista = query.list();
        transaction.commit();
        return lista;
    }




}
