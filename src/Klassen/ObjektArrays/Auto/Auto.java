package Klassen.ObjektArrays.Auto;

public class Auto { //Erstellen der Klasse Auto

    private String marke;//deklarieren der Variablen
    private String modell;
    private int jahr;
    private double geschwindigkeit;

    public Auto(String marke, String modell, int jahr) {
        //erstellen einer Konstruktor-Methode
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
    }

    //erstellen der Getter und Setter als Schnittstellen für den Zugriff auf die Klasse
    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }


    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    //Erstellen der methoden gasbeben und bremsen mit übergabe einer double variable ohne Rückgabewert
    public void gasGeben(double geschw) {
        this.geschwindigkeit += geschw;// this. = Verweis auf variable
}
    public void bremsen(double geschw) {
        this.geschwindigkeit -= geschw;
    }
// erstellen einer toString-Methode
    @Override
    public String toString() {
        return
                "Marke: " + marke + "\n" +
                        "Modell: " + modell + "\n" +
                        "Jahr: " + jahr + "\n" +
                        "Geschwindigkeit: " + geschwindigkeit;
    }
}
