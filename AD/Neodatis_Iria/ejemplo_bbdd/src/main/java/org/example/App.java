package org.example;

public class App {
    public static void main( String[] args ) throws Exception {


        PreguntaDAO lis = new PreguntaDAO();

        System.out.println(lis.listar());
    }
}
