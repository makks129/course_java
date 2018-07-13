package lesson5.homework;

import java.util.Scanner;

public class Account {

    public double balance = 0;
    public double interestRate = 12;

    public Account () {

    }


    public double deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit: ");
        double deposit = scanner.nextDouble();
        return balance += deposit;
    }

    public double withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw ");
        double withdraw = scanner.nextDouble();

        if (balance > withdraw) {
            return balance -= withdraw;
        } else {
            System.out.println("You can not withdraw" + withdraw + " from your account because of balance of your account is  " + balance);
        }
        return 0;
    }

    public void printBalance () {

        System.out.println("Your balance now is " + balance);

    }

    public double calculateFutureBalance(int years, double invest) {

        if (balance >= invest) {
            double futureBalance = (invest * ((interestRate / 100) + 1 )) * years;
            return balance += futureBalance;
        } else {

            System.out.println("You don't have enough money for invest " + ", your balance is "  + balance);
        }

        return 0;
    }



}
