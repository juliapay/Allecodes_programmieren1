package ArithmetischeAufgaben;

import java.util.Scanner;

public class Modulor {
    public static void uebung_1_4() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie eine Zahl ein");
        int zahl = scanner.nextInt();

        modulor(zahl);

    }
    private static void modulor(int zahl) {

        if (zahl % 2 == 0) {
            System.out.println("Die Zahl ist gerade");
        } else {
            System.out.println("Die Zahl ist ungerade");
        }
    }

}
