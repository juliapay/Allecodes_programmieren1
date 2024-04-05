package ArithmetischeAufgaben;

import java.util.Scanner;

public class SummeAllerZahlenBisZurZahl {
    public static void uebung_2_1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein.");
        int zahl = scanner.nextInt();
        int sum = 0;
        while (zahl >= 0) {

            sum = zahl + sum;
            zahl--;
        }
        System.out.println(sum);
    }

}
