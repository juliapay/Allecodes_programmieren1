package Arrays;

import java.util.Random;

public class SummeAllerInt {
    public static void uebungArrays4() {
        Random random = new Random();
        int[] integerRandom = new int[12];
        int sum = 0;

        for (int i = 0; i < integerRandom.length; i++) {

            int number = random.nextInt(100 - 1);
            integerRandom[i] = number;
            sum = sum + number;

        }
        System.out.println("the sum of all integers of the array is: " + sum);
    }
}
