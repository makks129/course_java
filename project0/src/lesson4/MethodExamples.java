package lesson4;

import java.util.Scanner;

/**
 * Method examples
 */
public class MethodExamples {

    public static void main(String[] args) {

        System.out.print("");

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        int randomNumber = (int) (Math.random() * 100);

        double sqrt2 = Math.sqrt(2);

        int maxNumber = Math.max(userNumber, randomNumber);

        // main method

    }

}
