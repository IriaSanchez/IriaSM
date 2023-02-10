import 'dart:math';
import 'package:flutter/material.dart';
import 'package:google_fonts/google_fonts.dart';

class HangmanGame extends StatefulWidget {
  const HangmanGame({super.key});

  @override
  State<StatefulWidget> createState() => HangmanGameExtended();
}

class HangmanGameExtended extends State<HangmanGame> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Color.fromARGB(248, 1, 22, 116),
      body: Center(
        child: Column(
                children: [
                  Container(
                     alignment: Alignment.topLeft,
                     child: IconButton(
                     icon: const Icon(Icons.arrow_circle_left_outlined,
                     size: 50,color: Colors.white,),
                     onPressed: () => Game.newGame(context),                                                                 
                     ),
                  ),

                        
          Stack(
            children: <Widget>[

              Positioned(child: Text("Puntos :  ${Game.puntos}",style: GoogleFonts.frederickaTheGreat(fontSize: 20, fontWeight: FontWeight.bold, color:Colors.white)),),             
              Positioned(left: 160, child: Text("Monedas : ",style: GoogleFonts.frederickaTheGreat(fontSize: 20, fontWeight: FontWeight.bold, color:Colors.white)),),

              figureImage(Game.tryGame >= 0, "assets/cuelgue2.png"),
              Positioned(left: 15,top: 10,bottom: 95,child: figureImage(Game.tryGame >= 1, "assets/0.png"),),
              Positioned(left: 27,top: 84,bottom: 5,child: figureImage(Game.tryGame >= 2, "assets/1.png"),),
              Positioned(left: 27,right: 150,top: 84,bottom: 75,child: figureImage(Game.tryGame >= 3, "assets/2.png"),),
              Positioned(left: 160,right: 5,top: 5,bottom: 75,child: figureImage(Game.tryGame >= 4, "assets/3.png"),),
              Positioned(left: 20,right: 65,top: 200,bottom: -120,child: figureImage(Game.tryGame >= 5, "assets/4.png"),),
              Positioned(left: 110,right: 5,top: 200,bottom: -130,child: figureImage(Game.tryGame >= 6, "assets/5.png"), ),
              Positioned(left: 31,right: 24,top: 10,bottom: 105,child: figureImage(Game.tryGame >= 7, "assets/6.png"),),
           ]
          ),


            const SizedBox(height: 80,),
           
            Row(
                crossAxisAlignment: CrossAxisAlignment.center,mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: Game.word.split('').map((e) => getLetter(e.toUpperCase(),
                         !Game.chooseLetter.contains(e.toUpperCase()))).toList()
                ),
            
            const SizedBox(height: 50,),
           
           Center(  
              child: 
              SizedBox(width: double.infinity,height: 250,
                      child:GridView.count(
                        crossAxisCount: 7,mainAxisSpacing: 8.0,crossAxisSpacing: 8.0,padding: const EdgeInsets.all(80.0),
                            children: WordsLetters.letters1.map((e) {
                            return RawMaterialButton(
                                // Si contiene la letra, no hace nada
                                onPressed: Game.chooseLetter.contains(e) ? null: () {

                                           setState(() {
                                           Game.chooseLetter.add(e);

                                           if (!Game.word.contains(e)) {

                                            /* Si la palabra no tiene la letra escogida,
                                              se aumenta un intento */
                                            Game.tryGame += 1;

                                            } else {
                                              /* Si la palabra contiene la letra,
                                                se recorrera la palabra para
                                                ir encontrando cuantas letras de esta
                                                contiene */

                                            for (int i = 0; i < Game.word.length; i++) {
                                              if (Game.word[i] == e) {
                                                Game.tryCorrect += 1;
                                              }
                                            }
                                          }


                                          /* En caso de que se se haya acertado la palabra,
                                            mostrar mensaje de que el usuario ha ganado */
                                          if (Game.word.length == Game.tryCorrect) {
                                              Game.puntos = Game.puntos+50;

                                               showDialog(
                                                context: context, barrierDismissible: false,
                                                builder: (BuildContext context) {
                                                  return AlertDialog(
                                                    title: Text("¡Enhorabuena! Has acertado la palabra",style: GoogleFonts.frederickaTheGreat(fontSize: 30, backgroundColor: Colors.white, fontWeight: FontWeight.bold, color:Color.fromARGB(255, 38, 103, 243))),  
                                                    backgroundColor: Colors.transparent,insetPadding: const EdgeInsets.symmetric(horizontal: 0),
                                                    actions: [
                                                      Container(
                                                        padding: EdgeInsets.only(left: 10),alignment: Alignment.topCenter,
                                                        child: OutlinedButton(
                                                            onPressed: () =>Game.newGame(context),
                                                            child: Text("Volver a jugar",style: GoogleFonts.frederickaTheGreat(fontSize: 35, backgroundColor: Colors.white, fontWeight: FontWeight.bold, color:Color.fromARGB(255, 38, 103, 243))),                                       
                                                        ),
                                                      ),

              ///////////////////////////////////////////////////////////////////////
              //////////////////////////////////////////////////////////////////////
              ///VOLVER AL INICIO//////////////////////////////////////////////
                                                      Container(
                                                          padding: const EdgeInsets.all(18),alignment: Alignment.topCenter,
                                                          child:OutlinedButton(
                                                                onPressed: () => Game.newGame(context),
                                                                child: Text("Inicio",style: GoogleFonts.frederickaTheGreat(fontSize: 30, backgroundColor: Colors.white, fontWeight: FontWeight.bold, color:Color.fromARGB(255, 38, 103, 243))),
                                                                ),
                                                     ),                                                                                           
                                                    ],
                                                  );
                                                }
                                                );
                                          }


                            /* En caso de agotar los siete intentos sin haber
                            acertado la palabra, mostrar mensaje de que el usuario
                            ha perdido */
                            if (Game.tryGame == 7) {
                              
                            if(Game.puntos >0){
                              Game.puntos = Game.puntos-25;

                            }

                              showDialog(
                                context: context,
                                barrierDismissible: false,
                                builder: (BuildContext context) {
                                  return AlertDialog(
                                     backgroundColor: Colors.transparent,
                                    content: Text('¡Oh vaya....has fallado! La palabra correcta era : ${Game.word}',style: GoogleFonts.frederickaTheGreat(
                                    fontSize: 30, backgroundColor: Colors.white, fontWeight: FontWeight.bold, color:Color.fromARGB(255, 38, 103, 243))
                                    ),
                                    insetPadding: const EdgeInsets.symmetric(horizontal: 0),
                                    actions: [
                                      Container(
                                        padding: const EdgeInsets.only(left: 18),
                                        alignment: Alignment.topCenter,
                                        child: OutlinedButton(
                                            onPressed: () =>Game.newGame(context),
                                             child: Text(
                                              "Inténtalo de nuevo",style: GoogleFonts.frederickaTheGreat(
                                                fontSize: 30, backgroundColor: Colors.white, fontWeight: FontWeight.bold, color:Color.fromARGB(255, 38, 103, 243))                                                
                                              ),
                                        ),
                                            ),                                        
                                      
///////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////
///VOLVER AL INICIO//////////////////////////////////////////////
                                      Container(
                                            padding: const EdgeInsets.all(18),
                                            alignment: Alignment.topCenter,
                                            child:
                                               OutlinedButton(
                                                  onPressed: () => Game.newGame(context),                                            
                                                  child: 
                                                    Text(
                                                      "Inicio",style: GoogleFonts.frederickaTheGreat(
                                                         fontSize: 30, backgroundColor: Colors.white, fontWeight: FontWeight.bold, color:Color.fromARGB(255, 38, 103, 243))
                                                    ),
                                                ),                              
                                      ),
                                    ],
                                  );
                                },
                              );
                            }



                          });
                        },
                  shape: RoundedRectangleBorder(borderRadius: BorderRadius.circular(4.0),),
                  fillColor: Game.chooseLetter.contains(e)? Colors.black : Color.fromARGB(255, 38, 103, 243),
                  child: Text(e, style: const TextStyle(color: Colors.white,fontSize: 60,fontWeight: FontWeight.bold)),
                );
              }).toList(),
            ),) ,
),

           
            
         
          ],
        ),
      ),
    );
  }
}

