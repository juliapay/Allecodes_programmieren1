package MultiArrays;

import java.util.Random;

public class Array2DSumme {
    public class ArraySumme2D {

        //Summe berechnen aller Elemente im Array
        public static void main(String[] args) {

            Random random = new Random();

            double[][] sumOfAll = new double[4][5];
            double sum = 0;

            for (int i = 0; i < sumOfAll.length; i++) {
                for (int j = 0; j < sumOfAll[i].length; j++) {
                    double number = random.nextDouble(10);
                    sumOfAll[i][j] = number;
                    sum += number;
                    System.out.print(sumOfAll[i][j] + " ");
                }
            }

            System.out.println("die Summe beträgt: " + sum);
        }


    }
}
