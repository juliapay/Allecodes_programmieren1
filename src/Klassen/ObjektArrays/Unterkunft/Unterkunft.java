package Klassen.ObjektArrays.Unterkunft;

import java.util.Scanner;

public class Unterkunft {
    public static void main(String[] args) {
        Unterkunft absteige = new Unterkunft(15, 4, "luxus");

        System.out.println("Preis pro Bett: "+absteige.preisProBett());
        absteige.preisProBett();
        System.out.println("Preis für die Buchung der gesamten unterkunkt: " + absteige.preisProUnterkunft());

        absteige.preisProBuchung();
        System.out.println("es kostet: " + absteige.preisProBuchung() + " Euro");
        absteige.bucheBetten(4);
        System.out.println(absteige);


    }
    public int bettenProStockwerk;
    public int stockwerke;
    public String typ;
    public int anzahlBesetzt;
    public double preis;
    public double preisPerBuchung;
    public int buchung;

    public Unterkunft(int bettenProStockwerk, int stockwerke, String typ) {
        this.bettenProStockwerk = bettenProStockwerk;
        this.stockwerke = stockwerke;
        this.anzahlBesetzt = 0;
        this.typ = typ;
    }


    public double preisProBett() {


        switch (this.typ.toLowerCase()) {
            case "luxus":
                preis = 105.4;
                break;
            case "standard":
                preis = 57.5;
                break;
            case "lowcost":
                preis = 25;

        }
        return preis;
    }

    public double preisProUnterkunft() {

        return (preis * bettenProStockwerk) * stockwerke;

    }

    public double preisProBuchung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wieviel Betten wollen Sie buchen?");
        buchung = scanner.nextInt();
        return preis * buchung;

    }

    public void bucheBetten(int bucheBetten) {

        if (bucheBetten < (bettenProStockwerk * stockwerke)) {

            anzahlBesetzt += bucheBetten;
            System.out.println("die Anzahl der besetzten Betten ist nun: " + anzahlBesetzt);

        } else if (bucheBetten > (bettenProStockwerk * stockwerke)) {
            ausgebucht();
            System.out.println("Die Unterkunft ist ausgebucht!");
        }
    }

    public boolean ausgebucht() {
        return this.anzahlBesetzt==this.bettenProStockwerk*this.stockwerke;

    }

    @Override
    public String toString() {
        return "Unterkunft" +
                "bettenProStockwerk=" + bettenProStockwerk +
                ", stockwerke=" + stockwerke +
                ", typ='" + typ + '\'' +
                ", anzahlBesetzt=" + anzahlBesetzt +
                ", preis=" + preis +
                ", preisPerBuchung=" + preisPerBuchung +
                ", buchung=" + buchung +
                '}';
    }
}
