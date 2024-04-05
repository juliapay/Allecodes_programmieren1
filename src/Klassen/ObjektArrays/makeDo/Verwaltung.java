package Klassen.ObjektArrays.makeDo;


public class Verwaltung {
    // deklarierung Objekt-Array tasks
    private Task[] tasks;
    private int numberOfTasks;
    // zur Einhaltung der Arraylänge
    private int maxNumberTasks;

    public Verwaltung(int maxNumberTasks) {
        this.maxNumberTasks = maxNumberTasks;
        this.tasks = new Task[maxNumberTasks];
    }

    //
    public void addTask(String name) {

        //bedingung für Fehlermeldung, falls voll
        if (tasks.length <= maxNumberTasks) {
//iteration der arrays
            for (int i = 0; i < tasks.length; i++) {
                //feststellen ob slot leer ist
                if (tasks[i] == null) {
                    //befüllen mit Objekt!
                    tasks[i] = new Task(i, name);
                    tasks[i].setStatus(false);
                    numberOfTasks++;
                    break;
                }
            }
        } else {
            System.out.println("Array is full!");
        }

    }

    public Task getTask(int id) {
        //array iteration
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];
            // bedingung mit getter aus Klasse task
            if (task!=null&&task.getId() == id) {
            // zurückgeben des Objekts
                return tasks[i];
                //return null wird nicht erreicht
            }
        }
        // wenn if bedingung nicht erreicht gibt null zurück
        return null;
    }

    public void markTaskComplete(int id) {
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            Task task = tasks[i];
            // bedingung mit getter methode aus Klasse task  und damit keine nullpointer referenz entsteht
            if (task != null && task.getId() == id) {
            // boolean auf true setzen mit setter methode
                tasks[i].setStatus(true);
            }
        }
    }
//methode zum löschen
    public void deleteTask(int id) {
        for (int i = 0; i < tasks.length; i++) {
            //zuweisen Objekt zum array
            //Task task = tasks[i]; hab ich mir hier gespart mit direkter zuweisung
            // bedingung mit getter aus Klasse task
            if (tasks[i] != null && tasks[i].getId() == id) {
                // löschen des Objekts
                tasks[i] = null;
                numberOfTasks--;
            }
        }
    }
//methode
    public void displayTask() {
        //Variable für ausgabe in der konsole, deklariert und initialisiert
        String d = "";
        //kopfzeile
        System.out.println("ID     Titel   Status");
        //iteration mit loop
        for (int i = 0; i < tasks.length; i++) {
            // bedingung mit getter aus Klasse task damit es nur beschriebene slots ausgibt
            if (tasks[i] != (null)) {
                // ausgeben der Objekte
                if (tasks[i].isStatus()) {
                    //für true
                    d = "done";
                } else {
                   // für false
                    d = "offen";
                }
                //mit null gibt mir sonst die null nicht aus, schaut schöner aus
                System.out.println("0" + tasks[i].getId() + "    " + tasks[i].getName() + "   " + d);
            }
        }
    }

}

