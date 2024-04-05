package ArithmetischeAufgaben;

import java.util.Scanner;

public class TemperaturMitBewoelkt {

    public static void uebung_1_7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wieviel Grad hat es draußen?");
        float grad = scanner.nextFloat();
        while (grad <= -20 || grad >= 35) {
            System.out.println("Hast du dich vielleicht vertippt?");
            System.out.println("Wieviel Grad hat es draußen?");
            grad = scanner.nextFloat();
        }
        System.out.println("wie sind die Wetterbedingungen?\nErlaubte Werte: sonnig, bewölkt, regen");
        String bedingung = scanner.next().toLowerCase();

        while (!(bedingung.equals("regen")) && !(bedingung.equals("sonnig")) && !(bedingung.equals("trüb"))) {
            System.out.println("Hast du dich vielleicht vertippt?");
            System.out.println("wie sind die Wetterbedingungen?\nErlaubte Werte: sonnig, bewölkt, regen");
            bedingung = scanner.next().toLowerCase();
        }


        if (grad > -22 && grad <= 0) {
            switch (bedingung) {
                case "regen":
                    System.out.println("es regnet nicht es schneit!\nschlaf weiter");
                    break;
                case "sonnig":
                    System.out.println("ist schon sehr kalt zum hinausgehen");
                    break;
                case "trüb":
                    System.out.println("schlaf weiter");
                    break;
            }
        } else if (grad > 0 && grad < 15) {

            switch (bedingung) {
                case "regen":
                    System.out.println("schlaf weiter");
                    break;
                case "sonnig":
                    System.out.println("ist schon noch ein bißchen kalt, probier einmal spazieren...aber langsam");
                    break;
                case "trüb":
                    System.out.println("schlaf weiter");
                    break;
            }
        } else if (15 <= grad && grad <= 34) {
            switch (bedingung) {
                case "regen":
                    System.out.println("schlaf weiter");
                    break;
                case "sonnig":
                    System.out.println("ab nach draußen. Einschmieren nicht vergessen");
                    break;
                case "trüb":
                    System.out.println("egal, trotzdem warm. ab nach draußen");
                    break;
            }
        }
    }
}
