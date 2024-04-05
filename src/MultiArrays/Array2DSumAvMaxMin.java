package MultiArrays;

import java.util.Random;

public class Array2DSumAvMaxMin {

    public static void main(String[] args) {

        int[][] multiArray = new int[8][8];
        fillArray(multiArray);
        summe(multiArray);
        averageArray(multiArray);
        maxElement(multiArray);
        minElement(multiArray);

    }
    //-------------ARRAY 2D BEFÜLLEN
    public static void fillArray(int[][] multiArray) {
        Random random = new Random();
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                int num = random.nextInt(100)+1;//Nummer nicht 0
                multiArray[i][j] = num;
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void summe(int[][] multiArray) {

        int sum = 0;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {

                sum += multiArray[i][j];
            }
        }
        System.out.println("die Summe beträgt: " + sum);
    }

    public static void averageArray(int[][] multiArray) {
        int sum = 0;
        double average = 0;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                sum += multiArray[i][j];

            }
            average = sum / (multiArray.length + multiArray[i].length);

        }
        System.out.println("der durchschnitt beträgt:" + average);
    }

    public static void maxElement(int[][] multiArray) {
        int num = 0;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] > num) {

                    num = multiArray[i][j];
                }
            }
        }

        System.out.println("die größte Zahl des Array ist: " + num);
    }

    public static void minElement(int[][] multiArray) {
        int num = 101;

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                if (multiArray[i][j] <= num) {

                    num = multiArray[i][j];

                }
            }
        }
        System.out.println("die kleinste Zahl ist: " + num);
    }
}


