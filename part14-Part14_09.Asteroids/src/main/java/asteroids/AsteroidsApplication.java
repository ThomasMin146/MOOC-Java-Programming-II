package asteroids;

public class AsteroidsApplication {

    public static void main(String[] args) {
        GameWindow ui = new GameWindow();
        ui.start();
    }

    public static int partsCompleted() {
        // State how many parts you have completed using the return value of this method
        return 4;
    }

}
