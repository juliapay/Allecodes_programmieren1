package ArithmetischeAufgaben;

import java.util.Scanner;

public class Lenkerberechtigung {

    public static void uebung_1_6() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie ihr Alter ein:");
        int age = scanner.nextInt();
        lenkerBerechtigung(age);
    }

    private static void lenkerBerechtigung(int alter) {


        if (alter >= 15) {
            System.out.println("Du darfst für folgende Klassen den Führerschein machen:");
            System.out.println("Moped");
            if (alter >= 16) {
                System.out.println(" A1");
                System.out.println("F mit bestimmten Vorraussetzungen");
            }
            if (alter >= 17) {
                System.out.println("B mit Sondergenehmigung");
            }
            if (alter >= 18) {
                System.out.println("F");
                System.out.println("B");
                System.out.println("C1/C1E");
            }
            if (alter >= 21) {
                System.out.println("C/CE");
                System.out.println("D1/D1E");
            }
            if (alter >= 24) {
                System.out.println("D");
            }
        }
        if (alter < 15) {
            System.out.println("du kannst noch kein Fahrzeug fahren.");
        }
    }
}
