package Stringaufgaben;

import java.util.Scanner;

public class Pallindrom_StringUmkehren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie das Wort oder den Satz ein:");
        String satz = scanner.nextLine().toLowerCase();

        for (int i = 0; i <= satz.length()-1; i++) {
            char character = satz.charAt(i);
            if (character == '.' || character == ':' || character == '!' || character == ';') {

                satz = satz.replace('.', ' ');
                satz = satz.replace('!', ' ');
                satz = satz.replace(':', ' ');
            }
        }
        satz = satz.replaceAll("\\s+","");
        StringBuilder strb = new StringBuilder(satz);
        String satz1 = strb.reverse().toString();

        System.out.println(satz + satz1);

        if (satz.equals(satz1)) {
            System.out.println("dieser Satz ist ein Pallindrom: " + satz1);
        } else {
            System.out.println("dieser Satz ist kein Pallindrom");
        }


    }
}
