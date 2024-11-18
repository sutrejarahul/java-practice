package com.collection_api.map.enummap;

import java.util.EnumMap;

enum TrafficLight {
    RED, YELLOW, GREEN
}

public class TrafficLightController {
    public static void main(String[] args) {
        // Create an EnumMap to store durations for each traffic light
        EnumMap<TrafficLight, Integer> lightDurations = new EnumMap<>(TrafficLight.class);

        // Add durations for each light
        lightDurations.put(TrafficLight.RED, 30);       // 30 seconds
        lightDurations.put(TrafficLight.YELLOW, 5);    // 5 seconds
        lightDurations.put(TrafficLight.GREEN, 25);    // 25 seconds

        // Display the current light and its duration
        TrafficLight currentLight = TrafficLight.RED;
        System.out.println("Current Light: " + currentLight);
        System.out.println("Duration: " + lightDurations.get(currentLight) + " seconds");

        // Simulate changing the light to the next state
        currentLight = getNextLight(currentLight);
        System.out.println("Next Light: " + currentLight);
        System.out.println("Duration: " + lightDurations.get(currentLight) + " seconds");

        // Display all lights and their durations
        System.out.println("\nTraffic Light Durations:");
        for (TrafficLight light : TrafficLight.values()) {
            System.out.println(light + ": " + lightDurations.get(light) + " seconds");
        }
    }

    // Helper method to get the next traffic light
    private static TrafficLight getNextLight(TrafficLight currentLight) {
        switch (currentLight) {
            case RED:
                return TrafficLight.GREEN;
            case GREEN:
                return TrafficLight.YELLOW;
            case YELLOW:
                return TrafficLight.RED;
            default:
                throw new IllegalArgumentException("Unknown traffic light: " + currentLight);
        }
    }
}

