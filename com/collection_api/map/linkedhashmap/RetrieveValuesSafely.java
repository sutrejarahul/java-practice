package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;

public class RetrieveValuesSafely {
    private static final LinkedHashMap<String, Double> itemPrices = new LinkedHashMap<>();

    public static void main(String[] args) {
        // Initialize the LinkedHashMap with item prices
        itemPrices.put("Pizza", 89.5);
        itemPrices.put("Burger", 69.15);
        itemPrices.put("Sandwich", 35.7);
        itemPrices.put("Coke", 50.2);
        itemPrices.put("Fries", 30.0);

        // Test getPrice method with items that exist and do not exist in the map
        System.out.println("Price of Pizza: " + getPrice("Pizza"));
        System.out.println("Price of Wraps: " + getPrice("Wraps"));
    }

    // Method to retrieve the price of an item safely
    public static Double getPrice(String item) {
        // Return price if item exists; otherwise, return default value (0.0)
        return itemPrices.getOrDefault(item, 0.0);
    }
}

