package lesson1;

import java.util.Scanner;

public class Program4 {

    public static void main(String[] args) {

        // Convert Celsius to Fahrenheit
        // Formula: F = (9 / 5) * C + 32

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in C: ");

        double c = scanner.nextDouble();

        double f = (9.0 / 5.0) * c + 32;

        System.out.println(c + " C is " + f + " F");

    }

}
