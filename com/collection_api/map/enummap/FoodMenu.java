package com.collection_api.map.enummap;

import java.util.EnumMap;

enum FoodType {
    BREAKFAST, LUNCH, DINNER, SNACKS;
}

public class FoodMenu {

    public static void main(String[] args) {
        // Initialize the EnumMap with food types and corresponding menu items
        EnumMap<FoodType, String> foodMenu = new EnumMap<>(FoodType.class);

        foodMenu.put(FoodType.BREAKFAST, "Moong Dal Dosa");
        foodMenu.put(FoodType.LUNCH, "Biryani Rice Recipe (Kuska Rice)");
        foodMenu.put(FoodType.DINNER, "Dal Makhani");
        foodMenu.put(FoodType.SNACKS, "Murukku or Chakli");

        // Retrieve and display a specific menu item
        String dinner = foodMenu.getOrDefault(FoodType.DINNER, "No dinner item found");
        System.out.println("Dinner Item: " + dinner);

        // Display all menu items
        System.out.println("\nFull Menu:");
        foodMenu.forEach((key, value) -> System.out.println(key + ": " + value));

        // Filter and display only breakfast items
        System.out.println("\nFiltered Menu (Breakfast):");
        foodMenu.entrySet().stream()
                .filter(entry -> entry.getKey() == FoodType.BREAKFAST)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

