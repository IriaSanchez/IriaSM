import 'dart:math';

import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';
import 'package:restart_app/restart_app.dart';


void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({Key? key}) : super(key: key);

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: HomeApp(),
    );
  }
}

  bool finPartida = true;


class HomeApp extends StatefulWidget {
  const HomeApp({Key? key}) : super(key: key);

  @override
  _HomeAppState createState() => _HomeAppState();
}

class _HomeAppState extends State<HomeApp> {
//PALABRAS PARA ADIVINAR
  // String word = "Sistema".toUpperCase();

//LETRAS
  List<String> letras = [
    "A",
    "B",
    "C",
    "D",
    "E",
    "F",
    "G",
    "H",
    "I",
    "J",
    "K",
    "L",
    "M",
  ];

  List<String> letras2 = [
    "N",
    "O",
    "P",
    "Q",
    "R",
    "S",
    "T",
    "U",
    "V",
    "W",
    "X",
    "Y",
    "Z"
  ];

  @override
  Widget build(BuildContext context) {

    




    Game.palabra = listaPalabra[0];



    return Scaffold(
      //Fondo de toda la ventana
      backgroundColor: Colors.black,

      //TITULO Y ESTILOS:
      appBar: AppBar(
        title: Text('AHORCADO',
            style: GoogleFonts.frederickaTheGreat(
                fontSize: 50, color: Colors.white)),
        elevation: 0,
        centerTitle: true,
        backgroundColor: Colors.red,
      ),

      body: Center(
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            Stack(
              children: [
                figureImage(Game.intentos >= 0, "assets/cuelgue2.png"),
                figureImage(Game.intentos >= 1, "assets/cabeza.png"),
                figureImage(Game.intentos >= 2, "assets/cuerpo.png"),
                figureImage(Game.intentos >= 3, "assets/brazo_iz.png"),
                figureImage(Game.intentos >= 4, "assets/brazo_der.png"),
                figureImage(Game.intentos >= 5, "assets/pierna_iz.png"),
                figureImage(Game.intentos >= 6, "assets/pierna_der.png"),
                figureImage(Game.intentos >= 7, "assets/muerto.png"),
              ],
            ),
            const SizedBox(
              height: 50,
            ),
            Row(
              crossAxisAlignment: CrossAxisAlignment.center,
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: Game.palabra.nombre
                  .split('')
                  .map((e) => descubreLetra(e.toUpperCase(),
                      !Game.eligeLetra.contains(e.toUpperCase())))
                  .toList(),
            ),
            const SizedBox(
              height: 50,
            ),


            //Contenido del primer array de letras
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: letras.map((e) {
                return RawMaterialButton(
                  //Si contiene la letra, no hace nada
                  onPressed: Game.eligeLetra.contains(e)
                      ? null
                      : () {
                          setState(() {
                            Game.eligeLetra.add(e);

                            //Si no contiene la letra escogida, aumenta el contador de nº de intentos
                            if (!Game.palabra.nombre.contains(e)) {
                              Game.intentos++;
                            //Recorre la palabra letra a letra, la comprueba y aumenta el contador de intentos acertados
                            } else {
                              for (int i = 0;i < Game.palabra.nombre.length;i++) {
                                if (Game.palabra.nombre[i] == e) {
                                  Game.intentosAcertados++;
                                }
                              }
                            }

                           //Una vez comprobado, si el nº de intentos coincide con el nº de intentos acertados, el usuario gana y muestra un mensaje
                            if (Game.palabra.intentosA == Game.intentosAcertados) {
                              showDialog(
                                context: context,
                                builder: (BuildContext context) {
                                  return const AlertDialog(
                                    title: Text('Has ganado', style: TextStyle(
                                          color: Colors.red,
                                          fontSize: 40,
                                          fontWeight: FontWeight.bold),

                                          ),


                                          
                                  );
                                },
                              );

                            }

                            //Una vez comprobado, si el nº de intentos es igual al tamaño de la palabra, el usuario pierde y muestra un mensaje

                            if (Game.intentos == 7) {
                              showDialog(
                                context: context,
                                builder: (BuildContext context) {
                                  return AlertDialog(
                                    title: const Text(
                                      '¡OH NO! HAS MUERTO....',
                                      style: TextStyle(
                                          color: Colors.red,
                                          fontSize: 40,
                                          fontWeight: FontWeight.bold),
                                    ),
                                    backgroundColor: Colors.black,
                                    content: Text(
                                      'LA PALABRA CORRECTA ERA: '+ Game.palabra.nombre,
                                      style: const TextStyle(
                                          color: Colors.red,
                                          fontSize: 40,
                                          fontWeight: FontWeight.bold),
                                    ),
                                  );
                                },
                              );
                            }
                          });
                        },
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(4.0),
                  ),
                  child: Text(
                    e,
                    style: const TextStyle(
                      color: Colors.white,
                      fontSize: 60.0,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  fillColor:
                      Game.eligeLetra.contains(e) ? Colors.red : Colors.grey,
                );
              }).toList(),
            ),


            //ESPACIO ENTRE AMBOS ARRAYS DE LETRAS
            const SizedBox(
              height: 50,
            ),


            //Contenido del SEGUNDO array de letras
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: letras2.map((e) {
                return RawMaterialButton(

                  //Si contiene la letra, no hace nada
                  onPressed: Game.eligeLetra.contains(e)
                      ? null
                      : () {
                          setState(() {
                            Game.eligeLetra.add(e);

                            //Si no contiene la letra escogida, aumenta el contador de nº de intentos
                            if (!Game.palabra.nombre.contains(e)) {
                              Game.intentos++;

                            //Recorre la palabra letra a letra, la comprueba y aumenta el contador de intentos acertados
                            } else {
                              for (int i = 0;
                                  i < Game.palabra.nombre.length;
                                  i++) {
                                if (Game.palabra.nombre[i] == e) {
                                  Game.intentosAcertados++;
                                }
                              }
                            }
                           //Una vez comprobado, si el nº de intentos coincide con el nº de intentos acertados, el usuario gana y muestra un mensaje
                            if (Game.palabra.intentosA == Game.intentosAcertados) {
                              showDialog(
                                context: context,
                                builder: (BuildContext context) {
                                    return const AlertDialog(
                                    title: Text('Has ganado', style: TextStyle(
                                          color: Colors.red,
                                          fontSize: 40,
                                          fontWeight: FontWeight.bold)),
                                  );
                                },
                              );
                            }

                             //Una vez comprobado, si el nº de intentos es igual al tamaño de la palabra, el usuario pierde y muestra un mensaje
                            if (Game.intentos == 7) {
                              showDialog(
                                context: context,
                                builder: (BuildContext context) {
                                        return AlertDialog(
                                    title: const Text(
                                      '¡OH NO! HAS MUERTO....',
                                      style: TextStyle(
                                          color: Colors.red,
                                          fontSize: 40,
                                          fontWeight: FontWeight.bold),
                                    ),
                                    backgroundColor: Colors.black,
                                    content: Text(
                                      'LA PALABRA CORRECTA ERA: '+ Game.palabra.nombre,
                                      style: const TextStyle(
                                          color: Colors.red,
                                          fontSize: 40,
                                          fontWeight: FontWeight.bold),
                                    ),
                                  );
                                },
                              );
                            }
                          });
                        },




                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(4.0),
                  ),
                  child: Text(
                    e,
                    style: const TextStyle(
                      color: Colors.white,
                      fontSize: 60.0,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  fillColor:
                      Game.eligeLetra.contains(e) ? Colors.red : Colors.grey,
                );
              }).toList(),
            ),
          ],
        ),
      ),
    );
  }
}



