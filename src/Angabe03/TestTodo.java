package Angabe03;

public class TestTodo {
    public static void main(String[] args) {
        TodoListenVerwaltung verwaltung= new TodoListenVerwaltung(10);
        //hinzufügen der elemente
        verwaltung.addTask("Einkaufen");
        verwaltung.addTask("PR1 Ueben");
        verwaltung.addTask("Lernen   ");
//consolenausgabe
        verwaltung.displayTask();
        verwaltung.markTaskComplete(1);
        verwaltung.displayTask();
        verwaltung.deleteTask(2);
        verwaltung.displayTask();
    }
}
