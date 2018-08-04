package teacher.lesson3;

import java.util.Scanner;

/**
 * Write a "Guess a number" program.
 *
 * The program generates a number between 0 and 1000 and prompts user to guess it.
 * If the guess is smaller than the number, the computer prints "guess is too small".
 * If the guess is higher than the number, the computer prints "guess is too high".
 * If the guess is correct, the program terminates.
 */
public class Practice4 {

    public static void main(String[] args) {

        // Steps to write the program
        // 1. Generate random number
        // 2. Ask user to input number. Save in variable.
        // 3. Check user input versus random number
        // 4. Wrap into while loop

        int randomNumber = (int) (Math.random() * 101);
        int userNumber = -1;

        Scanner scanner = new Scanner(System.in);

        while (randomNumber != userNumber) {
            System.out.print("Enter number: ");
            userNumber = scanner.nextInt();

            if (userNumber < randomNumber) {
                System.out.println("Guess is too small");
            } else if (userNumber > randomNumber) {
                System.out.println("Guess is too big");
            } else {
                System.out.println("You guessed correctly");
            }
        }


    }

}
