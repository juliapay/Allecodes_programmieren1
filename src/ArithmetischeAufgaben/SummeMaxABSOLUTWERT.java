package ArithmetischeAufgaben;

import java.util.Random;

public class SummeMaxABSOLUTWERT {

    public static void uebung_1_11() {

        summe();
        max1();
        max2();
        abs();
    }

    private static void summe() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        System.out.println("die Zahlen sind:" + num1 + " und " + num2);
        int sum = num1 + num2;
        System.out.println("Die Summe beträgt: " + sum);
    }

    public static void max1() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        System.out.println("die Zahlen sind:" + num1 + " und " + num2);
        if (num1 > num2) {
            System.out.println("Die Zahl " + num1 + " ist größer als die Zahl " + num2);
        }
    }
    public static void max2() {
        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        System.out.println("die Zahlen sind:" + num1 + " und " + num2);
        if (num2 > num1) {
            System.out.println("Die Zahl " + num2 + " ist größer als die Zahl " + num1);
        }
    }
    public static void abs() {
        Random random = new Random();
        int num3 = random.nextInt(100);
        System.out.println("die Zahl ist " + num3);
        System.out.println("der Absolutwert der Zahl beträgt: " + Math.abs(num3));
    }
}
