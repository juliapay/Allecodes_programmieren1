package Klassen.ObjektArrays.Tierheim;

import java.util.Arrays;

public class ArcheNoah {
    private Tier[] haustiere;
    private int anzahlHaustiere;

    //Konstruktor erstellen des neuen Arrays haustiere mit den Objekten der Klasse Tier
    public ArcheNoah(int maxAnzahlTiere) {

        this.haustiere = new Tier[maxAnzahlTiere];
    }

    // Hinzufügen tier
    public void tierHinzufuegen(Tier tier) {
        //Condition noch Platz frei ist sonst Konsolenausgabe
        if (anzahlHaustiere <= haustiere.length) {
            //iteration durch das array
            for (int i = 0; i < haustiere.length; i++) {
                //wenn der Slot des arrays frei ist
                if (haustiere[i] == null) {
                    // einsetzten des Tieres in den freine Platz
                    haustiere[i] = new Tier(tier.getName(), tier.getGattung());
                    // haustieranzahl wird erhöht
                    anzahlHaustiere++;
                    //Sonst füllt er alle slots mit tier
                    break;
                }
            }
        } else {
            System.out.println("Tierheim ist voll!");
        }
    }

    //entfernen tier
    public void tierEntfernen(String tierName) {
        boolean vorhanden = false;

// iteration des arrays
        for (int i = 0; i < haustiere.length; i++) {
            //damit das Tier objekt mit attributen und methoden weiterverwendet werden kann
            Tier tier = haustiere[i];
            // falls Tier im array vorhanden wird slot auf 0 gesetzt
            //
            if (tier != null && tierName.equals(tier.getName())) {
                haustiere[i] = null;
                //anzahl haustiere muss verändert werden
                anzahlHaustiere--;
                vorhanden = true;
            }
        }
        if (!vorhanden) {
            System.out.println("Es gibt kein Tier mit diesem Namen!");
        }
    }

    @Override
    public String toString() {
        return "ArcheNoah" +
                "\nhaustiere=" + Arrays.deepToString(haustiere) +
                "\nanzahlHaustiere=" + anzahlHaustiere;
    }
}
