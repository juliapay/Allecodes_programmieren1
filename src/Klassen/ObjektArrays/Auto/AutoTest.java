package Klassen.ObjektArrays.Auto;

import Klassen.ObjektArrays.Auto.Auto;

//Erstellen der Klasse AutoTest
public class AutoTest {
    //Erstellen der mai-Methode zum Testen
    public static void main(String[] args) {
//Erstellen der Objekte auto1 und auto2 aus der Klasse Auto mit den im Konstruktor festgellegten Übergabeparametern
        Auto auto1 = new Auto("VW", "Golf", 2005);
        Auto auto2 = new Auto("Toyota","Camry",2018);


        System.out.println(auto1);//Aufruf der toStringmethode
        //testen der methoden anhand der erstellten Objekte.
        auto1.gasGeben(34);
        System.out.println("Es kommt kein Reh-->Gas geben");
        //Einbinden der Getter-Methoden in einen Output
        System.out.println("Der " + auto1.getMarke() + " " + auto1.getModell() + " fährt " + auto1.getGeschwindigkeit() + " km/h");
        System.out.println("Es kommt noch immer  kein Reh-->Gas geben");
        auto1.gasGeben(5);
        System.out.println("Der " + auto1.getMarke() + " " + auto1.getModell() + " fährt " + auto1.getGeschwindigkeit() + " km/h");
        System.out.println("Es kommt ein Reh-->Bremsen");
        auto1.bremsen(10);
        System.out.println("Der " + auto1.getMarke() + " " + auto1.getModell() + " fährt " + auto1.getGeschwindigkeit() + " km/h");
        System.out.println("-------------Zweites Auto-----------");
        System.out.println(auto2);//Aufruf der toStringmethode
        auto2.gasGeben(100);
        System.out.println("Der " + auto2.getMarke() + " " + auto2.getModell() + " fährt " + auto2.getGeschwindigkeit() + " km/h");

    }
}
