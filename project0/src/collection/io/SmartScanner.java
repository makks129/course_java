package collection.io;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SmartScanner {

    private Scanner scanner;

    public SmartScanner() {
        this.scanner = new Scanner(System.in);
    }

    public int requestInt(String message) {
        while (true) {
            if (message != null) {
                System.out.println(message);
            }
            try {
                return scanner.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter integer.");
                scanner.nextLine();
            }
        }
    }

}
