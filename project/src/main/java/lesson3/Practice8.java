package lesson3;

import java.util.Scanner;

/**
 * Get 10 numbers, compute their average and count how many numbers are above average.
 */
public class Practice8 {

    public static void main(String[] args) {

        final int NUMBER_OF_ELEMENTS = 10;
        double[] numbers = new double[NUMBER_OF_ELEMENTS];
        double sum = 0;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            System.out.print("Enter a new number: ");
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / NUMBER_OF_ELEMENTS;

        System.out.println("Average is " + average);

        int count = 0;
        for (int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
            if (numbers[i] > average) {
                count++;
            }
        }

        System.out.println("Number of elements above the average " + count);

    }

}
