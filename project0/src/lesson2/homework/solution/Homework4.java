package lesson2.homework.solution;

import java.util.Scanner;

/**
 * Sort 3 integers:
 * 1. Input 3 integers using Scanner
 * 2. Store them in 3 separate variables
 * 3. Sort the integers so that num1 <= num2 <= num3
 * 4. Print the variables
 */
public class Homework4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers:");
        // Input 3 integers using Scanner and store them in 3 separate variables
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // Sort num1 and num2
        if (num1 > num2) {
            // switch num1 and num2
            int temporaryNum1 = num1; // store value of num1 in temporary variable
            num1 = num2; // assign value of num2 to num1
            num2 = temporaryNum1; // assign value of temporary variable to num2
            // now num1 and num2 are switched
        }

        // Sort num2 and num3
        if (num2 > num3) {
            int temporaryNum2 = num2;
            num2 = num3;
            num3 = temporaryNum2;
        }

        // Sort num1 and num2 again
        if (num1 > num2) {
            int temporaryNum1 = num1;
            num1 = num2;
            num2 = temporaryNum1;
        }

        // Print the result
        System.out.println(num1 + " " + num2 + " " + num3);

    }

}
