package ArithmetischeAufgaben;

import java.util.Scanner;

public class SwitchCaseMitDivOperanten {

    public static void uebung_1_10() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den ersten Operanden ein:");
        double operand1 = scanner.nextDouble();
        System.out.println("geben Sie die Operation ein(+,-,*,/");
        String operation = scanner.next();
        System.out.println("Geben Sie den zweiten Operanten ein");
        double operand2 = scanner.nextDouble();


        switch (operation) {

            case "+":
                double summe = operand1 + operand2;
                System.out.println("Die Operation ergibt: " + summe);
                break;
            case "-":
                double differenz = operand1 - operand2;
                System.out.println("Die Operation ergibt: " + differenz);
                break;
            case "*":
                double multiplikation = operand1 * operand2;
                System.out.println("Die Operation ergibt: " + multiplikation);
                break;
            case "/":
                double division = operand1 / operand2;
                System.out.println("Die Operation ergibt: " + division);
                break;

        }

    }
}
