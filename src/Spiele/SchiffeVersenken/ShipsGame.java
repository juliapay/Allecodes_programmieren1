package Spiele.SchiffeVersenken;

import java.util.Scanner;

public class ShipsGame {
//Attribute private
    //sichtbares spielerboard
    private char[][] board;

    private String player;
    private int counter;
//Deklarierung und instanzierung der klasse shipcontrol= brett des computers
    ShipControl computer = new ShipControl();
//konstruktor mit parameterliste mit namen des spielers
    public ShipsGame(String player) {
        this.board = new char[10][10];
        this.player = player;
        this.counter = counter;
        //Brett wird bei instazierung gleich mit befüllt
        initializeBoard();
        //computer.initializeBoard();
    }
//methode zur befüllung
    public void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = '~';
            }
        }
        //soll einmal zu beginn in der konsole ausgegeben werden
        showBoard();
        System.out.println("Let's play a game, " + player + "!\n");
    }
//zeigt das brett
    public void showBoard() {

        System.out.println("y--------------------------------");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println("|");
        }
        System.out.println("x 0  1  2  3  4  5  6  7  8  9 "); // nummern zum leichteren markieren
    }
//Trefferabfrage durch den spieler
    public void guessShip() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie die Koordinate x ein");
        int x = sc.nextInt();
        System.out.println("Geben sie die Koordinate y ein");
        int y = sc.nextInt();
        //war leichter mit boolean
        boolean isHit = false;
        //iteraition durch das computerboard in dem die schiffe in den slots sind
        for (int i = 0; i < computer.getComputerBoard().length; i++) {
            for (int j = 0; j < computer.getComputerBoard()[i].length; j++) {
                //bedingung für versenken der kleinen
                if (computer.getComputerBoard()[y][x] != ' ') {
                    //bedingung für ausgabe console
                    if(computer.getComputerBoard()[y][x] == 'S') {
                        System.out.println("Versenkt!");
                    }
                    //bedingung für ausgabe console
                    if(computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y+1][x] == 'M'
                    ||computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y][x+1] == 'M'
                    ||computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y-1][x] == 'M'
                    ||computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y][x-1] == 'M'){
                        System.out.println("Treffer!");
                    }
                    if(computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y+1][x] == 'T'
                            ||computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y][x+1] == 'T'
                            ||computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y-1][x] == 'T'
                            ||computer.getComputerBoard()[y][x] == 'M'&&computer.getComputerBoard()[y][x-1] == 'T'){
                        System.out.println("Versenkt!");
                    }
                    //arrayslot im computerboard wird auf 0 gesetzt
                    computer.getComputerBoard()[y][x] = 'T';
                    isHit = true;
                    //für ausgabe des Spielerarrays  in konsole
                    for (int k = 0; k < board.length; k++) {
                        for (int l = 0; l < board[k].length; l++) {
                            board[y][x] = 'X';
                        }
                    }
                }
            }
        }
        //bedingung für kein treffer aber markierung des feldes in der ausgabe des arrays
        if (!isHit) {
            System.out.println("Kein Treffer");
            for (int k = 0; k < board.length; k++) {
                for (int l = 0; l < board[k].length; l++) {
                    board[y][x] = 'O';
                }
            }
        }
    }
//methode für die Gewinnbedingungen mit rückgabedatentyp boolean
    public boolean checkWin() {
        //iteration durchs computerboard
        for (int i = 0; i < computer.getComputerBoard().length; i++) {
            for (int j = 0; j < computer.getComputerBoard()[i].length; j++) {
                //bedingung für nicht gewinnen weitrspielen
                if (computer.getComputerBoard()[i][j] == 'S'||computer.getComputerBoard()[i][j] == 'M') {
                    return false;
                }
            }
        }
        //bedingung zum beenden des spiels
        return true;
    }
//methode für den spielablauf
    public void startGame() {
        //für die maximale anzahl der spielzüge
        int count = 0;
        //soll beim ersten zug zuerst die schleife durchlaufen
        do {

            //spieler gibt koordinaten
            guessShip();
            //counter für schleife
            count++;
            //hat spieler gewonnen?
            checkWin();
            //damit spieler seinen guess sieht
            showBoard();
            //bedingung für alle erraten
            if (checkWin() && count < 20) {
                System.out.println("Du hast gewonnen");
                break;
            }
            //wenn nicht gewonnen ausgabe in die konsole
            System.out.println("Du hast noch "+(20-count)+" Züge");
            //wenn zuviel züge
            if (!checkWin() && count == 20) {
                System.out.println("Du hast verloren");
            }
            //endbedingung bei endgesteuerter schleife
        } while (!checkWin() && count < 20);
    }
    public void showComputerboard() {
        System.out.println("---------------------------------");
        for (int i = 0; i < computer.getComputerBoard().length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < computer.getComputerBoard()[i].length; j++) {

                System.out.print(computer.getComputerBoard()[i][j] + "  ");
            }
            System.out.println("|");
        }
        System.out.println("  0  1  2  3  4  5  6  7  8  9"); // Spaltennummern für Referenz
    }
}