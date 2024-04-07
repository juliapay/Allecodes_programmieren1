package Angabe03;

class Task {
    //attribute
    private int id;
    private  String title;
    boolean isComplete;
//konstruktor
    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.isComplete = isComplete;
    }
// setter getter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }
}
