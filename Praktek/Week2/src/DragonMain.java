public class DragonMain {

    public static void main(String[] args) {
        Dragon d = new Dragon(9, 10, 25, 20);
        d.printPosition();
        d.moveLeft();d.moveUp();d.moveLeft();
    }
}