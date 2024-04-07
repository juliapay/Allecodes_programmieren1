package Angabe01;

import java.util.Scanner;

public class StringVerarbeiter {
    public static void main(String[] args) {
        liefereLaenge("hallo");
        liefereZeichen("hallo",3);
        ersetzeAlle("hallo",'l','x');
        stringVergleicher();


    }

    public static void liefereLaenge(String wort) {
        //konsolenausgabe
        System.out.println("Methode liefereLaenge: " + wort.length());

    }

    public static void liefereZeichen(String wort, int zahl) {
//
        char charPlace = wort.charAt(zahl - 1);
        System.out.println("Methode liefereZeichen: " + (charPlace));
    }

    public static void ersetzeAlle(String wort, char alt, char neu) {
//Iteration des strings

        for (int i = 0; i < wort.length(); i++) {
            if (wort.charAt(i) == alt) {
                wort = wort.replace(alt, neu);
            }
        }
        System.out.println("Methode ersetzeAlle: " + wort);
    }

    public static boolean stringVergleicher() {
        boolean wortegleich = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib das erste Wort ein");
        String wort1 = sc.next();
        System.out.println("Gib das zweite Wort ein");
        String wort2 = sc.next();

        if (wort1.equalsIgnoreCase(wort2)) {
            wortegleich = true;
        } else {
            wortegleich = false;
        }
        System.out.println("Methode stringVergleicher: "+wortegleich );
        return wortegleich;

    }
}