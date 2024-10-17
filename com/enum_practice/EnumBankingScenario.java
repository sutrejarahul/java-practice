package com.enum_practice;

enum AccountType {
    SAVINGS(0.05), CURRENT(0.01), LOAN(0.07);

    private double interestRate;

    private AccountType(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }
}

public class EnumBankingScenario {

    public static void main(String[] args) {
        AccountType accountType = AccountType.LOAN;
        System.out.println("Interest rate for " + accountType + ": " + accountType.getInterestRate());
    }
}
