package Arrays;

import java.util.Arrays;
import java.util.Random;

public class MaxZahl {
    public static void uebungArrays2() {
        Random random = new Random();
        float[] floatRandom = new float[5];

        for (int i = 0; i <= 4; i++) {

            float allNum = random.nextFloat(10 - 1);
            floatRandom[i] = allNum;
        }
        float maxNumber = floatRandom[0];
        for (float j : floatRandom) {

            if (j > maxNumber)
                maxNumber = j;
        }
        System.out.println("the largest element in the unsorted array is: " + maxNumber);

        Arrays.sort(floatRandom);
        float maxNum = floatRandom[floatRandom.length - 1];
        System.out.println("the largest element in the sorted array is: " + maxNum);


    }
}