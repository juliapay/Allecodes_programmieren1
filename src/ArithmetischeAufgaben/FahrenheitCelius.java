package ArithmetischeAufgaben;

import java.util.Scanner;

public class FahrenheitCelius {

    public static void uebung_1_12() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein ob Fahrenheit(f) oder Celsius(c)");
        char einheit = scanner.nextLine().toLowerCase().charAt(0);
        if (einheit == 'f' ) {
            umwandelnF();
        }
        if (einheit == 'c' ) {
            umwandelnC();
        }
    }
    private static void umwandelnF() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Fahrenheit ein");
        double fahrenheit = scanner.nextDouble();
        double celcius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Die Grade in Celsius betragen: " + celcius);

    }

    private static void umwandelnC() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben sie die Celsius ein");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 1.8) + 32;
        System.out.println("Die Grade in Fahrenheit betragen: " + fahrenheit);

    }
}
