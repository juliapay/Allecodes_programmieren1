package Angabe04;

import java.util.Arrays;

public class TestGame {
    public static void main(String[] args) {
        BatttleShipGame bsg = new BatttleShipGame(); //Instanz erzeugen
        bsg.displayField(); //Feld Zeichnen

        //Staerke pro Player
        System.out.println("\nMethode 0:");
        bsg.battleShipStrength('A');
        bsg.battleShipStrength('B');
        //Gesamtanzahl an Schiffen auf der Karte zuruckgeben
        System.out.println("\nMethode 1:");
        System.out.println("'Es sind momentan "+bsg.countBattleShips()+" Schiffe auf der Map vorhanden.");
        //Schiffe pro Zeile zaehlen
        System.out.println("\nMethode 2:");

        System.out.println("Schiffe pro Zeile(beginnend bei 1): "+Arrays.toString(bsg.countOfShipsPerLine()));

        //Durchschnittliche staerke der Schiffe von A
        System.out.println("\nMethode 3:");
        System.out.println("A hat eine durchschnittliche Schiffstaerke von: "+bsg.averageShipStrengthPlayerA());
    }
}
