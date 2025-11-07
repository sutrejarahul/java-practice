package com.collection_api.map.enummap;

import java.util.EnumMap;

enum AnimalType {
    MAMMALS, BIRDS, REPTILES, FISH, AMPHIBIANS;
}

public class ZooAnimalTracking {

    public static void main(String[] args) {
        // Initialize the EnumMap
        EnumMap<AnimalType, Integer> animalCounts = new EnumMap<>(AnimalType.class);

        // Populate the map with animal counts
        animalCounts.put(AnimalType.MAMMALS, 1);
        animalCounts.put(AnimalType.BIRDS, 3);
        animalCounts.put(AnimalType.REPTILES, 5);
        animalCounts.put(AnimalType.FISH, 7);
        animalCounts.put(AnimalType.AMPHIBIANS, 9);

        // Retrieve and display the count of reptiles
        int totalReptiles = animalCounts.getOrDefault(AnimalType.REPTILES, 0);
        System.out.println("Total Reptile Animals: " + totalReptiles);

        // Calculate and display the total number of animals
        int totalAnimals = animalCounts.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total Animals in the Zoo: " + totalAnimals);

        // Display all animal counts
        System.out.println("\nDetailed Animal Counts:");
        animalCounts.forEach((type, count) -> System.out.println(type + ": " + count));
    }
}

