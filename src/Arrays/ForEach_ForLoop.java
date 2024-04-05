package Arrays;

import java.util.Arrays;

public class ForEach_ForLoop {

    public class Arrays1 {
        public static void main(String[] args) {
            int[] array = new int[3];
            array[0] = 4;
            array[1] = 6;
            array[2] = 5;
            System.out.println(array);
            System.out.println(Arrays.toString(array));
            int[] arr = {3, 4, 5};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
            for (int element : arr) {
                System.out.println(element + " ");
            }
        }
    }
}
