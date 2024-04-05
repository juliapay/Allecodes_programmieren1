package Spiele.SchiffeVersenken.SchiffeVersenken;

import java.util.Random;

public class Spielefeld {
    // erstellen 2d Array
    private Gebiet[][] feld;
//Konstruktor für feld inklusive besetzung siehe Konstruktor Gebiet istSchiff und istGetroffen = false
    public Spielefeld() {
        this.feld = new Gebiet[10][10];
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                feld[i][j] = new Gebiet();
            }
        }

        Random rd = new Random();
// feld wird mit Zahlen 0 bis exlusive 10 bestückt
        feld[rd.nextInt(10)][rd.nextInt(10)].setzeSchiff();
        feld[rd.nextInt(10)][rd.nextInt(10)].setzeSchiff();
        feld[rd.nextInt(10)][rd.nextInt(10)].setzeSchiff();
    }
// falls ein Schiff auf koordinaten gesetzt werden muss
    public void SetzeSchiff(int x, int y) {
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {
                if (feld[i][j] == feld[x][y]) {
                    feld[i][j] = new Gebiet();
                }
            }
        }
    }
public boolean schieße(int x, int y){
    for (int i = 0; i < feld.length; i++) {
        for (int j = 0; j < feld[i].length; j++) {
            if (feld[i][j] == feld[x][y]&&!feld[x][y].istGetroffen()&&feld[x][y].istSchiff()) {
                feld[i][j].markiereAlsGetroffen();

                return true;
            }
        }
    }
    return false;
}
public boolean pruefeObGewonnen(){
    for (int i = 0; i < feld.length; i++) {
        for (int j = 0; j < feld[i].length; j++) {
            if (feld[i][j].istSchiff()&&!feld[i][j].istGetroffen()) {
                return false;
            }
        }
    }
    return true;
}
public void zeigeFeld(){
    for (int i = 0; i < feld.length; i++) {
        for (int j = 0; j < feld[i].length; j++) {

            System.out.print(feld[i][j]+" ");
        }
        System.out.println();
    }
}
    public void zeigeCheatFeld(){
        for (int i = 0; i < feld.length; i++) {
            for (int j = 0; j < feld[i].length; j++) {

                System.out.print(feld[i][j].istSchiff()+" ");
            }
            System.out.println();
        }
    }

}
