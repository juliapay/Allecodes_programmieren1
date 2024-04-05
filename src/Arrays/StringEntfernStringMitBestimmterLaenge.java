package Arrays;

import java.util.Scanner;

public class StringEntfernStringMitBestimmterLaenge {
    private static void uebung_3_8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein");
        int n = scanner.nextInt();
        String[] woerterArray = new String[n];

        System.out.println("Geben Sie " + n + " Wörter ein:");

        for (int i = 0; i < n; i++) {

            woerterArray[i] = scanner.next();
        }

        System.out.println("Geben Sie eine Zahl ein, die größer als 0 ist");
        int k = scanner.nextInt();

        for (int i = 0; i < woerterArray.length; i++) {
            int anzahl = 0;
            for (int j = 0; j < woerterArray[i].length(); j++) {

                anzahl++;
                if (anzahl > k) {
                    woerterArray[i] = null;
                    break;
                }
            }
            if (woerterArray[i] != null) {
                System.out.print(woerterArray[i] + " ");
            }
        }
    }
}
