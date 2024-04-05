package ArithmetischeAufgaben;

import java.util.Scanner;

public class Waehrungsrechner {

    public static void uebung_1_14() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Gewünschte Währung ein:(USD,CZK,HUF,PLN)");
        String waehrung = scanner.next().toUpperCase();
        System.out.println("Geben Sie den Umrechnungsbetrag in Euro ein:");
        double euro = scanner.nextDouble();
        exchangeCurrency(waehrung, euro);

    }

    private static void exchangeCurrency(String waehrung, double euro) {
        double umrechnung;
        switch (waehrung) {

            case "USD":
                umrechnung = euro * 1.09;
                System.out.println("1,09 * " + euro + " = " + umrechnung);
                break;
            case "CZK":
                umrechnung = euro * 20.33;
                System.out.println("20,33 * " + euro + " = " + umrechnung);
                break;
            case "HUF":
                umrechnung = euro * 392.91;
                System.out.println("392,91 * " + euro + " = " + umrechnung);
                break;
            case "PLN":
                umrechnung = euro * 4.31;
                System.out.println("4,31 * " + euro + " = " + umrechnung);
                break;
            default:
                System.out.println("Diese Währung kann nicht umgerechnet werden!");

        }
    }


}
