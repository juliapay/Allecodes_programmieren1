package Arrays;

import java.util.Random;

public class randomBefuellen {
    public static void uebungArrays1() {

        Random random = new Random();
        int[] numberRandom = new int[10];

        for (int i = 0; i <= 9; i++) {

            int number = random.nextInt(100 - 1);
            numberRandom[i] = number;
            System.out.println(numberRandom[i]);
        }
    }
}
