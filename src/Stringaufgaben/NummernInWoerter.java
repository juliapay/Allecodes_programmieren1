package Stringaufgaben;

import java.util.Scanner;

public class NummernInWoerter {
    public static void nummerInWoerterKonvertieren() {

        int number;


        Scanner scanner = new Scanner(System.in);


        System.out.println("Geben Sie eine Zahl zwischen 1 und 10 ein:");
        number = scanner.nextInt();

        while (number < 1 || number > 10) {

            System.out.println("Ungültige Zahl eingegeben. Bitte geben Sie eine Zahl zwischen 1 und 10 ein");
            number = scanner.nextInt();
        }
        switch (number) {

            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
        }
    }
}
