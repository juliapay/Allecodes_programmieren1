package Angabe02;

import java.util.Arrays;
import java.util.Scanner;

public class PersonenVerwaltung {
    private Person[] personen; //Array des Typs Person, entkommentieren Sie die Zeile, wenn die Klasse Person erstellt wurde
    private int anzahlPersonen;
    private int maxAnzahlPersonen;

    public PersonenVerwaltung(int maxAnzahlPersonen) {
        this.personen = new Person[maxAnzahlPersonen];

        this.maxAnzahlPersonen = maxAnzahlPersonen;
    }

    //Hier kommt Ihr Code :)
    //Viel Glueck!
    public void fuegePersonHinzu(Person pers) {
        //damit nicht zuviele Objekte hinzugefügt werden
        if (maxAnzahlPersonen >= anzahlPersonen) {
            //Iteration des Array
            for (int i = 0; i < personen.length; i++) {
                //feststellen ob slot leer ist
                if (personen[i] == null) {
                    //befüllen mit Objekt!
                    personen[i] = pers;
                    //nur als test, damit man was in der konsole sieht
                    System.out.println("fuegePersonHinzu() -> " +
                            "Neue Person: " + pers.getName() + " mit ID:" + i + " wurde hinzugefügt");
                    //personenanzahl erhöhen
                    anzahlPersonen++;
                    // aus der schleife springen, keine weitere iteration notwendig
                    break;
                }
            }
        } else {
            //gehört zum if der max anzahl
            System.out.println("Array is full!");
        }
    }

    public Person lieferePersonMitId(int id) {
        //array iteration
        for (int i = 0; i < personen.length; i++) {
            // bedingung mit getter aus Klasse Person und not null
            if (personen[i].getId() == id && personen[i] != null) {
                // zurückgeben des Objekts
                return personen[i];
                //return null wird nicht erreicht
            }
        }
        // wenn if bedingung nicht erreicht gibt null zurück
        System.out.println("Keine Person mit dieser ID gespeichert");
        return null;
    }

    public void entfernePersonMitId(int id) {
        //iteration des arrays
        for (int i = 0; i < personen.length; i++) {
            // bedingung mit getter aus Klasse person und bedingung  slot nicht leer ist..sonst kommt es zu einer nullpointerexception
            if (personen[i] != null && personen[i].getId() == id) {
                //vorher sonst ist name gelöscht zur ausgabe in der konsole damit man was sieht
                System.out.println("entfernePersonMitId() -> Person: " + personen[i].getName() + " mit Id: " + id + " wird nun entfernt");
                // löschen des Objekts
                personen[i] = null;
                //personenanzahl veringern
                anzahlPersonen--;
            }
        }
    }

    @Override
    public String toString() {
        return "Personen" +
                "\nArray" + Arrays.toString(personen) +
                "\nAnzahl der Personen: " + anzahlPersonen +
                "\nmaximale Anzahl der Personen: " + maxAnzahlPersonen;
    }

    public void menue() {

        int option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---Willkommen zur Aufgabe01---" +
                    "\n1. neue Person hinzufügen " +
                    "\n2. Personendaten einer gewissen Person ausgeben " +
                    "\n3. Eine gewisse Person entfernen" +
                    "\n4. Exit" +
                    "\nBitte jetzt Zahl eingeben");
            option = scanner.nextInt();
          //  if ((1 > option || option > 4)) {
           //     System.out.println("Gib eine Zahl des Menüs ein: 1/2/3/4");
           // } else {
                switch (option) {
                    case 1:
                        System.out.println("bitte id angeben");
                        int id = scanner.nextInt();
                        System.out.println("Name der Person eingeben");
                        String vorname = scanner.next();
                        fuegePersonHinzu(new Person(id, vorname));
                        break;
                    case 2:
                        System.out.println("Welche Person soll ausgegeben werden, geben sie bitte die ID an: ");
                        int id3 = scanner.nextInt();
                        System.out.println("Person heisst: " + lieferePersonMitId(id3));
                        break;
                    case 3:
                        System.out.println("Welche Person soll entfernt werden, geben sie die ID an");
                        int id2 = scanner.nextInt();
                        entfernePersonMitId(id2);
                        break;
                    case 4:
                        System.out.println("Programm wird beendet\n    Und Tschüss");
                        break;
                }
        //  }
        } while (option != 4);
    }
}

