package Spiele.Snake;

import java.util.Scanner;

public class RunSnake {
    public static void main(String[] args) {
        Snake snake = new Snake(20);

        System.out.println("Use W, A, S, D to change direction");
        System.out.println("Game starts in 10 seconds...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {
            snake.move();
            snake.print();

            if (snake.isGameOver()) {
                System.out.println("Game Over!");
                break;
            }

            System.out.print("> ");
            int dir = new Scanner(System.in).nextInt();
            snake.changeDirection(dir);
        }

    }
}
