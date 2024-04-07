package Angabe02;

import java.util.Scanner;

public class PersonTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Deklarierung Initialisierung Klasse
        PersonenVerwaltung pv = new PersonenVerwaltung(5); //Instanz der Klasse PersonenVerwaltung zum alles zu testen
        //starten der methode
        pv.menue();

    }
}
