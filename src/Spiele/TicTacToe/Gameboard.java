package Spiele.TicTacToe;

import java.util.Scanner;

public class Gameboard {
    //attribut privat gesetzt
    private char[][] board;
    private Player player1;
    private Player player2;
    private int counter;
    private Player currentPlayer;

    //konstruktor mit Übernahmeparameter der Spielernamen
    public Gameboard(String playerOne, String playerTwo) {
        this.player1 = new Player('X', playerOne);
        this.player2 = new Player('O', playerTwo);
        this.counter = counter;
        //initialisierung 2D array
        this.board = new char[3][3];
        currentPlayer = player1;
        //2D array wird schon mit initialisieren mit chars belegt
        initializeBoard();
    }

    //methode zum initialisieren
    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = ' ';
                System.out.print("[]" + " ");
            }
            System.out.println();
        }
    }

    //methode zum zeigen des boards
    public void showBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    //schaut schöner aus
                    System.out.print("[]" + " ");
                } else {
                    //falls slot schon belegt ist mit spielerchar
                    System.out.print(board[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    // methode des spielablaufs
    public void startGame() {

        //zuerst durchlaufen, dann prüfen
        do {
            //oder hier mit scanner
            Scanner scanner = new Scanner(System.in);
            System.out.println(currentPlayer.getName() + ", mache deinen Zug!");
            System.out.println("Geben sie an in welcher Reihe sie den Zug machen möchten: 0/1/2");
            int row = scanner.nextInt();
            System.out.println("Geben sie an in welcher Spalte sie den zug machen möchten: 0/1/2");
            int column = scanner.nextInt();
            placePiece(row, column);
            showBoard();
            checkWin();
            // 9 ist die max anzahl der slots
            if (!checkWin() && counter < 9) {
                //player werden abgewechselt
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }
                //bedingung gewinner
            } else if (checkWin() && counter <= 9) {
                System.out.println(currentPlayer.getName() + ", you win!");
            }
        } while (!checkWin() && counter <= 9);
        //bedingung unentschieden
        if (counter >= 9) {
            System.out.println("unendschieden!");
        }
    }

    //methode spielstein setzen
    public void placePiece(int row, int column) {
    // hier mit scanner
      /*  Scanner scanner = new Scanner(System.in);
        System.out.println(currentPlayer.getName() + ", mache deinen Zug!");
        System.out.println("Geben sie an in welcher Reihe sie den Zug machen möchten: 0/1/2");
        int row = scanner.nextInt();
        System.out.println("Geben sie an in welcher Spalte sie den zug machen möchten: 0/1/2");
        int column = scanner.nextInt();*/

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[row][column] == ' ') {
                    board[row][column] = currentPlayer.getCharPiece();
                    this.counter++;
                }
            }
        }
    }
//methode die die gewinnmöglichkeiten abcheckt
    public boolean checkWin() {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                //Vertikal
                if (board[0][j] == currentPlayer.getCharPiece() && board[1][j] == currentPlayer.getCharPiece() && board[2][j] == currentPlayer.getCharPiece()) {
                    return true;
                }
                //Diagonal
                else if (board[0][0] == currentPlayer.getCharPiece() && board[1][1] == currentPlayer.getCharPiece() && board[2][2] == currentPlayer.getCharPiece()) {

                    return true;
                }
                //Diagonal
                else if (board[2][0] == currentPlayer.getCharPiece() && board[1][1] == currentPlayer.getCharPiece() && board[0][2] == currentPlayer.getCharPiece()) {

                }
                //Horizontal
                else if (board[0][0] == currentPlayer.getCharPiece() && board[0][1] == currentPlayer.getCharPiece() && board[0][2] == currentPlayer.getCharPiece()) {
                    return true;
                }
            }
        }
        return false;
    }

}
