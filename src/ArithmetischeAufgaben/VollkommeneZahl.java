package ArithmetischeAufgaben;

public class VollkommeneZahl {

    public static void uebung_2_8() {

        for (int i = 1; i <= 10000; i++) {
            int summe =0;
            for (int j = 1; j < i; j++) {

                if (i % j == 0) {

                    summe += j;
                }
            }
            if (summe==i) {

                System.out.println(summe);
            }
        }
    }
}
