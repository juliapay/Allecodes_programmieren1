package MultiArrays;

import java.util.Random;


public class Array3DSumAvMaxMin {
    public static void main(String[] args) {
        double[][][] array3D = new double[4][3][2];
        arrayBefuellen(array3D);
        summeAllerElemente(array3D);
        durchschnittAllerElemente(array3D);
        maxWert(array3D);
        minWert(array3D);
    }

    public static void arrayBefuellen(double[][][] array3D) {
        Random random = new Random();

        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {

                    double num = random.nextDouble(1.0);
                    array3D[i][j][k] = num;
                    System.out.print(array3D[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }

    public static void summeAllerElemente(double[][][] array3D) {
        double sum = 0;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {

                    sum += array3D[i][j][k];
                }
            }
        }
        System.out.println("die Summe aller Arrays ist: " + sum);
    }

    public static void durchschnittAllerElemente(double[][][] array3D) {
        double sum = 0;
        double durchschnitt = 0;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {

                    sum += array3D[i][j][k];
                    durchschnitt = sum / (array3D.length + array3D[i].length + array3D[i][j].length);
                }
            }
        }

        System.out.println("der Durchschnitt aller Arrays ist: " + durchschnitt);
    }

    public static void maxWert(double[][][] array3D) {
        double max = 0;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {

                    if (array3D[i][j][k] > max) {
                        max = array3D[i][j][k];
                    }
                }
            }
        }
        System.out.println("Der maximale Wert ist: " + max);
    }

    public static void minWert(double[][][] array3D) {
        double min = 1.0;
        for (int i = 0; i < array3D.length; i++) {
            for (int j = 0; j < array3D[i].length; j++) {
                for (int k = 0; k < array3D[i][j].length; k++) {

                    if (array3D[i][j][k] < min) {
                        min = array3D[i][j][k];
                    }
                }
            }
        }
        System.out.println("Der maximale Wert ist: " + min);


    }

}


