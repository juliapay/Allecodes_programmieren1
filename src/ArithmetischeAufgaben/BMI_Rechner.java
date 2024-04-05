package ArithmetischeAufgaben;

import java.util.Scanner;

public class BMI_Rechner {

    public static void uebung_1_9() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("geben sie ihr Gewicht in kg ein");
        float weight = scanner.nextFloat();
        System.out.println("geben sie ihre Körpergröße in cm ein:");
        float height = scanner.nextFloat();

        float bmi = berechnung(weight, height);

        ausgabe(bmi);


    }

    public static float berechnung(float weight, float height) {

        return height / (weight * weight);
    }

    private static void ausgabe(float bmi) {
        if (bmi < 20) {
            System.out.println("medizinischer Gewichtsstatus: Untergewicht");
        } else if (20 <= bmi && bmi <= 24) {
            System.out.println("medizinischer Gewichtsstatus: Normalgewicht");
        } else if (24 < bmi && bmi <= 29) {
            System.out.println("medizinischer Gewichtsstatus: Übergewicht");

        } else if (29 < bmi && bmi <= 40) {
            System.out.println("medizinischer Gewichtsstatus: Adiposidas");

        } else if (bmi > 40) {
            System.out.println("medizinischer Gewichtsstatus: starke Adiposidas");

        }

    }
}
