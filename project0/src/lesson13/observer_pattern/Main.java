package lesson13.observer_pattern;

public class Main {

    public static void main(String[] args) {


        Button button = new Button();
        Screen screen = new Screen();









        System system = System.getInstance();
        system.putButtonOnScreen(button, screen);
        system.waitForUserClick();

    }

}
