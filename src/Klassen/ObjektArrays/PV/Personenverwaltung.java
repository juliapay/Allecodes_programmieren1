package Klassen.ObjektArrays.PV;

import java.util.Arrays;
import java.util.Scanner;

public class Personenverwaltung {
    //attribute auf private
    private Person[] person;
    private int numberOfperson;
    private int maxNumberOfPerson;
    private int id;
    private String vorname;

    //konstruktormethode nur mit max personen in der parameterliste
    public Personenverwaltung(int maxNumberOfPerson) {
        this.person = new Person[maxNumberOfPerson];
        this.maxNumberOfPerson = maxNumberOfPerson;
    }

    //methode zum hinzufügen
    public void fuegePersonHinzu(Person pers) {
        //damit nicht zuviele Objekte hinzugefügt werden
        if (maxNumberOfPerson >= numberOfperson) {
            //Iteration des Array
            for (int i = 0; i < person.length; i++) {
                //feststellen ob slot leer ist
                if (person[i] == null) {
                    //befüllen mit Objekt!
                    person[i] = pers;
                    //nur als test, damit man was in der konsole sieht
                    System.out.println("Person: " + pers.getVorname() + " wurde auf Slot: " + i + " hinzugefügt");
                    //personenanzahl erhöhen
                    numberOfperson++;
                    // aus der schleife springen, keine weitere iteration notwendig
                    break;
                }
            }
        } else {
            //gehört zum if der max anzahl
            System.out.println("Array is full!");
        }
    }

    //methode zum abfragen durch die id
    public Person lieferePersonMitId(int id) {
        //array iteration
        for (int i = 0; i < person.length; i++) {

            // bedingung mit getter aus Klasse Person und not null
            if (person[i].getId() == id && person[i] != null) {
                // zurückgeben des Objekts
                return person[i];
                //return null wird nicht erreicht
            }
        }
        // wenn if bedingung nicht erreicht gibt null zurück
        System.out.println("Keine Person mit dieser ID gespeichert");
        return null;
    }

    //methode zum entfernen des personen objekts
    public void entfernePersonMitId(int id) {
        //iteration des arrays
        for (int i = 0; i < person.length; i++) {
            // bedingung mit getter aus Klasse person und bedingung  slot nicht leer ist..sonst kommt es zu einer nullpointerexception
            if (person[i] != null && person[i].getId() == id) {
                //vorher sonst ist name gelöscht zur ausgabe in der konsole damit man was sieht
                System.out.println("Person: " + person[i].getVorname() + " mit Id: " + id + " wurde erfolgreich aus dem Array entfernt");
                // löschen des Objekts
                person[i] = null;
                //personenanzahl veringern
                numberOfperson--;
            }
        }
    }


    //methode to string zur ausgabe in der konsole
    public String toString() {
        return "Personen" +
                "\nArray" + Arrays.deepToString(person) +
                "\nAnzahl der Personen: " + numberOfperson +
                "\nmaximale Anzahl der Personen: " + maxNumberOfPerson;
    }

    public void menue() {

        int option;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Menu:\n1. Füge eine Person hinzu \n2. Entferne Person mit ID \n3. Liefere Person mit ID\n4. Exit\nEnter your Choice:");
            option = scanner.nextInt();
            if ((1 > option || option > 4)) {
                System.out.println("Gib eine Zahl des Menüs ein: 1/2/3/4");
            } else {
                switch (option) {
                    case 1:
                        System.out.println("gib die Id an");
                        int id = scanner.nextInt();
                        System.out.println("Gib den Vornamen an");
                        String vorname = scanner.next();
                        fuegePersonHinzu(new Person(id, vorname));
                        break;
                    case 2:
                        System.out.println("gib die Id, der Person an, die du aus deinem Leben entfernen möchtest");
                        int id2 = scanner.nextInt();
                        entfernePersonMitId(id2);
                        break;
                    case 3:
                        System.out.println("gib die Id, der Person an, die du Finden möchtest");
                        int id3 = scanner.nextInt();
                        System.out.println("Person gefunden: "+lieferePersonMitId(id3));
                        break;
                    case 4:
                        System.out.println("Und Tschüss");
                        break;
                }
            }
        } while (option != 4);
    }
}

    
            
