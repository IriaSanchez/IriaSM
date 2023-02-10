import 'package:flutter/material.dart';
import 'package:hangman/game.dart';

//El Main lama a runApp y le pasa una instancia de la clase MyApp, que es un widget sin estado
void main() {
  runApp(const MyApp());
}

//La clase MyApp extiende StatelessWidget y sobrescribe el método build,
// que regresa un MaterialApp con un título especificado 
//("Hangman"), una ruta inicial especificada ("/game"), 
//y una lista de rutas que mapean rutas a widgets. 
//En este caso, la ruta "/game" se mapea al widget HangmanGame.

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Hangman',
      initialRoute: "/game",
      routes: {"/game": (BuildContext context) => HangmanGame()},
    );
  }
}