class FlatButton {}

//
//ESPACIO DONDE SE DESCUBREN LAS LETRAS
//

Widget descubreLetra(String letra, bool hidden) {
  return Container(
    height: 80,
    width: 75,
    padding: const EdgeInsets.all(12.0),
    decoration: BoxDecoration(
      color: Colors.white,
      borderRadius: BorderRadius.circular(3.0),
    ),
    child: Visibility(
      visible: !hidden,
      child: Text(letra,
          style: GoogleFonts.frederickaTheGreat(
              fontSize: 50, fontWeight: FontWeight.bold, color: Colors.red)),
    ),
  );
}
//
//CLASE JUEGO: INTENTOS
//
class Game {
  static int intentos = 0;
  static int intentosAcertados = 0;
  static Palabra palabra = new Palabra("", 0);
  static List<String> eligeLetra = [];
}

//
//CLASE PALABRA
//
class Palabra {
  int intentosA = 0;
  String nombre = "";

  Palabra(String s, int i) {
   intentosA = i;
   nombre = s;
  }
}

//
//LISTA DE PALABRAS
//
List<Palabra> listaPalabra = [
  new Palabra("SISTEMA", 7),
  new Palabra("HECHIZO", 7),
  new Palabra("CALZADO", 7),
  new Palabra("CORAZON", 7),
];
  










//
//Imagenes del muñeco y tamaño
//

Widget figureImage(bool visible, String path) {
  return Visibility(
      visible: visible,
      child: SizedBox(
        width: 300,
        height: 380,
        child: Image.asset(path),
      ));
}











