package Arrays;

import java.util.Scanner;

public class SucheZahlImArray {
    public class Arrays3 {
        public static void main(String[] args) {
            int[] arr = {3, 4, 5};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Welche Zahl suchen Sie im Array");
            int search = scanner.nextInt();


            System.out.println(arrayBoolean(arr, search));
            System.out.println(arrayBoolean(arr, 10));//wenn man eine bestimmte Zahl sucht
        }

        private static boolean arrayBoolean(int[] arr, int search) {
            boolean b = false;
            for (int element : arr) {
                if (element == search) {
                    b = true;
                    break;
                }
            }
            return b;
        }
    }
}
