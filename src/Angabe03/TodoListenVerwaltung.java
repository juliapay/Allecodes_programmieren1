package Angabe03;

public class TodoListenVerwaltung {
    //attribute
    private Task[] tasks;
    private int nextId;
    private int maxNumberOfTasks;
    private int numberOfTasks;
//konstruktor
    public TodoListenVerwaltung(int maxNumberOfTasks) {
        this.tasks = new Task[maxNumberOfTasks];
    }
    //Methode zum Hinzufügen eises Tasks
    public void addTask(String title){

        //bedingung für Fehlermeldung, falls voll
        if (tasks.length >= maxNumberOfTasks) {
            //iteration des arrays
            for (int i = 0; i < tasks.length; i++) {
                //feststellen ob slot leer ist
                if (tasks[i] == null) {
                    //befüllen mit Objekt!
                    tasks[i] = new Task(i, title);
                    //bollean auf leer setzen durch setter aus der Task-Klasse
                    tasks[i].setComplete(false);
                    //Taskerhöhung für Arrayabfrage ob voll
                    numberOfTasks++;
                    //kann aus der schleife springen
                    break;
                }
            }
        } else {
            System.out.println("Array is full!");
        }
    }
    //methode um den Task durch die Id zu erhalten
    public Task getTask(int id){
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];
            // bedingung mit getter aus Klasse task
            //!=0 um nullpointerexception zu vermeiden
            if (task!=null&&task.getId() == id) {
                // zurückgeben des Objekts
                return tasks[i];
            }
        }
        // wenn if bedingung nicht erreicht gibt null zurück
        return null;
    }
    //methode zum verändern des boolean wertes der Task-Klasse
    public void markTaskComplete(int id) {
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];
            // bedingung mit getter aus Klasse task
            //!=0 um nullpointerexception zu vermeiden
            if (task != null && task.getId() == id) {
                // boolean auf true setzen mit setter methode aus der Task-Klasse
                tasks[i].setComplete(true);
            }
        }
    }
    //Methode zum löschen des Tasks
    public void deleteTask(int id) {
        //iteration
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            //Task task = tasks[i]; hab ich mir hier gespart mit direkter zuweisung
            // bedingung mit getter aus Klasse task
            //!=0 um nullpointerexception zu vermeiden
            if (tasks[i] != null && tasks[i].getId() == id) {
                // löschen des Objekts
                tasks[i] = null;
                //counter für Array ist voll Abfrage
                numberOfTasks--;
            }
        }
    }
    //Methode für die Konsolenausgabe
    public void displayTask() {
        //Variable für ausgabe in der konsole, deklariert und initialisiert
        String d = "";
        //kopfzeile
        System.out.println("ID     Titel      Status");

        //iteration mit loop
        for (int i = 0; i < tasks.length; i++) {
            // bedingung mit getter aus Klasse task damit es nur beschriebene slots ausgibt
            if (tasks[i] != (null)) {
                // ausgeben der Objekte
                if (tasks[i].isComplete()) {
                    //für true
                    d = "done";
                } else {
                    // für false
                    d = "offen";
                }
                //mit null gibt mir sonst die null nicht aus, schaut schöner aus
                System.out.println("0" + tasks[i].getId() + "    " + tasks[i].getTitle() + "   " + d);
            }
        }
        System.out.println();
    }
}

