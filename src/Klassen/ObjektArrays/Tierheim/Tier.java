package Klassen.ObjektArrays.Tierheim;

public class Tier {
    private String name;
    private String gattung;
//Konstruktor zum Erstellen einer instanz
    public Tier(String name, String gattung) {
        this.name = name;
        this.gattung = gattung;
    }
//SetterGetter zum Holen und beschreiben der Attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGattung() {
        return gattung;
    }

    public void setGattung(String gattung) {
        this.gattung = gattung;
    }
// für die Konsolen ausgabe inder main
    @Override
    public String toString() {
        return "Tier" +
                "name='" + name + '\'' +
                ", gattung='" + gattung + '\'';
    }
}
