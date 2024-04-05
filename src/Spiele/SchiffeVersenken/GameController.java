package Spiele.SchiffeVersenken;

public class GameController {
    public static void main(String[] args) {
        //instanzierung des spiels
        ShipsGame gameOn = new ShipsGame("Mia");
        //starten der methode zum spielen
        gameOn.startGame();
        gameOn.showComputerboard();





    }
}
