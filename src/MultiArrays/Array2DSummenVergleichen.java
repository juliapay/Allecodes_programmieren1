package MultiArrays;

import java.util.Random;

public class Array2DSummenVergleichen {


    public static void main(String[] args) {

        int[][] summenVergleich = new int[3][5];
        arrayBefuellen(summenVergleich);
        alleGleicheSummen(summenVergleich);

    }

    public static void arrayBefuellen(int[][] summenVergleich) {
        for (int i = 0; i < summenVergleich.length; i++) {
            for (int j = 0; j < summenVergleich[i].length; j++) {
                Random random = new Random();
                int num = random.nextInt(10);
                summenVergleich[i][j] = num;
                System.out.print(summenVergleich[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void alleGleicheSummen(int[][] summenVergleich) {
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < summenVergleich.length; i++) {
            for (int j = 0; j < summenVergleich[i].length; j++) {
                if (i == 0) {
                    sum1 += summenVergleich[i][j];
                } else if (i == 1) {
                    sum2 += summenVergleich[i][j];
                } else if (i == 2) {
                    sum3 += summenVergleich[i][j];
                }
            }
        }
        System.out.println("Summe 1. Array " + sum1);
        System.out.println("Summe 2. Array " + sum2);
        System.out.println("Summe 3. Array " + sum3);
        if (sum1 == sum2 && sum2 == sum3) {
            System.out.println("Die Summe aller 3 eindimensionalen Arrays ist die selbe.");
        } else {
            System.out.println("Die Summe aller 3 eindimensionalen Arrays ist nicht dieselbe.");
        }
    }
}
