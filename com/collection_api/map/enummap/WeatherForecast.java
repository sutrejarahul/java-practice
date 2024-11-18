package com.collection_api.map.enummap;

import java.util.EnumMap;
import java.util.Scanner;

enum WeatherCondition {
    SUNNY, RAINY, CLOUDY, WINDY, STORMY;
}

public class WeatherForecast {

    public static void main(String[] args) {
        // Initialize the EnumMap
        EnumMap<WeatherCondition, String> weatherMessages = new EnumMap<>(WeatherCondition.class);

        // Populate the EnumMap
        weatherMessages.put(WeatherCondition.SUNNY, "Time to walk on the beach");
        weatherMessages.put(WeatherCondition.RAINY, "Carry an umbrella");
        weatherMessages.put(WeatherCondition.CLOUDY, "Be prepared for rainfall");
        weatherMessages.put(WeatherCondition.WINDY, "Wind blowing strongly");
        weatherMessages.put(WeatherCondition.STORMY, "Don't step out of the house");

        // Retrieve and display today's weather condition
        String todayWeatherCondition = weatherMessages.getOrDefault(WeatherCondition.SUNNY, "No weather info available");
        System.out.println("Today's Weather Condition: " + todayWeatherCondition);

        // Display all weather conditions and messages
        System.out.println("\nWeather Messages:");
        weatherMessages.forEach((condition, message) -> System.out.println(condition + ": " + message));

        // Dynamic user input for weather condition
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter a weather condition (SUNNY, RAINY, CLOUDY, WINDY, STORMY): ");
        try {
            WeatherCondition userCondition = WeatherCondition.valueOf(scanner.next().toUpperCase());
            System.out.println("Message: " + weatherMessages.getOrDefault(userCondition, "No message available for this condition"));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid weather condition entered.");
        }

        scanner.close();
    }
}

