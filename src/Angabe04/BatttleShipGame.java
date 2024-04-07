package Angabe04;

public class BatttleShipGame {
    int[][] map = {
            {1, 0, 0, 2, 0, 0, 1, 1, 0, 0},
            {3, 0, -1, 0, 0, 0, 2, 0, -1, 0},
            {0, 3, 0, 0, -1, 0, 0, 2, 0, 0},
            {0, 0, 0, 4, 4, 0, 1, 0, 0, 2},
            {0, -3, 2, 0, 0, 0, -1, 0, 0, 0},
            {0, 0, -2, 0, 0, -4, 0, 0, -1, 0},
            {0, 0, 0, 0, -3, 0, 0, 0, 0, 0},
            {0, 0, -2, 0, -2, 0, 0, -2, 0, 0}
    };

    //Feld zeichnen
    public void displayField() {
        for (int[] a : map) {
            for (int b : a) {
                if (b >= 0) {
                    System.out.print(b + "   ");
                } else {
                    System.out.print(b + "  ");
                }
            }
            System.out.println();
        }
    }

    public int battleShipStrength(char player) {
        //Deklarierung und intialisierung für stäke des players
        int sum = 0;
        //Spieler überprüfen mit == da primitiver datentyp
        if (player == 'A') {
            //Iteration des arrays
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    //A ist positive zahlen
                    if (map[i][j] > 0) {
                        //summieren mit der summe der vorherigen zahlen
                        sum += map[i][j];
                    }
                }
            }
            System.out.println("Player A hat eine Staerke von: " + sum);
        }
        else if (player == 'B') {
            //Iteration des arrays
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    //B ist positive zahlen
                    if (map[i][j] < 0) {
                        // nur absolute zahlen verwenden
                        sum += Math.abs(map[i][j]);
                    }
                }
            }
            System.out.println("Player B hat eine Staerke von: " + sum);
        } else {
            //falls man sich vertippt hat
            System.out.println("Bitte gib A oder B ein");
        }
        return sum; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }


    public int countBattleShips() {
        //hilfsvariable fürs zählen
        int counter = 0;
        //iteration mit for
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                //A ist nur positive zahlen
                if (map[i][j] != 0) {
                    counter++;
                }
            }
        }
        return counter; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public int[] countOfShipsPerLine() {
        //hilfsvariable fürs zählen
        int counter = 0;
            //array: laenge = zeilensumme 2DArray
        int[] count = new int[8];//Nur pro forma damit kein Fehler angezeigt wird
        for (int i = 0; i < map.length; i++) {
            //setzt in jeder zeile den Counter auf 0
            counter=0;
            for (int j = 0; j < map[i].length; j++) {
                //A ist positive zahlen
                if (map[i][j] != 0) {
                    counter++;
                }
            }
            //setzt nach jeder zeile den counter ein
            for (int k = 0; k < count.length; k++) {
                count[i] = counter;
            }
        }
        return count;
    }

    public int totalShipsA() {


        return 0; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

    public double averageShipStrengthPlayerA() {
        //hilfsvariablen
        double sum = 0;
        double counter = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                //A ist positive zahlen
                if (map[i][j] > 0) {
                    //addieren der schiffsstaerke
                    sum += map[i][j];
                    //zaehlen der schiffe
                    counter++;
                }
            }
        }
        //zurückgeben des durchschnitts
        return  sum / counter; //Das return ist nur als Platzhalter, damit kein Fehler angezeigt wird
    }

}
