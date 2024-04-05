package Spiele;

import java.util.Scanner;

public class TicTacToealt {
    public static void main(String[] args) {
        String[][] brett = {{"[]", "[]", "[]"}, {"[]", "[]", "[]"}, {"[]", "[]", "[]"}};// Deklarierung-Intialisierunmg des Array
        int counter = 0;
        while (counter <= 9 && !gewonnen(brett)) {

            zustand(brett);//aufrufen der methode
            zugSpieler1(brett);
            if (gewonnen(brett)) {
                break;//soll aus der schleife springen falls gewonnen und den 2. spieler nicht mehr aufrufen
            }
            zustand(brett);//aufrufen der methode
            zugSpieler2(brett);// springt beim spieler 2 automatisch aus der schleife
            counter++;
        }
    }
    public static void zustand(String[][] brett) {//befuellen des Arrays mittels for schleife-Übergabe eines 2darray-parameters

        for (int i = 0; i < brett.length; i++) {
            for (int j = 0; j < brett[i].length; j++) {

                System.out.print(brett[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void zugSpieler1(String[][] brett) {
        Scanner scanner = new Scanner(System.in);
        boolean besetzt = false;
        do {//soll zuerst die abfrage durchlaufen und dann falls eingabe besetzt  ist wiederholen
            System.out.println("Spieler 1, mache deinen Zug!");
            System.out.println("Geben sie an in welcher Reihe sie den Zug machen möchten: 1/2/3");
            int reihe = scanner.nextInt();
            System.out.println("Geben sie an in welcher Spalte sie den zug machen möchten: 1/2/3");
            int spalte = scanner.nextInt();

            if (reihe == 1 && spalte == 1 && brett[0][0].equals("[]")) {
                brett[0][0] = "O";
                besetzt = false;// hat sonst nicht funktioniert ...ist in dr schleife hängen geblieben
            } else if (reihe == 1 && spalte == 2 && brett[0][1].equals("[]")) {
                brett[0][1] = "O";
                besetzt = false;
            } else if (reihe == 1 && spalte == 3 && brett[0][2].equals("[]")) {
                brett[0][2] = "O";
                besetzt = false;
            } else if (reihe == 2 && spalte == 1 && brett[1][0].equals("[]")) {
                brett[1][0] = "O";
                besetzt = false;
            } else if (reihe == 2 && spalte == 2 && brett[1][1].equals("[]")) {
                brett[1][1] = "O";
                besetzt = false;
            } else if (reihe == 2 && spalte == 3 && brett[1][2].equals("[]")) {
                brett[1][2] = "O";
                besetzt = false;
            } else if (reihe == 3 && spalte == 1 && brett[2][0].equals("[]")) {
                brett[2][0] = "O";
                besetzt = false;
            } else if (reihe == 3 && spalte == 2 && brett[2][1].equals("[]")) {
                brett[2][1] = "O";
                besetzt = false;
            } else if (reihe == 3 && spalte == 3 && brett[2][2].equals("[]")) {
                brett[2][2] = "O";
                besetzt = false;
            } else {
                System.out.println("Platz besetzt");
                besetzt = true;
            }
        } while (besetzt);
    }
    public static void zugSpieler2(String[][] brett) {
        Scanner scanner = new Scanner(System.in);
        boolean besetzt = false;
        do {//soll zuerst die abfrage durchlaufen und dann falls eingabe besetzt  ist wiederholen
            System.out.println("Spieler 2, mache deinen Zug!");
            System.out.println("Geben sie an in welcher Reihe sie den Zug machen möchten: 1/2/3");
            int reihe = scanner.nextInt();
            System.out.println("Geben sie an in welcher Spalte sie den zug machen möchten: 1/2/3");
            int spalte = scanner.nextInt();

            if (reihe == 1 && spalte == 1 && brett[0][0].equals("[]")) {
                brett[0][0] = "X";
                besetzt = false;// hat sonst nicht funktioniert ...ist in dr schleife hängen geblieben
            } else if (reihe == 1 && spalte == 2 && brett[0][1].equals("[]")) {
                brett[0][1] = "X";
                besetzt = false;
            } else if (reihe == 1 && spalte == 3 && brett[0][2].equals("[]")) {
                brett[0][2] = "X";
                besetzt = false;
            } else if (reihe == 2 && spalte == 1 && brett[1][0].equals("[]")) {
                brett[1][0] = "X";
                besetzt = false;
            } else if (reihe == 2 && spalte == 2 && brett[1][1].equals("[]")) {
                brett[1][1] = "X";
                besetzt = false;
            } else if (reihe == 2 && spalte == 3 && brett[1][2].equals("[]")) {
                brett[1][2] = "X";
                besetzt = false;
            } else if (reihe == 3 && spalte == 1 && brett[2][0].equals("[]")) {
                brett[2][0] = "X";
                besetzt = false;
            } else if (reihe == 3 && spalte == 2 && brett[2][1].equals("[]")) {
                brett[2][1] = "X";
                besetzt = false;
            } else if (reihe == 3 && spalte == 3 && brett[2][2].equals("[]")) {
                brett[2][2] = "X";
                besetzt = false;
            } else {
                System.out.println("Platz besetzt");
                besetzt = true;
            }
        } while (besetzt);
    }
    public static boolean gewonnen(String[][] brett) {// für die verschiedenen Gewinnmöglichkeiten
        boolean gewonnen = false;
        if ((brett[0][0].equals("O") && brett[0][1].equals("O") && brett[0][2].equals("O")) || (brett[1][0].equals("O") && brett[1][1].equals("O") && brett[1][2].equals("O")) || (brett[2][0].equals("O") && brett[2][1].equals("O") && brett[2][2].equals("O")) || (brett[0][0].equals("O") && brett[1][1].equals("O") && brett[2][2].equals("O")) || (brett[0][2].equals("O") && brett[1][1].equals("O") && brett[2][0].equals("O")) || (brett[0][0].equals("O") && brett[1][0].equals("O") && brett[2][0].equals("O")) ||
                (brett[0][1].equals("O") && brett[1][1].equals("O") && brett[2][1].equals("O")) || (brett[0][2].equals("O") && brett[1][2].equals("O") && brett[2][2].equals("O"))) {
            System.out.println("Spieler 1, du hast gewonnen!");
            zustand(brett);//aufrufen der methode
            return true;
        }
        if ((brett[0][0].equals("X") && brett[0][1].equals("X") && brett[0][2].equals("X")) || (brett[1][0].equals("X") && brett[1][1].equals("X") && brett[1][2].equals("X")) || (brett[2][0].equals("X") && brett[2][1].equals("X") && brett[2][2].equals("X")) || (brett[0][0].equals("X") && brett[1][1].equals("X") && brett[2][2].equals("X")) || (brett[0][2].equals("X") && brett[1][1].equals("X") && brett[2][0].equals("X")) || (brett[0][0].equals("X") && brett[1][0].equals("X") && brett[2][0].equals("X")) ||
                (brett[0][1].equals("X") && brett[1][1].equals("X") && brett[2][1].equals("X")) || (brett[0][2].equals("X") && brett[1][2].equals("X") && brett[2][2].equals("X"))) {
            System.out.println("Spieler 2, du hast gewonnen!");
            zustand(brett);//aufrufen der methode
            return true;
        }
        return gewonnen;
    }
}