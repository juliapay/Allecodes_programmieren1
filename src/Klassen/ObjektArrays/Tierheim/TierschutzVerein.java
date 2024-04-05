package Klassen.ObjektArrays.Tierheim;

public class TierschutzVerein {
    public static void main(String[] args) {
        ArcheNoah archeGraz = new ArcheNoah(10);

        Tier t1 = new Tier("Pablo","Katze");
        Tier t2 = new Tier("Mia","Papagei");
        Tier t3 = new Tier("Mausi","Schildkröte");
        Tier t4 = new Tier("Bruno","Ameise");


        archeGraz.tierHinzufuegen(t1);
        archeGraz.tierHinzufuegen(t2);
        archeGraz.tierHinzufuegen(t3);
        archeGraz.tierHinzufuegen(t4);

        System.out.println(archeGraz);
        archeGraz.tierEntfernen("Nana");
        System.out.println(archeGraz);
        System.out.println();

    }





}
