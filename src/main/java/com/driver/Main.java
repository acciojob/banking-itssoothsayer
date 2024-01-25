package com.driver;

public class Main {
    public static void main(String[] args) {
        try {
            // Example usage of the classes
            CurrentAccount currentAccount = new CurrentAccount("John", 7000, "ABCDE");
            SavingsAccount savingsAccount = new SavingsAccount("Alice", 2000, 1000, 0.05);
            StudentAccount studentAccount = new StudentAccount("Bob", 500, "XYZ University");

            // Deposit and withdraw operations
            currentAccount.deposit(3000);
            currentAccount.withdraw(2000);

            savingsAccount.deposit(1500);
            savingsAccount.withdraw(800);

            studentAccount.deposit(200);
            studentAccount.withdraw(100);

            // Generating account number
            System.out.println("Generated Account Number: " + savingsAccount.generateAccountNumber(6, 30));

            // Validating and rearranging license ID
            System.out.println("Original License ID: " + currentAccount.tradeLicenseId);
            currentAccount.validateLicenseId();
            System.out.println("Validated License ID: " + currentAccount.tradeLicenseId);

            // Calculating interest
            System.out.println("Simple Interest: " + savingsAccount.getSimpleInterest(3));
            System.out.println("Compound Interest: " + savingsAccount.getCompoundInterest(4, 2));

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

