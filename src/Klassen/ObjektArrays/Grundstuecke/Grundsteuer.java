package Klassen.ObjektArrays.Grundstuecke;

public class Grundsteuer {//Erstellen der Klasse



    // Erstellen einer methode mit Rückgabe-Dateientyp double und den Übergabeparameter
    public double grundsteuerBerechnen(int[][] grundstuecke) {

//deklarieren und initialisieren der einzelnen Variablen
        double steuer1 = 0;
        double steuer2 = 0;
        double steuer3 = 0;
        // rechnung der steuer/m² für die einzelnen typen typenbezeichnung im ersten slot der zeilen des arrays
        for (int i = 0; i < grundstuecke.length; i++) {

            if (grundstuecke[i][0] == 1) {// erster Slot Zeile i=0
                steuer1 = ((grundstuecke[0][1] * grundstuecke[0][2]) * 3.20);
            }
            if (grundstuecke[i][0] == 2) {// erster Slot Zeile i=1
                steuer2 = ((grundstuecke[1][1] * grundstuecke[1][2]) * 2.10);
            }
            if (grundstuecke[i][0] == 3) {// erster Slot Zeile i=2
                steuer3 = ((grundstuecke[2][1] * grundstuecke[2][2]) * 0.90);
            }
        }
        return (steuer1 + steuer2 + steuer3);//Rückgabewert
    }
}
