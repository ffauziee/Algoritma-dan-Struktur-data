public class Dragon {
    int x, y, width, height;

    public Dragon() {}

    public Dragon(int x1, int y1, int w, int h) {
        x = x1;
        y = y1;
        width = w;
        height = h;
    }

    void moveLeft() {
        x = x - 1;
        if (x < 0) {
            detectCollision();
        }else{
            printPosition();  
          }
    }

    void moveRight() {
        x = x + 1;
        if (x > width) {
            detectCollision();
        }else{
            printPosition();;  
          }
    }

    void moveUp() {
        y = y - 1;
        if (y < 0) {
            detectCollision();
        }else{
            printPosition();  
          }
    }

    void moveDown() {
        y = y + 1;
        if (y > height) {
            detectCollision();
        }else{
          printPosition();
        }
        }

    void printPosition() {
        System.out.println("Position Dragon at: " + x + "," + y);
    }

    void detectCollision() {
        if(x <= 0 || y<=0 || x>=width || y>=height);
        System.out.println("GAME OVER");
    }
}