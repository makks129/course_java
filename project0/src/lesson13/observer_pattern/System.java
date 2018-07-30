package lesson13.observer_pattern;

import java.util.Scanner;

public class System {

    private static System instance;

    private Scanner scanner;
    private Button button;

    private System() {
        scanner = new Scanner(java.lang.System.in);
    }

    public static System getInstance() {
        if (instance == null) {
            instance = new System();
        }
        return instance;
    }

    public void putButtonOnScreen(Button button, Screen screen) {
        // Mimics putting button on screen
        // Here we just save button object inside the system
        this.button = button;
    }

    public void waitForUserClick() {
        // Mimics waiting for user click
        // In our case user click is represented as input into console and pressing Enter
        scanner.next();
        button.userClicked();
    }

}