///////////
///////////

class Game {
  // Palabra a acertar
  static String word =
      WordsLetters.wordsGame[Random().nextInt(WordsLetters.wordsGame.length)];
  // Intentos totales
  static int tryGame = 0;
  // Intentos acertados
  static int tryCorrect = 0;
  // Letras ya seleccionadas
  static List<String> chooseLetter = [];

  static int puntos = 0;

  


  // Funcion que genera una nueva partida
  static void newGame(BuildContext context) {
    Navigator.of(context).pushNamed("/game");
    Game.word =
        WordsLetters.wordsGame[Random().nextInt(WordsLetters.wordsGame.length)];
    Game.tryGame = 0;
    Game.tryCorrect = 0;
    Game.chooseLetter.clear();
  }
}




//////////
// Clase WordsLetters -> Clase que tendra las letras y palabras del juego
class WordsLetters {



  // LETRAS
  //  -> Arrays que contienen las letras, divididas en filas de 2
  static List<String> letters1 = [
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
  /////////////
  // PALABRAS -> Array de palabras del juego
  static List<String> wordsGame = [
    "SISTEMA",
    "HECHIZO",
    "CALZADO",
    "CORAZON",
    "AJEDREZ",
    "LECHUZA",
    "FLUIDEZ",
    "LOMBRIZ",
    "DISFRAZ",
    "FORZUDO",
    "BIZARRO",
    "MAZAPAN",
    "CORTEZA",
    "EJEMPLO",
    "EMBRUJE",
    "CIZALLA",
    "CEREZAL",
    "RAPIDEZ",
    "EXHIBAN",
    "AVANZAR",
    "ZUMBIDO",
    "CHAPUZA",
    "INCAPAZ",
    "MEZCLAR",
    "AFIANZA",
    "PADRAZO",
    "APLAZAR",
    "BELLEZA",
    "ARMENIA",
    "ACIERTO",
    "RESCATE"
  ];
}
/////////////
// GetLetter -> Widget que genera las letras del juego
Widget getLetter(String letra, bool hidden) {
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
              fontSize: 50, fontWeight: FontWeight.bold, color: Colors.black)),
    ),
  );
}
////////////
// FigureImage -> Widget que genera las imagenes del juego en pantalla
Widget figureImage(bool visible, String path) {
  return Visibility(
      visible: visible,
      child: SizedBox(
        width: 300,
        height: 468,
        child: Image.asset(path),
      ));
}
