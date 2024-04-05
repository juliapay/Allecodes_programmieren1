package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MaxZahl_MinZahl {
    public static void uebungArrays8() {

        Scanner scanner = new Scanner(System.in);
        int[] arrayNumber = new int[10];
        int max = 0;
        for (int i = 0; i < 10; i++) {

            System.out.println("write an integer");
            arrayNumber[i] = scanner.nextInt();
            if (arrayNumber[i] > max) {
                max = arrayNumber[i];
            }
        }
        System.out.println(Arrays.toString(arrayNumber));
        System.out.println("The highest number is: " + max);
    }

    public static void uebungArrays9() {
        Random random = new Random();
        int[] numberRandom = new int[6];

        for (int i = 0; i < 6; i++) {
            numberRandom[i] = random.nextInt();
        }
        int min=numberRandom[0];
        System.out.println(Arrays.toString(numberRandom));
        for (int i = 0; i < 6; i++) {
            if (numberRandom[i]<=min){
                min= numberRandom[i];
            }
        }
        System.out.println("The lowest number is: " +min);
    }
}
