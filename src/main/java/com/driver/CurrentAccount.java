package com.driver;

public class CurrentAccount extends BankAccount {
    String tradeLicenseId; // consists of Uppercase English characters only

    public String getTradeLicenseId() {
        return tradeLicenseId;
    }

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        super(name, balance, 5000); // minimum balance is 5000 by default
        this.tradeLicenseId = tradeLicenseId;
        if (balance < 5000) {
            throw new Exception("Insufficient Balance");
        }
    }

    public void validateLicenseId() throws Exception {
        // Your code for validating license Id goes here
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception

        char[] licenseChars = tradeLicenseId.toCharArray();
        for (int i = 0; i < licenseChars.length - 1; i++) {
            if (licenseChars[i] == licenseChars[i + 1]) {
                // Two consecutive characters are the same, rearrange them
                for (int j = i + 1; j < licenseChars.length - 1; j++) {
                    if (licenseChars[j] != licenseChars[i]) {
                        char temp = licenseChars[i + 1];
                        licenseChars[i + 1] = licenseChars[j];
                        licenseChars[j] = temp;
                        return;
                    }
                }
                throw new Exception("Valid License can not be generated");
            }
        }
    }
}
