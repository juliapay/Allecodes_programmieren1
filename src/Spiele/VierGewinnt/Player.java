package Spiele.VierGewinnt;

public class Player {
    //Klasse spieler
    //attribute private
        private char charPiece;
        private String name;
//konstruktor methode zum erstellen eines spielerobjekts
        public Player(char charPiece, String name) {
            this.charPiece = charPiece;
            this.name = name;
        }
        //Getter und Setter Methoden

        public char getCharPiece() {
            return charPiece;
        }

        public void setCharPiece(char charPiece) {
            this.charPiece = charPiece;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
