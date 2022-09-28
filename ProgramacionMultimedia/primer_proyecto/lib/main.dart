import 'dart:html';

import 'package:flutter/material.dart';

void main() {
  runApp ( SegundaClase());
}








class SegundaClase extends StatelessWidget{
  @override
  Widget build(BuildContext context) {
    
    return MaterialApp(
      title: "Septimo ejercicio",
      home: Scaffold(
        appBar: AppBar(
          title: Text("Filas y columnas"),
          ),
          body: Padding(
            padding: const EdgeInsets.all(50),
            child: Column(
              children: [
                Row(
                  children: [
                    Text("Activar sonido"),
                    Icon(Icons.add, size: 50),
                    Switch(value: true, onChanged: (value){})
                  ],
                ),
                Divider(),
                Row(
                  children: [
                    Text("Activar sonido"),
                    Icon(Icons.add, size: 50),
                    Switch(value: true, onChanged: (value){})
                  ],
                ),
                 Divider(),

                 Row(
                  mainAxisAlignment: MainAxisAlignment.center,
                  children: [
                    Container(
                      height: 50,
                      width: 50,
                      color: Colors.amber,
                    ),
                    Container(
                      margin: const EdgeInsets.all(10),
                      height: 50,
                      width: 50,
                      color: Colors.green,
                      child: Text("B", textAlign: TextAlign.center,
                      style: TextStyle(fontSize: 20,color: Colors.white),),
                    ),
                    Container(
                      height: 50,
                      width: 50,
                      color: Colors.blue,
                    ),
                  ],
                ),

              ],) ),

        ),

    );
  }



}


  /*
  @override
  Widget build(BuildContext context) {
    
    return MaterialApp(
      title:"Sexto ejercicio",
      home: Scaffold(
        appBar: AppBar(
          title: Text("Filas"),

        ),
        body: Row(
          children: [
            Expanded (child:Text("Activar sonido")),
            Icon(Icons.shop_rounded, size: 50,),
            Switch(value: false, onChanged: (value){})
          ]),
        ) ,
    );





  }
*/



  /*
  @override
  Widget build(BuildContext context){

    return MaterialApp(
      title: "Quinto ejercicio",
      home: Scaffold(
        appBar: AppBar(),
        body: Column(
          mainAxisAlignment:MainAxisAlignment.center,
          children: [
            Container(
              height: 100,
              width: 100,
              color: Colors.black,
            ),
            Text("Hola mundo"),
            Image.network("http://c.files.bbci.co.uk/48DD/production/_107435681_perro1.jpg",
             height: 100,
             width: 100,
             ),
          ],
        ),
        ),
    );
  }
  */



















/*
  @override
  Widget build(BuildContext context) {


    return MaterialApp(
      title: "Cuarto proyecto",
      home: Scaffold(
        appBar: AppBar(
          title: Text("Modificando el AppBar"),
          actions: [
            IconButton(onPressed: addLeft, icon: Icon(Icons.add_a_photo)),
            IconButton(onPressed: addRight, icon: Icon(Icons.add_box_rounded)),
            IconButton(onPressed: pulsado, icon: Icon(Icons.add),)
          ],     

        ),
      ),
    );
   
   
  }

    int contador = 0;

  void addLeft(){
    
    print("pulsando boton izquierdo");
    contador++;

  }

   void addRight(){
    print("pulsando boton derecho");
    contador--;
    
  }

  void pulsado(){
    print("Has pulsado " +contador.toString()+" veces");


  }


}


*/





/*
class PrimeraClase extends StatelessWidget {
  const PrimeraClase({super.key});

  // This widget is the root of your application.
  @override
  
  //Constructor de la app

  Widget build(BuildContext context) {
    return MaterialApp(

      //Titulo
      title: 'Titulo_principal', 

      //Interior de la app (home que tiene un appBar y un body )
      home: Scaffold(
        appBar: AppBar(
          title: Text('Header'),
          backgroundColor:Colors.amber[400],
          foregroundColor: Colors.green[900],
        ),
        body: Center(
          child: Icon(Icons.apple_outlined,
          size: 300,
          color: Colors.blue,)),
        ),
      );  

    
  }
}
*/






/*
class SegundaClase extends StatelessWidget{

   @override
   Widget build(BuildContext) {
    return MaterialApp(
      title: 'Tercer ejercicio',
      home: Scaffold(
        
        appBar: AppBar(
          title: Text('Tercera app'),

        ),
        body: Center(),
        backgroundColor: Colors.black,
        drawer: Drawer(),
        endDrawer: Drawer(),
        floatingActionButton: FloatingActionButton(
          onPressed: (){
            print('pulsando botón');
          },
          child: Icon(Icons.add),
        ),

      ),
    );
  }

}

*/






  int cantidad = 0;


  @override
  Widget build(BuildContext context) {

  return MaterialApp(

    title: 'Segunda interfaz',
    home: Scaffold(
      
      appBar: AppBar(
        title: Text('Ventana')
        ),

      body: Center(
        child: IconButton(
          icon: Icon(Icons.car_rental, size: 200),
          onPressed: ( ) {
            print('pulsado');

            cantidad++;
            print("Has pulsado " +cantidad.toString()+" veces");
            
            },
          ),
       ),
    ),
  );

  }



