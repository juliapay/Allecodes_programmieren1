package ArithmetischeAufgaben;

import java.util.Scanner;

public class ZahlenDurchXTeilbarBis100 {
    public static void uebung_2_2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie den Divisor ein:");
        int divisor = scanner.nextInt();
        int dividend = 0;
        while (dividend <= 100) {

            if (dividend % divisor == 0) {

                System.out.print(dividend + ", ");
            }
            dividend++;
        }
    }
}

