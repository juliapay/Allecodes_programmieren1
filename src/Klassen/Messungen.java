package Klassen;

import java.util.Arrays;

public class Messungen {
    public static void main(String[] args) {

        Messungen messungen = new Messungen(1);
        messungen.messungenAmTag("mittwoch", 23);
        messungen.messungenAmTag("montag", 24);
        messungen.tagesDurchschnitt("montag");
        double[] messwerte = {4.5, 6, 13.5};
        messungen.alleMessungenAmTag("montag", messwerte);


    }


    public double[][] messungen;
    public int woche;
    public double[] durchschnitte;
    public double[] messwerte;

    public Messungen(int woche) {
        this.messungen = new double[7][3];
        this.woche = woche;
    }

    public int tagesZahl(String tag) {

        switch (tag.toLowerCase()) {
            case "montag":
                return 0;
            case "dienstag":
                return 1;
            case "mittwoch":
                return 2;
            case "donnerstag":
                return 3;
            case "freitag":
                return 4;
            case "samstag":
                return 5;
            case "sonntag":
                return 6;
            default:
                return -1;
        }
    }

    public void messungenAmTag(String tag, double messwert) {
        int index = tagesZahl(tag);
        for (int i = 0; i < messungen[index].length; i++) {
            if (messungen[index][i] == 0.0) {
                messungen[index][i] = messwert;
                break;
            } else {
                System.out.println("Slot: " + i + "is full");
            }
        }
    }
    public void alleMessungenAmTag(String tag, double[] messwerte) {

        int index = tagesZahl(tag);
        boolean leer = true;
        for (double m : messungen[index]) {
            if (m != 0) {
                leer = false;
                break;
            }
        }
        if (leer) {
            messungen[index] =messwerte;
        }
    }
    public double[] tagesDurchschnitt(String tag) {

        double[] durchschnitte = new double[messungen.length];
        for (int i = 0; i < messungen.length; i++) {
            int counter = 0;
            int summe = 0;
            for (double note : messungen[i]) {
                summe += note;
                counter++;
                durchschnitte[i] = summe / counter;
            }
        }
        return durchschnitte;
    }
    public void wochenDurchschnitt() {
        double summe = 0;
        int i;
        for (i = 0; i < durchschnitte.length; i++) {

            summe += durchschnitte[i];
        }
        double gesamtduchschnitt = summe / i;
        System.out.println("Der Temperaturdurchschnitt der Woche beträgt: " + gesamtduchschnitt);
    }

    @Override
    public String toString() {
        return "Messungen{" +
                "messungen=" + Arrays.toString(messungen) +
                ", woche=" + woche +
                '}';
    }
}
