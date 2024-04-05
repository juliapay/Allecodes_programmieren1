package Klassen.ObjektArrays.Post;

public class Paket {
//Klasse Paket mit Attributen integer und String
    private int id;
    private String adresse;
//Konstruktor mit Parameterliste
    public Paket(int id, String adresse) {
        this.id = id;
        this.adresse = adresse;
    }
//getter und setter methoden zum zugreifen auf die attribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
//to String methode zur ausgabe der attribute
    @Override
    public String toString() {
        return "\nPaket: " +
                "id: " + id +
                "     adresse: " + adresse+"\n";
    }
}
