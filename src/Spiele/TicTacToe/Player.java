package Spiele.TicTacToe;

public class Player {
    private char charPiece;
    private String name;

    public Player(char charPiece, String name) {
        this.charPiece = charPiece;
        this.name = name;
    }

    public char getCharPiece() {
        return charPiece;
    }

    public void setCharPiece(char charPiece) {
        this.charPiece = charPiece;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
