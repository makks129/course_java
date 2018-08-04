package lesson3.homework;

import java.util.Scanner;

/**
 * Bank deposit amount growth calculator.
 * <p>
 * User has an amount of money on the bank deposit. This amount grows every year by certain percentage (interest rate).
 * The calculator should be able to calculate the amount of money on the deposit after certain amount of years.
 * Input from user:
 * - initial amount on the deposit
 * - interest rate
 * - number of years
 * Output:
 * - the amount on the deposit after the number of years
 */
public class Homework1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial amount: ");
        int depositAmount = scanner.nextInt();
        System.out.print("Enter interest rate in %: ");
        int interestRate = scanner.nextInt();
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();

        for (int i = 0; i < years; i++) {
            depositAmount += depositAmount * (interestRate * 0.01);
        }

        System.out.println("Deposit amount after " + years +
                " years, at " + interestRate +
                "% interest rate will be " + depositAmount);

    }

}
