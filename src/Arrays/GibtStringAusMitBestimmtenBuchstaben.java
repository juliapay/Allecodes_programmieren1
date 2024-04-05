package Arrays;

import java.util.Random;
import java.util.Scanner;

public class GibtStringAusMitBestimmtenBuchstaben {

    public static void uebungArrays7() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the first character of the String:");
        char characterInput = scanner.next().charAt(0);

        String[] stringRandom = new String[10];
        Random random = new Random();

        for (int i = 0; i < stringRandom.length; i++) {

            StringBuilder sb = new StringBuilder();
            int length = random.nextInt(50) + 1; // generate a random length between 1 and 50

            for (int j = 0; j < length; j++) {

                char character = (char) (random.nextInt(26) + 'a');
                sb.append(character);
            }
            stringRandom[i] = sb.toString();
            System.out.println(stringRandom[i]);
        }
        boolean found = false;
        for (String str : stringRandom) {
            if (str.charAt(0) == characterInput) {

                found = true;
                System.out.println("The following string starts with the chosen character: " + str);
            }
        }

        if (!found) {

            System.out.println("No string starts with the chosen character.");
        }
    }
}
