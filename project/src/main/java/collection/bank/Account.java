package collection.bank;

public class Account {

    private double balance;

    public Account() {
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            balance = 0;
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public double calculateFutureBalance(int years, double interestRate) {
        double futureBalance = balance;
        for (int i = 0; i < years; i++) {
            futureBalance += futureBalance * (interestRate * 0.01);
        }
        return futureBalance;
    }

}
