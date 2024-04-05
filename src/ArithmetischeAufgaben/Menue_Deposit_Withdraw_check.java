package ArithmetischeAufgaben;

import java.util.Scanner;

public class Menue_Deposit_Withdraw_check {
    public static void bankomatBedienung() {

        int option = 0;
        double balance = 0;
        double charge = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your balance:");
        balance = scanner.nextDouble();

        do {
            System.out.println("Menu:\n1. Deposit \n2. Withdraw \n3. Check Balance \n4. Exit\nEnter your Choice:");
            option = scanner.nextInt();

            if (option == 1) {

                System.out.println("Enter your Deposit:");
                charge = scanner.nextDouble();
                balance = balance + charge;
                System.out.println("Your account has been credited with " + charge + " Euro\nYour new account balance is " + balance + " Euro\n");

            } else if (option == 2) {

                System.out.println("Enter your Withdraw:");
                charge = scanner.nextDouble();
                balance = balance - charge;
                System.out.println(charge + " Euro have been withdrawn from your account. \nYour new account balance is " + balance + " Euro\n");
            } else if (option == 3) {
                System.out.println("Your Account Balance is: " + balance + " Euro\n");
            }
        } while (option != 4);
    }

}
