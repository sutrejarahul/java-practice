package com.interface_practice;

interface Payment {
    // Static final variable
    double TAX_RATE = 0.05; // Implicitly public, static, and final

    void processPayment(double amount);
}

class CreditCard implements Payment {
    public void processPayment(double amount) {
        double total = amount + (amount * TAX_RATE); // Accessing the variable from interface
        System.out.println("Total payment (Credit Card): $" + total);
    }
}

class PayPal implements Payment {
    public void processPayment(double amount) {
        double total = amount + (amount * TAX_RATE); // Accessing the variable from interface
        System.out.println("Total payment (PayPal): $" + total);
    }
}

// Main method to test the classes
public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();

        creditCard.processPayment(100); // Output: Total payment (Credit Card): $105.0
        payPal.processPayment(100); // Output: Total payment (PayPal): $105.0

        // Accessing the static final variable
        System.out.println(Payment.TAX_RATE); // Output: 0.05
    }
}

