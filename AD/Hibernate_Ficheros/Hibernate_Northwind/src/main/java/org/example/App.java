package org.example;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.type.StringType;

import java.math.BigDecimal;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //crearProveedor();
        //leerProveedor();
        //modificarProveedor();
        //eliminarProveedor();

        //listarProveedoresSQL();
        //listarProveedoresHQL();

        //crearCategoria();
        //leerCategoria();
        //modificarCategoria();
        //eliminarCategoria();

        //listarCategoriasSQL();

        //crearProducto();
        //leerProducto();
        //modificarProducto();
        //eliminarProducto();

        listarProductosSQL();
        //listarProductosHQL();
    }


    //Crear, leer, actualizar y borrar PROVEEDORES

    public static void crearProveedor() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        //Insertamos
        Suppliers suppliers = new Suppliers(
                "Hola Caracola", "Manolo", "Director",
                "Calle...", "La Coruña", "Galicia", "15002",
                "España", "123456789", "4565465", "www.ww.www");


        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(suppliers);
        //Finaliza la transacción
        transaction.commit();
        HibernateUtil.closeSessionFactory();

    }


    public static void leerProveedor() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Suppliers suppliers = session.get(Suppliers.class, 1);
        //Imprimimos por consola
        System.out.println(suppliers);


        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();

        HibernateUtil.closeSessionFactory();

    }


    public static void modificarProveedor() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Suppliers suppliers = session.get(Suppliers.class, 30);
        //Modificamos
        suppliers.setCity("Gijón");
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    public static void eliminarProveedor() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Suppliers suppliers = session.get(Suppliers.class, 30);
        //Borramos
        session.delete(suppliers);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    //Listar proveedores de una ciudad concreta mediante SQL nativo

    public static void listarProveedoresSQL() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();


        //Creamos el objeto
        Query<Suppliers> query = session.createNativeQuery("Select * from Suppliers where City= :City", Suppliers.class);
        query.setParameter("City", "London", StringType.INSTANCE);
        List<Suppliers> listaProveedores = query.list();
        System.out.println(listaProveedores);

        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();

    }

    //Listar todos los proveedores mediante HQL
    public static void listarProveedoresHQL() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();


        //Creamos el objeto
        Query<Suppliers> query = session.createQuery("from Suppliers ", Suppliers.class);
        List<Suppliers> listaProveedoresHQL = query.list();
        System.out.println(listaProveedoresHQL);

        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    //Crear, leer, actualizar y borrar CATEGORIAS


    public static void crearCategoria() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        //Insertamos
        Categories categories = new Categories(
                "Peixe", "Pescado");


        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(categories);
        //Finaliza la transacción
        transaction.commit();
        HibernateUtil.closeSessionFactory();

    }


    public static void leerCategoria() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Categories categories = session.get(Categories.class, 1);
        //Imprimimos por consola
        System.out.println(categories);


        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();

        HibernateUtil.closeSessionFactory();

    }


    public static void modificarCategoria() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Categories categories = session.get(Categories.class, 10);
        //Modificamos
        categories.setCategoryName("Carne");
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    public static void eliminarCategoria() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Categories categories = session.get(Categories.class, 10);
        //Borramos
        session.delete(categories);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    //Listar todas las categorías mediante SQL nativo

    public static void listarCategoriasSQL() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();


        //Creamos el objeto
        Query<Categories> query = session.createNativeQuery("Select * from Categories", Categories.class);
        List<Categories> listaCategorias = query.list();
        System.out.println(listaCategorias);

        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();

    }


    //Crear, leer, actualizar y borrar PRODUCTOS


    public static void crearProducto() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        //Formato de BigDecimal

        BigDecimal bigDecimal = new BigDecimal("15");

        //Insertar ( en este caso 1 a 1)
        Products products = new Products();
        products.setProductName("Harina");
        products.setSupplierID(1);
        products.setCategoryID(5);
        products.setQuantityPerUnit("10");
        products.setUnitPrice(bigDecimal);
        products.setUnitsInStock((short) 133);
        products.setUnitsOnOrder((short) 21);
        products.setReorderLevel((short) 4);
        products.setDiscontinued(true);


        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Guardamos
        session.save(products);
        //Finaliza la transacción
        transaction.commit();
        HibernateUtil.closeSessionFactory();

    }



    public static void leerProducto() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Products products = session.get(Products.class, 1);
        //Imprimimos por consola
        System.out.println(products);


        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();

        HibernateUtil.closeSessionFactory();

    }


    public static void modificarProducto() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Products products = session.get(Products.class, 79);
        //Modificamos
        products.setProductName("Pan");
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }


    public static void eliminarProducto() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();
        //Recogemos los datos
        Products products = session.get(Products.class, 79);
        //Borramos
        session.delete(products);
        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }



    //Obtener cuantos productos tenemos en stock (UnitsInStock) mediante SQL nativo


    public static void listarProductosSQL() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();


        //Creamos el objeto
        Query query = session.createNativeQuery("Select count(UnitsInStock) from Products");
        System.out.println(query.getSingleResult());

        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();

    }


//• Listar todos los productos, mostrando toda la información de su proveedor y categoría

    public static void listarProductosHQL() {

        //Para acceder a la base de datos
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Iniciamos la transacción
        Transaction transaction = session.beginTransaction();


        //Creamos el objeto
        Query<Products> query = session.createQuery("from Products", Products.class);
        List<Products> listaProductosHQL = query.list();
        System.out.println(listaProductosHQL);



        //Finaliza la transacción
        transaction.commit();
        //Cerramos sesión
        session.close();
        HibernateUtil.closeSessionFactory();


    }

}





