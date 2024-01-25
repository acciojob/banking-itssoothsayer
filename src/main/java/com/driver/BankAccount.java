package com.driver;

public class BankAccount {

    private String name;
    private double balance;
    private double minBalance;

    public BankAccount(String name, double balance, double minBalance) {
        this.name = name;
        this.balance = balance;
        this.minBalance = minBalance;
    }

    public String generateAccountNumber(int digits, int sum) {
        if (digits <= 0) {
            return "Invalid Account Number";
        }

        StringBuilder accountNumber = new StringBuilder();
        int currentSum = 0;

        for (int i = 0; i < digits - 1; i++) {
            int randomDigit = (int) (Math.random() * 10);
            currentSum += randomDigit;
            accountNumber.append(randomDigit);
        }

        int lastDigit = sum - currentSum;
        if (lastDigit < 0 || lastDigit > 9) {
            return "Invalid Account Number";
        }

        accountNumber.append(lastDigit);
        return accountNumber.toString();
    }

    public void deposit(double amount) {
        //add amount to balance
        balance += amount;
    }

    public void withdraw(double amount) throws Exception {
        // Remember to throw "Insufficient Balance" exception, if the remaining amount would be less than minimum balance

        if (balance - amount < minBalance) {
            throw new Exception("Insufficient Balance");
        }
        balance -= amount;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}