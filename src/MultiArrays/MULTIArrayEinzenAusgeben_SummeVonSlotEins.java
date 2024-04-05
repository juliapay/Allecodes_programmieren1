package MultiArrays;

import java.util.Arrays;

public class MULTIArrayEinzenAusgeben_SummeVonSlotEins {

    public class Arrays6 {
        public static void main(String[] args) {
            int[][] array2 = new int[3][3];
            //int[][] array2D = {{1, 2,3}, {3, 4,5},{5,6,7}};

            for (int i = 0; i < array2.length; i++) {

                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = i + j;

                }
            }
            for (int i = 0; i < array2.length; i++) {
                System.out.println("Array an Index " + i + " :");
                for (int j = 0; j < array2[i].length; j++) {
                    System.out.print(array2[i][j] + " ");
                }
                System.out.println();
            }


            int[][] array2D = {{10, 11, 12}, {20, 21, 22}, {30, 31, 32}};
            int length = 9;
            int[] array3 = new int[length];
            int counter = 0;
            int sum = 0;
            for (int i = 0; i < array2D.length; i++) {
                for (int j = 0; j < array2D[i].length; j++) {

                    array3[counter] = array2D[i][j];
                    counter++;
                    if (i == j) {
                        sum += array2D[i][j];
                    }

                }

            }
            System.out.println(Arrays.toString(array3));
            System.out.println(sum);
        }    }
}
