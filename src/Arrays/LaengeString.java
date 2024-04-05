package Arrays;

import java.util.Random;

public class LaengeString {
    public static void uebungArrays3() {


        String[] stringRandom = new String[8];
        Random random = new Random();

        for (int i = 0; i < stringRandom.length; i++) {

            StringBuilder sb = new StringBuilder();
            int length = random.nextInt(10) + 1;
            for (int j = 0; j < length; j++) {
                char c = (char) (random.nextInt(26) + 'a');
                sb.append(c);
            }
            stringRandom[i] = sb.toString();
            System.out.println("Slot " + i + ": content= " + stringRandom[i] + "; length= " + stringRandom[i].length());
        }
    }
}
