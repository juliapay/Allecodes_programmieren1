package ArithmetischeAufgaben;

import java.util.Scanner;

public class ungeradeZahlen {
    public static void ungeradeZahlenausgabe() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a positive integer");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i += 2) {

            System.out.print(i + " ");
        }
    }
}
