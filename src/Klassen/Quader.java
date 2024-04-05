package Klassen;

public class Quader {
    //Attribute:
    private double laenge;
    private  double breite;
    private double hoehe;
//erstellen eines konstruktors
    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }
//erstellen von Gettern und Settern
    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public double getHoehe() {
        return hoehe;
    }

    public void setHoehe(double hoehe) {
        this.hoehe = hoehe;
    }
    // erstellen der grundflaeche mit return wert:
    public double grundflaeche(){
        double flaeche=(this.laenge*this.breite);

        return flaeche;
    }
    //erstellen der methode skalieren mit einem Ubergabeparameter:
    public void skaliere(double faktor){
        this.breite=breite*faktor;
        this.laenge=laenge*faktor;
        this.hoehe=hoehe*faktor;
    }
    //ertellen der methode volumen mit returnwert des Volumens:
    public double volumen(){
        return (this.hoehe*this.breite*this.laenge);
    }
    //erstellen der methode oberflaeche mit einem returnwert der oberfläche

    public double oberflaeche(){
        return ((this.hoehe*breite)*2+(this.laenge*hoehe)*2+(this.laenge*this.breite)*2);

    }
//erstellen einer toString methode zum auslesen der Werte
    @Override
    public String toString() {
        return "Quader" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", hoehe=" + hoehe;
    }
}
