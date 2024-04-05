package ArithmetischeAufgaben;

import java.util.Random;
import java.util.Scanner;

public class GeheimzahlMitCloseCall {

    public static void uebung_1_8() {

        Scanner scanner = new Scanner(System.in);
        int geheimzahl = 42;
        System.out.println("give me your number");
        int zahl = scanner.nextInt();


        while (zahl != geheimzahl) {
            if (zahl > geheimzahl && !(zahl < geheimzahl + 3)) {
                System.out.println("No, that was too high");
            } else if (zahl < geheimzahl + 3 && zahl > geheimzahl) {

                System.out.println("no, you have to look lower...but it was a close call");
            } else if (zahl < geheimzahl && !(zahl > geheimzahl - 3)) {


                System.out.println("No, that was too low");

            } else if (zahl > geheimzahl - 3 && zahl < geheimzahl) {
                System.out.println("no, you have to look higher...but it was a close call");
            }

            System.out.println("try again:");
            zahl = scanner.nextInt();

        }
        if (zahl == geheimzahl) {
            System.out.println("THat's my girl!");
        }
    }
    public class Uebung_2_6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int geheimzahl = random.nextInt(100 - 1);

            System.out.println("give me your number\nPress (0) if you want to quit");
            int zahl = 1;
            while (zahl != geheimzahl && zahl!=0) {
                // System.out.println("give me your number\nPress (0) if you want to quit");
                zahl = scanner.nextInt();

                if (zahl > geheimzahl && !(zahl < geheimzahl + 3)) {
                    System.out.println("No, that was too high");
                } else if (zahl < geheimzahl + 3 && zahl > geheimzahl) {

                    System.out.println("no, you have to look lower...but it was a close call");
                } else if (zahl < geheimzahl && !(zahl > geheimzahl - 3) && zahl != 0) {


                    System.out.println("No, that was too low");

                } else if (zahl > geheimzahl - 3 && zahl < geheimzahl) {
                    System.out.println("no, you have to look higher...but it was a close call");
                }


                if (zahl != 0) {
                    System.out.println("try again:");
                    //  zahl = scanner.nextInt();
                }
            }


            if (zahl == geheimzahl) {
                System.out.println("THat's my girl!");
            }

        }}
}
