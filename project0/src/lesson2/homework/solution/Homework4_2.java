package lesson2.homework.solution;

import java.util.Scanner;

/**
 * Sort 3 integers:
 * 1. Input 3 integers using Scanner
 * 2. Store them in 3 separate variables
 * 3. Sort the integers so that num1 <= num2 <= num3
 * 4. Print the variables
 */
public class Homework4_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 integers:");
        // Input 3 integers using Scanner and store them in 3 separate variables
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int num1;
        int num2;
        int num3;

        // all possible scenarios: 123 132 213 231 312 321

        if (a < b && a < c) {
            num1 = a;
        } else if (b < a && b < c) {
            num1 = b;
        } else {
            num1 = c;
        }


        if ((a > b && a < c) || (a > c && a < b)) {
            num2 = a;
        } else if ((b > a && b < c) || (b > c && b < a)) {
            num2 = b;
        } else {
            num2 = c;
        }


        if (a > b && a > c) {
            num3 = a;
        } else if (b > a && b > c) {
            num3 = b;
        } else {
            num3 = c;
        }

        System.out.println(num1 + "," + num2 + "," + num3);

    }

}
