package com.driver;

public class BankAccount {

    private String name;
    public double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }
    public BankAccount() {
        this.name = "";
        this.balance = 0.0;
    }
    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public double getMinBalance() {
        return minBalance;
    }

    public String generateAccountNumber(int digits, int sum) throws Exception {
        // Your code for generating account number goes here
        // Each digit of an account number can lie between 0 and 9 (both inclusive)
        // Generate account number having given number of 'digits' such that the sum of digits is equal to 'sum'
        // If it is not possible, throw "Account Number can not be generated" exception
        return null;
    }

    public void deposit(double amount) {
        // Your code for depositing amount goes here
        // Add amount to balance
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        // Your code for withdrawing amount goes here
        // Remember to throw "Insufficient Balance" exception if the remaining amount would be less than minimum balance
        if (balance - amount < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }
}
