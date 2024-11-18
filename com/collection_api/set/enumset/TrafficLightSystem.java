package com.collection_api.set.enumset;

import java.util.EnumSet;

public class TrafficLightSystem {

    enum TrafficLight {
        RED, YELLOW, GREEN
    }

    private EnumSet<TrafficLight> stopLights = EnumSet.of(TrafficLight.RED, TrafficLight.YELLOW);
    private TrafficLight currentLight = TrafficLight.RED;

    public static void main(String[] args) {
        TrafficLightSystem trafficSystem = new TrafficLightSystem();

        // Print the initial state
        trafficSystem.printCurrentLightStatus();

        // Change light and print status
        trafficSystem.nextLight();
        trafficSystem.printCurrentLightStatus();

        trafficSystem.nextLight();
        trafficSystem.printCurrentLightStatus();

        trafficSystem.nextLight();
        trafficSystem.printCurrentLightStatus();
    }

    // Move to the next traffic light
    public void nextLight() {
        switch (currentLight) {
            case RED -> currentLight = TrafficLight.GREEN;
            case GREEN -> currentLight = TrafficLight.YELLOW;
            case YELLOW -> currentLight = TrafficLight.RED;
        }
    }

    // Print the current traffic light status
    public void printCurrentLightStatus() {
        String action = stopLights.contains(currentLight) ? "Stop" : "Go";
        System.out.println("Current light: " + currentLight + " -> " + action);
    }
}
