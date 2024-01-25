package com.driver;

public class CurrentAccount extends BankAccount{
    String tradeLicenseId; //consists of Uppercase English characters only

    public CurrentAccount(String name, double balance, String tradeLicenseId) throws Exception {
        // minimum balance is 5000 by default. If balance is less than 5000, throw "Insufficient Balance" exception
        super(name, balance, 5000);
        this.tradeLicenseId = tradeLicenseId;
        validateLicenseId();
    }

    public void validateLicenseId() throws Exception {
        // A trade license Id is said to be valid if no two consecutive characters are same
        // If the license Id is valid, do nothing
        // If the characters of the license Id can be rearranged to create any valid license Id
        // If it is not possible, throw "Valid License can not be generated" Exception

        if (!isValidLicenseId()) {
            rearrangeLicenseId();
        }

    }
    private boolean isValidLicenseId() {
        for (int i = 0; i < tradeLicenseId.length() - 1; i++) {
            if (tradeLicenseId.charAt(i) == tradeLicenseId.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
    private void rearrangeLicenseId() throws Exception {
        char[] chars = tradeLicenseId.toCharArray();
        for (int i = 0; i < chars.length - 1; i += 2) {
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                char temp = chars[i];
                chars[i] = chars[i + 1];
                chars[i + 1] = temp;
            }
        }
        tradeLicenseId = new String(chars);
        if (!isValidLicenseId()) {
            throw new Exception("Valid License can not be generated");
        }
    }

}
