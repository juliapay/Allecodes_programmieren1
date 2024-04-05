package Spiele.SchiffeVersenken;

import java.util.Random;

public class ShipControl {
    //Klasse zum generieren des computerbretts
    //2D array für das spielfeld

    private char[][] computerBoard;
//konstruktor für das spielebrett
    public ShipControl() {

        this.computerBoard = new char[10][10];
        //brett wird automatisch bei instanzierung befüllt
        initializeBoard();
    }
//methode zum befüllen des bretts
    public void initializeBoard() {
        for (int i = 0; i < computerBoard.length; i++) {
            for (int j = 0; j < computerBoard[i].length; j++) {
                computerBoard[i][j] = ' ';
            }
        }
        //methode zum generieren der schiffe durch den computer
        placeShips();
    }
    //methode zum zufälligen platzieren der schiffe
    public void placeShips() {
        Random rd = new Random();
        //counter damit nur bestimmte anzahl der schiffe erstellt werden
        int counter = 0;
        //ship nur 1 feld
        while (counter < 4) {
            //zufallige platzwahl im array
            int x = rd.nextInt(1, 8);
            int y = rd.nextInt(1, 8);
            for (int i = 1; i < computerBoard.length-1; i++) {
                for (int j = 1; j < computerBoard[i].length-1; j++) {
                    //bedingung für leeren slot
                    if (computerBoard[x][y] == ' '
                        && computerBoard[x-1][y] == ' '&&computerBoard[x+1][y] == ' '
                        && computerBoard[x][y+1] == ' '&&computerBoard[x][y-1] == ' '
                        ) {
                        computerBoard[x][y] = 'S';
                        counter++;
                        //soll aus der schleife heraus
                        break;
                    }
                }
            }
        }
        //schiffe mit 2 plätzen jeweils horizontal und vertikal nur 2
       while (counter < 8) {
            //bound 8 sonst über das feld hinaus
            int x = rd.nextInt(1, 8);
            int y = rd.nextInt(1, 7);
            //ship 2 felder nur horizontal
            for (int i = 0; i < computerBoard.length; i++) {
                for (int j = 0; j < computerBoard[i].length; j++) {
                    //bedingung für freie plätze
                    if (computerBoard[y][x] == ' ' && computerBoard[y][x + 1] == ' '
                        &&computerBoard[y][x + 2] == ' '&&computerBoard[y][x-1]==' '
                        && computerBoard[y-1][x + 1] == ' ' && computerBoard[y+1][x + 1] == ' '
                        && computerBoard[y-1][x] == ' ' && computerBoard[y+1][x] == ' '
                    ) {
                        //befüllen
                        computerBoard[y][x] = 'M';
                        computerBoard[y][x + 1] = 'M';
                        counter++;
                        //raus aus der schleife
                        break;
                    }
                }
            }
        }
        //ship 2 felder nur vertikal
        while (counter < 10) {
            //zum verhindern der outof bound exception
            int y = rd.nextInt(1, 8);
            int x = rd.nextInt(1, 8);
            for (int i = 0; i < computerBoard.length; i++) {
                for (int j = 0; j < computerBoard[i].length; j++) {
                    //bedingung für befüllen
                    if (computerBoard[y][x] == ' ' && computerBoard[y + 1][x] == ' '&& computerBoard[y + 2][x] == ' '
                         &&computerBoard[y-1][x] == ' '&&computerBoard[y][x-1]==' '&& computerBoard[y+1][x - 1] == ' '
                            && computerBoard[y][x + 1] == ' ' && computerBoard[y+1][x + 1] == ' '
                         ) {
                        computerBoard[y][x] = 'M';
                        computerBoard[y + 1][x] = 'M';
                        counter++;
                        //raus aus der schleife
                        break;
                    }
                }
            }
        }
        //ship 3 felder horizontal
 /*       while (counter < 8) {
            int x = rd.nextInt(0, 7);
            int y = rd.nextInt(2, 8);
            for (int i = 0; i < computerBoard.length; i++) {
                for (int j = 0; j < computerBoard[i].length; j++) {


                    if (computerBoard[y][x] == ' ' && computerBoard[y][x + 1] == ' ' && computerBoard[y][x + 2] == ' ') {
                        computerBoard[y][x] = 'L';
                        computerBoard[y][x + 1] = 'L';
                        computerBoard[y][x + 2] = 'L';
                        counter++;
                        break;
                    }
                }
            }
        }
            //ship 3 felder nur vertikal
            while (counter < 9) {
                int y = rd.nextInt(0, 7);
                int x = rd.nextInt(0, 7);
                for (int i = 0; i < computerBoard.length; i++) {
                    for (int j = 0; j < computerBoard[i].length; j++) {
                        if (computerBoard[y][x] == ' ' && computerBoard[y + 1][x] == ' ' && computerBoard[y + 2][x] == ' ') {
                            computerBoard[y][x] = 'L';
                            computerBoard[y + 1][x] = 'L';
                            computerBoard[y + 2][x] = 'L';
                            counter++;
                            break;
                        }
                    }
                }
            }*/
        }
//falls man cheaten möchte
    public void showComputerboard() {
        System.out.println("---------------------------------");
        for (int i = 0; i < computerBoard.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < computerBoard[i].length; j++) {

                System.out.print(computerBoard[i][j] + "  ");
            }
            System.out.println("|");
        }
        System.out.println("  0  1  2  3  4  5  6  7  8  9"); // Spaltennummern für Referenz
    }


//getter für das array
    public char[][] getComputerBoard() {
        return computerBoard;
    }


}
