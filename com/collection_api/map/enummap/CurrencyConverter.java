package com.collection_api.map.enummap;

import java.util.EnumMap;

enum Currency {
    USD, EUR, INR, GBP, AUD;
}

public class CurrencyConverter {
    public static void main(String[] args) {
        // Create an EnumMap to store currency exchange rates (relative to USD)
        EnumMap<Currency, Double> currencyRates = new EnumMap<>(Currency.class);

        // Exchange rates relative to USD
        currencyRates.put(Currency.USD, 1.0);      // Base currency
        currencyRates.put(Currency.EUR, 0.89);    // 1 USD = 0.89 EUR
        currencyRates.put(Currency.INR, 84.41);   // 1 USD = 84.41 INR
        currencyRates.put(Currency.GBP, 0.77);    // 1 USD = 0.77 GBP
        currencyRates.put(Currency.AUD, 1.56);    // 1 USD = 1.56 AUD

        // Example: Convert 34.5 USD to INR
        double amountInINR = convertCurrency(34.5, Currency.USD, Currency.INR, currencyRates);
        System.out.println("34.5 USD to INR: " + amountInINR);

        // Example: Convert 100 EUR to GBP
        double amountInGBP = convertCurrency(100, Currency.EUR, Currency.GBP, currencyRates);
        System.out.println("100 EUR to GBP: " + amountInGBP);

        // Example: Convert 50 AUD to USD
        double amountInUSD = convertCurrency(50, Currency.AUD, Currency.USD, currencyRates);
        System.out.println("50 AUD to USD: " + amountInUSD);
    }

    /**
     * Converts an amount from one currency to another using the given exchange rates.
     *
     * @param amount         The amount to convert.
     * @param sourceCurrency The source currency.
     * @param targetCurrency The target currency.
     * @param rates          The exchange rates stored in an EnumMap.
     * @return The converted amount.
     */
    public static double convertCurrency(double amount, Currency sourceCurrency, Currency targetCurrency, EnumMap<Currency, Double> rates) {
        if (!rates.containsKey(sourceCurrency) || !rates.containsKey(targetCurrency)) {
            throw new IllegalArgumentException("Invalid currency specified.");
        }

        // Convert the amount to USD (base currency) first
        double amountInUSD = amount / rates.get(sourceCurrency);

        // Convert from USD to the target currency
        return amountInUSD * rates.get(targetCurrency);
    }
}

