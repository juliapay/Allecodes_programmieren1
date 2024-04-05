package Klassen.ObjektArrays.Grundstuecke;

public class TestGrund {//Erstellen der Klasse TestGrund
    public static void main(String[] args) {//Erstellen der main-Methode zum Testen
        //deklarieren und initialisieren mit den angegebenen Zahlen des 2D arrays
        int[][] grundstuecke = {
                {1, 30, 40},
                {2, 20, 50},
                {3, 10, 30}
        };

        Grundsteuer g = new Grundsteuer();
        System.out.println("die Summe der Grundsteuer beträgt: "+g.grundsteuerBerechnen(grundstuecke));

    }
}
