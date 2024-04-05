package Arrays;

import java.util.Random;

public class NurGeradeZahlenAusgeben {
    public static void uebungArrays6() {

        Random random = new Random();
        int[] numberRandom = new int[20];

        for (int i = 0; i <= 9; i++) {

            int number = random.nextInt();
            numberRandom[i] = number;
            int modulo = number % 2;
            if (modulo == 0) {
                System.out.println(numberRandom[i]);
            }
        }
    }
}
