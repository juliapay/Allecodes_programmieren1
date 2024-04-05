package Stringaufgaben;

import java.util.Scanner;

public class userLoginPasswort {
    public static void userLogin() {
        String loginName = "";
        String loginPw = "";
        int i = 1;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the username");
        loginName = scanner.next();
        System.out.println("Please enter the password");
        loginPw = scanner.next();


        while ((!loginName.equals("user123")) && (!loginPw.equals("password123")) && (i <= 3)) {

            System.out.println("Username or Password is not correct. Please try again\nYou have " + (4 - i) + " tries left.");
            System.out.println("Please enter the username");
            loginName = scanner.next();
            System.out.println("Please enter the password");
            loginPw = scanner.next();

            if (i == 3) {
                System.out.println("Destruct sequence initiated!   RUN! ");
            }
            i++;
        }
        if ((loginName.equals("user123")) && (loginPw.equals("password123"))) {
            System.out.println("Well done!\nChoose a better password!");
        }
    }
}
