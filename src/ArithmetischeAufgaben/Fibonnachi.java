package ArithmetischeAufgaben;

public class Fibonnachi {
    public static void fibonnachiZahlen() {

        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 0; i < 20; i++) {

            System.out.print(c + " ");

            c = a + b;
            a = b;
            b = c;

        }

    }


}
