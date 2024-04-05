package ArithmetischeAufgaben;

import java.util.Scanner;

public class SwitchCaseMitAbbruchLoop {

    public class Uebung2_5 {
        public static void main(String[] args) {

            String quit = "";

            while (!(quit.equals("q"))) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Geben Sie den ersten Operanden ein:");
                double operand1 = scanner.nextDouble();
                System.out.println("geben Sie die Operation ein(+,-,*,/)");
                String operation = scanner.next();

                while (!operation.equals("+") && !operation.equals("-") && !operation.equals("*") && !operation.equals("/")) {
                    System.out.println("geben sie die Operation ein(+,-,*,/)");
                    operation = scanner.next();
                }
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
                System.out.println("Drücke (q) wenn du das Programm beenden willst. sonst (w)");
                quit = scanner.next();
                if (quit.equals("q"))
                    break;
            }

        }  }
}
