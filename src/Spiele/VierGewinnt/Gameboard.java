package Spiele.VierGewinnt;

import java.util.Scanner;

public class Gameboard {
    //erstellen der klasse für dei spielmechanik
    //attribute privat
    //deklarierung 2D array für das board
    private char[][] board;
    private Player player1;
    private Player player2;
    private int counter;

    private Player currentPlayer;

    //konstruktormethode mit übergabe in der parameterliste der 2 spielernamen
    public Gameboard(String playerOne, String playerTwo) {
        //instanzierung der 2 spieler
        this.player1 = new Player('X', playerOne);
        this.player2 = new Player('O', playerTwo);
        this.counter = counter;
        //initialisierung des boards
        this.board = new char[6][7];
        //festlegung des 1.spielers
        currentPlayer = player1;
        //mit instanzierung in der main wird auch gleichzeitig das array mit leeren slots befüllt
        initializeBoard();
    }

    //methode für die spielmechanik
    public void startGame() {
        //fußgesteuerte schleife damit spielablauf zuerst gestartet wird und dann überprüft wird
        do {
            //methode setzt den stein
            placePiece();
            //methode zeigt das board
            showBoard();
            //überprüft den gewinn -->bedingung für do while loop
            checkWin();
            //bedingung für den spielerwechsel
            //6*7=42 = max 42 züge
            if (!checkWin() && counter < 42) {
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
                //bedingung für das gewinnen
            } else if (checkWin() && counter <= 42) {
                System.out.println(currentPlayer.getName() + ", you win!");
            }
        } while (!checkWin() && counter <= 42);
        //bedingung für das unendschieden
        if (counter == 42) {
            System.out.println("unendschieden!");
        }
    }

    //methode zur initialisierung des boards
    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //wird befüllt mit leeren char slots
                board[i][j] = ' ';
            }
        }
        // zeigt das board einmal für den beginn
        showBoard();
        System.out.println("Let's play a game!\n");
    }

    //methode des outputs in die console
    public void showBoard() {
        // Spaltennummern zum leichteren spielen
        System.out.println(" 0 1 2 3 4 5 6");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //für die ausgabe der spielsteine
                System.out.print("|" + board[i][j]);
            }
            //endleiste damit das feld wie pipes ausschaut
            System.out.println("|");
        }
        //braucht einen boden
        System.out.println("---------------");
    }

    //methode einen spielstein zu platzieren
    public void placePiece() {


        //ausgabe in konsole aufrufen des spielers
        Scanner scanner = new Scanner(System.in);
        System.out.println(currentPlayer.getName() + ", mache deinen Zug!");
        System.out.println("Gib die Spalte an, in die du deinen Stein werfen möchtest: 0/1/2/3/4/5/6");
        int row = scanner.nextInt();
        //muss nur durch die zeilen iterieren
        //stein wird in die unterste reihe gesetzt...
        if (board[0][row] != ' ') {
            System.out.println("Spalte ist voll");

        } else {
            for (int i = board.length - 1; i >= 0; i--) {

                //...falls die unterste reihe frei ist
                if (board[i][row] == ' ') {
                    board[i][row] = currentPlayer.getCharPiece();

                    //für das zählen der spielzüge
                    this.counter++;
                    //springt aus der schleife weil zug beendet ist
                    break;
                }
            }
        }
    }

    //methode um den gewinn zu überprüfen mit boolean rückgabetyp
    public boolean checkWin() {

        //horizontal
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j] == currentPlayer.getCharPiece() && board[i][j + 1] == currentPlayer.getCharPiece() && board[i][j + 2] == currentPlayer.getCharPiece() && board[i][j + 3] == currentPlayer.getCharPiece()) {
                    return true;
                }
            }
        }
        //vertikal
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == currentPlayer.getCharPiece() && board[i + 1][j] == currentPlayer.getCharPiece() && board[i + 2][j] == currentPlayer.getCharPiece() && board[i + 3][j] == currentPlayer.getCharPiece()) {
                    return true;
                }
            }
        }
        //diagonal schräg nach oben
        for (int i = 3; i < board.length; i++) {
            for (int j = 0; j < board[i].length - 3; j++) {
                if (board[i][j] == currentPlayer.getCharPiece() && board[i - 1][j + 1] == currentPlayer.getCharPiece() && board[i - 2][j + 2] == currentPlayer.getCharPiece() && board[i - 3][j + 3] == currentPlayer.getCharPiece()) {
                    return true;
                }
            }
        }
        //diagonal schräg nach unten
        for (int i = 0; i < board.length - 3; i++) {
            for (int j = 3; j < board[i].length; j++) {
                if (board[i][j] == currentPlayer.getCharPiece() && board[i + 1][j + 1] == currentPlayer.getCharPiece() && board[i + 2][j + 2] == currentPlayer.getCharPiece() && board[i + 3][j + 3] == currentPlayer.getCharPiece()) {
                    return true;
                }
            }
        }
        //kein gewinner
        return false;
    }

}
