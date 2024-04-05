package Arrays;

import java.util.Arrays;

public class UmgekehrtAusgeben {

    public class Arrays5 {
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(arrayUmgekehrt(array)));
        }

        private static int[] arrayUmgekehrt(int[] arr) {
            int[] arrays = new int[arr.length];
            int count = 0;
            for (int i = arr.length - 1; i >= 0; i--) {
                arrays[count] = arr[i];
                count++;
            }
            return arrays;
        }
    }
}
