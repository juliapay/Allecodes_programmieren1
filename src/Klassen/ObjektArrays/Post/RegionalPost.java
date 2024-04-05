package Klassen.ObjektArrays.Post;

public class RegionalPost {
    //Klasse erstellt
    public static void main(String[] args) {
        //main-methode zum abrufen des programmes
        //erstellen der instanz von der klasse filialpost
        Filialpost platzAmPlatz = new Filialpost(10);
        //erstellen 1 paket -objektes Art1
        Paket p1 = new Paket(001, "Gasse");
        //füllen des array art 1
        platzAmPlatz.paketHinzufuegen(p1);
        //füllen des arrays art2
        platzAmPlatz.paketHinzufuegen(new Paket(002, "Kai"));
        platzAmPlatz.paketHinzufuegen(new Paket(003, "Straße"));
        platzAmPlatz.paketHinzufuegen(new Paket(004, "Platz"));
        //ausgabe in der konsole test wieviel pakete im array
        System.out.println(platzAmPlatz.getAnzahlPakete()+" Pakete im Array");
        //objekt aus dem array entfernen
        platzAmPlatz.paketEntfernen(002);
        System.out.println(platzAmPlatz.getAnzahlPakete()+" Pakete im Array");
        //ausgabe in der konsole mit der toString-methode
        System.out.println(platzAmPlatz);
        //test falsche id
        platzAmPlatz.paketEntfernen(005);
        //ausgabe der details objekt 1 mit eigener methode
        System.out.println(platzAmPlatz.paketFinden(001));
    }

}
