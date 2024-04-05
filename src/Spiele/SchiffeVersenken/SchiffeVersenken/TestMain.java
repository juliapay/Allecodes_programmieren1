package Spiele.SchiffeVersenken.SchiffeVersenken;

public class TestMain {
    public static void main(String[] args) {
        Spielefeld test = new Spielefeld();
        test.zeigeCheatFeld();
        System.out.println();
        System.out.println();
        test.zeigeFeld();
        System.out.println(test.schieße(3,4));
        System.out.println(test.pruefeObGewonnen());
        test.zeigeFeld();
        System.out.println(test.schieße(5,6));
        System.out.println(test.pruefeObGewonnen());
        test.zeigeFeld();



    }
}
