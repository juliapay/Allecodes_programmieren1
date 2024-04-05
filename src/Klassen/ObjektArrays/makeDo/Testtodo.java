package Klassen.ObjektArrays.makeDo;

public class Testtodo {
    public static void main(String[] args) {
        ///Deklarierung und Initialisierung Klasse Verwaltung
        Verwaltung verwaltung = new Verwaltung(4);
//initialisierung von objekten der klasse task
        Task t1 = new Task(00, "Lernen");
        Task t2 = new Task(01, "Lernen");
        Task t3 = new Task(02, "Lernen");
        //hinzufügen der objekte als elemente in dei slots des arrays
        verwaltung.addTask(t1.getName());
        verwaltung.addTask(t2.getName());
        verwaltung.addTask(t3.getName());

        verwaltung.markTaskComplete(01);
        verwaltung.deleteTask(01);
        verwaltung.getTask(02);
        verwaltung.markTaskComplete(02);
        verwaltung.displayTask();
    }
}

