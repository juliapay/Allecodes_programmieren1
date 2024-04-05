package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Durchschnitt {

    public static void uebungArrays10() {
        Random random = new Random();
        double[] numberRandom = new double[9];
        double sum = 0;
        for (int i = 0; i < 9; i++) {
            numberRandom[i] = random.nextDouble(100);
            sum += numberRandom[i];
        }
        System.out.println(Arrays.toString(numberRandom));
        System.out.println("The average element is:" + (sum / 9));

    }

    public static void uebung_3_4() {
        int[] durchschnitt = new int[12];
        Random random = new Random();
        int summe = 0;

        for (int i = 0; i < durchschnitt.length; i++) {

            int zahlen = random.nextInt(12);
            durchschnitt[i] = zahlen;
            summe = summe + zahlen;
            System.out.print(durchschnitt[i]);
        }
        double wert = (double) summe / 12;
        System.out.println(Arrays.toString(durchschnitt));
        System.out.println("der durchschnittswert ist: " + wert);

    }

    private static void uebung_3_5() {
        Scanner scanner = new Scanner(System.in);
        int faecherlaenge = scanner.nextInt();
        int summe = 0;
        int[] faecher = new int[faecherlaenge];

        for (int i = 0; i < faecher.length; i++) {
            System.out.println("gib deine Note ein!");
            /*int note = scanner.nextInt();
            faecher[i] = note;*/
            faecher[i] = scanner.nextInt();

            System.out.println(faecher[i]);
            summe = summe + faecher[i];
            float wert = (float) summe / faecher.length;
            System.out.println(Arrays.toString(faecher));
            System.out.println("der Notenschnitt beträgt: " + wert);

        }
    }
}
