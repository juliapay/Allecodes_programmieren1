package Klassen.ObjektArrays.makeDo;

public class Task {

    //Attribute erstellen ganzzahlig id, Buchstaben name, boolean true/false status
    private int id;
    private String name;
    private boolean status;

    // Konstruktor mit Parameterliste ohne boolean datentyp
    public Task(int id, String name) {
        this.id = id;
        this.name = name;
        this.status = false;
    }
//getter und setter methoden zur verwndung für andere Klassen, da Attribute privat sind


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
// to String methode zum ausgeben in der konsole
    @Override
    public String toString() {
        return
                id +"   "+
                        name +
                        " " + status;
    }
}


