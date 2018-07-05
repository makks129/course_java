package lesson2;

import java.util.Scanner;

/**
 * Guess random number
 */
public class Practice8 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 10); // Math.random gives double from 0.0 to 0.9. Multiply by 10 and cast to int to get from 0 to 9

        // 1 guess
        System.out.print("Random number 1 guess: ");
        int guess1 = scanner.nextInt();
        if (randomNumber == guess1) {
            System.out.println("Correct!");
            System.exit(0);
        }

        // 2 guess
        System.out.print("Random number 2 guess: ");
        int guess2 = scanner.nextInt();
        if (randomNumber == guess2) {
            System.out.println("Correct!");
            System.exit(0);
        }

        // 3 guess
        System.out.print("Random number 3 guess: ");
        int guess3 = scanner.nextInt();
        if (randomNumber == guess3) {
            System.out.println("Correct!");
            System.exit(0);
        }

        System.out.println("You didn't guess the number. The number was " + randomNumber);


    }

}
