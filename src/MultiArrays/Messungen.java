package MultiArrays;

public class Messungen {

    public static void main(String[] args) {

        Messungen messungen = new Messungen();
        messungen.messungenAmTag("mittwoch", 23);
        messungen.messungenAmTag("montag", 24);
        messungen.tagesDurchschnitt("montag");
        double[] messwerte = {4.5, 6, 13.5};
        messungen.alleMessungenAmTag("montag", messwerte);


    }

    private double[][] messungen;
    private int woche;
//konstruktor für die Instanzierung
    public Messungen() {
        this.messungen = new double[7][3];
        this.woche = woche;
    }

    // methode mit switch option zum zuteilen der werte
    public int tageszahl(String tag) {
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

    //methode zum eintragen eines messwertes an einem Tag mit Parameterliste
    public void messungenAmTag(String tag, double messWert) {
// iteration des 2Darrays
        for (int i = 0; i < messungen.length; i++) {
            for (int j = 0; j < messungen[i].length; j++) {
                //condtition mit übergeben der int tageszahl durch die methode + abfrage das slot leer ist
                if ((messungen[tageszahl(tag)][j] == 0.0)) {
                    // übergabe der messwerte an den freien slot
                    messungen[tageszahl(tag)][j] = messWert;
                    //abbruch der methode da ein weiteres ausführen der iteration nicht mehr notwendig ist
                    break;
                }
            }
        }
    }

    // methode zum befüllen eines freien tages mit parameterliste
    public void alleMessungenAmTag(String tag, double[] messwerte) {
//boolean variable zur festlegung ob Arraysltos leer sind
        boolean leer = false;
        //for each Loop weil nur lesen notwendig ist
        for (double m : messungen[tageszahl(tag)]) {
            if (m != 0) {
                leer = false;
            }
        }
        if (leer) {
            //befüllen der slots
            messungen[tageszahl(tag)] = messwerte;
        }
    }
// methode für tagesdurchschnitt mit Parameterliste und Übergabe datentyp
    public double tagesDurchschnitt(String tag) {
        // variablen zum errechnen des durchschnitts
        double sum = 0;// summe aller zahlen in den slots
        int counter = 0;// zählt dei slots für den durchschnitt
        for (int i = 0; i < messungen.length; i++) {
            for (int j = 0; j < messungen[i].length; j++) {
                //mit auffrufen der methode tageszahl zur umwandlung des strings
                if ((i == tageszahl(tag))) {
                    sum += messungen[i][j];
                    counter++;
                }
            }
        }
        //Übergabewert
        return sum / counter;
    }
// Wochenschnitt mit übergabedatentyp
    public double wochenDurchschnitt() {
        double sum = 0;// summe aller zahlen in den slots
        int counter = 0;// zählt dei slots für den durchschnitt
        for (int i = 0; i < messungen.length; i++) {
            for (int j = 0; j < messungen[i].length; j++) {
                sum += messungen[i][j];
                // soll für den richtigen durchschnitt nur die gefüllten slots zählen
                if (messungen[i][j] != 0.0) {
                    counter++;
                }
            }
        }
        return sum / counter;//übergabewert
    }
}
