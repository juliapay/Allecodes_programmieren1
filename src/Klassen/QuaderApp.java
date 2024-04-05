package Klassen;

public class QuaderApp {
    public static void main(String[] args) {
        Quader q = new Quader(2,3,4);

        System.out.println(q.oberflaeche());//ausgeben der oberfläche
        System.out.println(q.volumen());//ausgeben des volumens
        System.out.println(q.grundflaeche());//ausgeben der grundflaeche
        System.out.println(q);// ausgeben aller attribute
        q.skaliere(2.3);
        System.out.println(q);//ausgeben aller attribute mit neuem faktor
        System.out.println(q.oberflaeche());//ausgeben der oberfläche mit neuem faktor
        System.out.println(q.volumen());//ausgeben des volumens mit neuem faktor
        System.out.println(q.grundflaeche());//ausgeben der grundflaeche mit neuem faktor

    }
}
