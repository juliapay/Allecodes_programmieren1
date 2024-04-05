package Spiele.VierGewinnt;

public class GameController {
    public static void main(String[] args) {
        //Deklarierung und instanzierung spielefeld
        Gameboard gameOn = new Gameboard("Pablo", "Mia");
        //initialisierung der methode für die spielmechanik
        gameOn.startGame();
    }
}
