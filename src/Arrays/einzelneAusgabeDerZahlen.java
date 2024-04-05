package Arrays;

import java.util.Random;

public class einzelneAusgabeDerZahlen {
    public static void uebungArrays5() {
        Random random = new Random();
        float[] randomFloats = new float[15];

        for (int i = 0; i < randomFloats.length; i++) {
            float number = random.nextFloat(100 - 1);
            randomFloats[i] = number;
            System.out.println("slot number: " + i + " has the float number: " + number);
        }
    }
}
