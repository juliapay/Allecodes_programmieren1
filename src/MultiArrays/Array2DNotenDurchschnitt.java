package MultiArrays;

import java.util.Arrays;

public class Array2DNotenDurchschnitt {
    public class Uebung_3_12 {
        public static void main(String[] args) {


            int[][] schuelerNoten = {{2, 2, 2}, {3, 2, 1}, {1, 2, 1, 2, 1}};
            double[] durchschnitte = notenDurchschnitt(schuelerNoten);
            notenDurchschnitt(schuelerNoten);
            System.out.println("Notendurchschnitt pro Fach: " + Arrays.toString(durchschnitte));
            notenDurchschnittGesamt(durchschnitte);

            System.out.println("Der Gesamtnotendurchschnitt beträgt: " + notenDurchschnittGesamt(durchschnitte));
        }

        private static double[] notenDurchschnitt(int[][] schuelerNoten) {
            double[] durchschnitte = new double[schuelerNoten.length];
            for (int i = 0; i < schuelerNoten.length; i++) {
                int counter = 0;
                int summe = 0;
                for (int note : schuelerNoten[i]) {

                    summe += note;
                    counter++;
                    durchschnitte[i] = (double) summe / counter;//CASTING!
                }
            }
            return durchschnitte;
        }

        private static double notenDurchschnittGesamt(double[] durchschnitte) {
            double summe = 0;
            int i;
            for (i = 0; i < durchschnitte.length; i++) {

                summe += durchschnitte[i];
            }
            double gesamtdurchschnitt =  summe / i;
            return gesamtdurchschnitt;
        }
    }
}
