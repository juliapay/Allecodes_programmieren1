package Spiele.Snake;

import java.util.Random;


        class Snake {
            Points[] body;
            Points food;
            int direction;

            public Snake(int width) {
                body = new Points[width * width];
                body[0] = new Points(10, 10);
                food = new Points(15, 15);
                direction = 1;
            }

            public void move() {
                int x = body[0].x;
                int y = body[0].y;

                switch (direction) {
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
                    case 4:
                        y++;
                        break;
                }

                body[1] = body[0];
                body[0] = new Points(x, y);

                if (x == food.x && y == food.y) {
                    do {
                        food.x = new Random().nextInt(20);
                        food.y = new Random().nextInt(20);
                    } while (isOverlapping(body[0], food));
                }
            }


            public void changeDirection(int dir) {
                if (dir == 1 && direction != 3)
                    direction = dir;
                else if (dir == 2 && direction != 4)
                    direction = dir;
                else if (dir == 3 && direction != 1)
                    direction = dir;
                else if (dir == 4 && direction != 2)
                    direction = dir;
            }

            public boolean isGameOver() {
                int headX = body[0].x;
                int headY = body[0].y;
                return headX < 0 || headX > 19 || headY < 0 || headY > 19;
            }
            public boolean isOverlapping(Points p1, Points p2) {
                return p1.x == p2.x && p1.y == p2.y;
            }

            public void print() {
                for (int i = 0; i < body.length; i++) {
                    if (i == 0)
                        System.out.print("S ");
                    else if (body[i] != null)
                        System.out.print("s ");
                    else
                        System.out.print("  ");
                }
                System.out.print("F");
                System.out.println();
                for (int y = 0; y < 20; y++) {
                    for (int x = 0; x < 20; x++) {
                        Points p = new Points(x, y);
                        if (isOverlapping(body[y], p)) {
                            System.out.print("S ");
                        } else if (p.x == food.x && p.y == food.y) {
                            System.out.print("F ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }

}
