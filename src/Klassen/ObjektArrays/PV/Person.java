package Klassen.ObjektArrays.PV;

public class Person {

    //deklaration der variablen
    private  int id;
    private String vorname;
    private int alter;
    private double groesse;
    private String nachname;
    private String geburtsland;
    private String haarfarbe;
    private boolean hatGlatze;
    private float schuhgroesse;
    private boolean hatBeziehung;



//Konstruktor nur für vorname und id
    public Person(int id, String vorname) {
        this.id = id;
        this.vorname = vorname;
    }


    //getter und setter - methoden für alle anderen variablen
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public double getGroesse() {
        return groesse;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtsland() {
        return geburtsland;
    }

    public void setGeburtsland(String geburtsland) {
        this.geburtsland = geburtsland;
    }

    public String getHaarfarbe() {
        return haarfarbe;
    }

    public void setHaarfarbe(String haarfarbe) {
        this.haarfarbe = haarfarbe;
    }

    public boolean isHatGlatze() {
        return hatGlatze;
    }

    public void setHatGlatze(boolean hatGlatze) {
        this.hatGlatze = hatGlatze;
    }

    public float getSchuhgroesse() {
        return schuhgroesse;
    }

    public void setSchuhgroesse(float schuhgroesse) {
        this.schuhgroesse = schuhgroesse;
    }

    public boolean isHatBeziehung() {
        return hatBeziehung;
    }

    public void setHatBeziehung(boolean hatBeziehung) {
        this.hatBeziehung = hatBeziehung;
    }
//to string für output ind der konsole
    @Override
    public String toString() {
        return "Person " +
                "id: " + id +
                ", vorname: " + vorname;
    }
}
