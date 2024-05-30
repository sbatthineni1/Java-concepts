package Syn.Exam;

public class BankAccount {
    private double balance;
    private String name;


    public double getBalance() {
        return balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        synchronized (this.name) {
            this.name = name;
            System.out.println("Updated name: " + this.name);
        }
    }

    public BankAccount(String name, double balance) {
        this.balance = balance;
        this.name = name;
    }

    public void deposit(double amount) {

        try {
            System.out.println("sitting and chatting");
            Thread.sleep(700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Double boxedBalance = this.balance;
        synchronized (boxedBalance) {
            double originalBalance = balance;
            balance += amount;
            System.out.printf("Starting balance : %.0f, deposit (%.0f)" + " : New Balance = %.0f %n", originalBalance, amount, balance);
        }

    }

    public synchronized void withdraw(double amount) {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        double originalBalance = balance;
        if (amount <= balance) {
            balance -= amount;
            System.out.printf("Starting balance : %.0f, Withdraw (%.0f)" + " : New Balance = %.0f %n", originalBalance, amount, balance);
        } else {
            System.out.printf("Starting balance : %.0f, Withdraw (%0.f)" + " : Insufficient Funds %n", originalBalance, amount);

        }
    }
}
