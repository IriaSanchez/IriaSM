import 'package:flutter/material.dart';

class PrimeraClase extends StatelessWidget {
  String word = "Flutter".toUpperCase();
  //Letras
  List<String> alphabets = [
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

  @override
  Widget build(BuildContext context) {
    // TODO: implement build
    throw UnimplementedError();
    return Scaffold(
      backgroundColor: Colors.black,
      appBar: AppBar(
        title: const Text(
          "Ahorcado",
          style: TextStyle(fontFamily: "Bloody terror TTF"),
        ),
        elevation: 0,
        centerTitle: true,
        backgroundColor: Colors.black,
      ),
      body: Column(
        mainAxisAlignment: MainAxisAlignment.spaceBetween,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: [
          Center(
            child: Stack(
              children: [
                //Crear el muñeco a partir de imagenes en funcion a los intentos
                figureImage(Game.tries >= 0, "assets/cuelgue.png"),
                figureImage(Game.tries >= 1, "assets/cabeza.png"),
                figureImage(Game.tries >= 2, "assets/cuerpo.png"),
                figureImage(Game.tries >= 3, "assets/brazo_iz.png"),
                figureImage(Game.tries >= 4, "assets/brazo_der.png"),
                figureImage(Game.tries >= 5, "assets/pierna_iz.png"),
                figureImage(Game.tries >= 6, "assets/pierna_der.png"),
                figureImage(Game.tries >= 7, "assets/muerto.png"),
              ],
            ),
          ),

          //Now we will build the Hidden word widget
          //now let's go back to the Game class and add
          // a new variable to store the selected character
          /* and check if it's on the word */
          /*Row(
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: word
                .split('')
                .map((e) => letter(e.toUpperCase(),
                    !Game.selectedChar.contains(e.toUpperCase())))
                .toList(),
          ),
*/
          //Now let's build the Game keyboard
          /*   SizedBox(
            width: double.infinity,
            height: 250.0,
            child: GridView.count(
              crossAxisCount: 7,
              mainAxisSpacing: 8.0,
              crossAxisSpacing: 8.0,
              padding: const EdgeInsets.all(8.0),
              children: alphabets.map((e) {
                return RawMaterialButton(
                  onPressed: Game.selectedChar.contains(e)
                      ? null // we first check that we didn't selected the button before
                      : () {
                          setState(() {
                            Game.selectedChar.add(e);
                            print(Game.selectedChar);
                            if (!word.split('').contains(e.toUpperCase())) {
                              Game.tries++;
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
                      fontSize: 30.0,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                  fillColor: Game.selectedChar.contains(e)
                      ? Colors.black
                      : Colors.red[800],
                );
              }).toList(),
            ),
          )*/
        ],
      ),
    );
  }
}

void setState(Null Function() param0) {}

class Game {
  //adding the number of tries
  static int tries = 0;
  static List<String> selectedChar = [];
}

Widget figureImage(bool visible, String path) {
  return Visibility(
      visible: visible,
      child: Container(
        width: 250,
        height: 250,
        child: Image.asset(path),
      ));
}
