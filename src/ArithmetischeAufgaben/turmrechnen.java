package ArithmetischeAufgaben;

import java.util.Scanner;

public class turmrechnen {
    public static void turmrechnenForLoop() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter a positive integer");
        int num = scanner.nextInt();
        int product = 1;

        for (int i = 2; i <= 9; i++) {
            product = num * i;

            System.out.println(num + " * " + i + " = " + product);
            num = product;
        }
        int quotient = product;

        for (int i = 2; i <= 9; i++) {

            num = quotient / i;

            System.out.println(quotient + " / " + i + " = " + num);
            quotient = num;
        }
    }
    public static void turmrechnenWhileLoop() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive integer");
        int num = scanner.nextInt();
        int product = 1;
        int i = 2;

        while (i <= 9) {
            product = num * i;

            System.out.println(num + " * " + i + " = " + product);
            num = product;
            i++;
        }
        int quotient = product;
        i = 2;
        while (i <= 9) {
            num = quotient / i;

            System.out.println(quotient + " / " + i + " = " + num);
            quotient = num;
            i++;
        }

    }

}
