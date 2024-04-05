package Klassen.ObjektArrays.Post;

import java.util.Arrays;

public class Filialpost {
    //Klasse Filialpost mit attributen: objekt-array, integer
    private Paket[] pakete;

    private int anzahlPakete;
    //zusätzlich integer attribut für die parameterliste des konstruktors
    private int maxAnzahlDerPakete;


//konstruktor mit parameterliste, in der die maxAnzahlDerPakete gefordert werden als Übergabeparameter

    public Filialpost(int maxAnzahlDerPakete) {

        this.maxAnzahlDerPakete = maxAnzahlDerPakete;

        this.pakete = new Paket[maxAnzahlDerPakete];
    }

    //Methode zum Hinzufügen des pakets auf einen leeren Platz im Objektarray
    public void paketHinzufuegen(Paket paket) {
        //wenn die maximale anzahl noch nicht erreicht ist
        if (anzahlPakete <= maxAnzahlDerPakete) {
            //befüllen des arrays auf leeren platz
            for (int i = 0; i < pakete.length; i++) {
                if (pakete[i] == null) {
                    //Paket über getter-methoden als übergabeparameter in der main
                    pakete[i] = paket;
                    System.out.println(pakete[i].toString()+" dem Array hinzugefügt");
                    anzahlPakete++;
                    //springt aus der schleife sobald dem array das objekt übergeben wurde
                    break;
                }
            }
        } else {
            //ausgabe in die Konsole wenn max anzahl erreicht wurde
            System.out.println("Maximale Anzahl von Paketen erreicht");
        }
    }

    //methode ohne rückgabewert mit parameterliste paket entfernen
    public void paketEntfernen(int paketid) {
        //boolean damit die ausgabe "Fehler" nur einmal ausgegeen wird!
        boolean gefunden = false;
// iteration durch die elemente
        for (int i = 0; i < pakete.length; i++) {
            //objekt wird mit dem attribut id im array lokalisiert
            //!= null an erter stelle sonst null pointer exception
            if (pakete[i] != null && pakete[i].getId() == paketid) {
                System.out.println(pakete[i].toString()+" aus dem Array entfernt");
                //slot im array wird auf null gesetzt
                pakete[i] = null;
                gefunden = true;
                //anzahl der gesamtzahl der pakete veringert um 1
                anzahlPakete--;
                //springt aus der schleife sobald das objekt gelöscht wird
                break;
            }
        }
        //falls kein objekt gefunden...ausgabe in die konsole
        if (!gefunden) {
            System.out.println("Fehlermeldung! Kein Paket mit dieser ID!");
        }
    }

    //methode mit rückgabe-datentyp Paket und übergabeparameter der id
    public Paket paketFinden(int paketid) {
        for (int i = 0; i < pakete.length; i++) {
            //objekt wird mit dem attribut id im array lokalisiert
            if (pakete[i].getId() == paketid) {
                //gibt das paket mit der id zurück
                return pakete[i];
            }
        }
        //falls kein objekt gefunden...wird nichts zurückgegeben
        return null;
    }

    //toString methode zum ausgeben in der konsole
    @Override
    public String toString() {
        return "Filialpost" +
                "\npakete" + Arrays.deepToString(pakete) +
                "\nanzahlPakete: " + anzahlPakete +
                ", maxAnzahlDerPakete:" + maxAnzahlDerPakete;
    }

    //für die anzahl der objekte in der main
    public int getAnzahlPakete() {
        return anzahlPakete;
    }

    public Paket[] getPakete() {
        return pakete;
    }
}