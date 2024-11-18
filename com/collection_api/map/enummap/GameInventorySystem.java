package com.collection_api.map.enummap;

import java.util.EnumMap;

enum ItemType {
    WEAPON, ARMOR, POTION, MISC;
}

public class GameInventorySystem {
    public static final EnumMap<ItemType, Integer> enumMap = new EnumMap<>(ItemType.class);

    public static void main(String[] args) {
        // Initial Entry
        addInventory(ItemType.WEAPON, 1);
        addInventory(ItemType.ARMOR, 3);
        addInventory(ItemType.POTION, 5);
        addInventory(ItemType.MISC, 9);

        // Update Entry
        updateInventory(ItemType.POTION, 6);

        // Print Inventory
        printInventory();

        // Remove an Item
        removeInventory(ItemType.WEAPON);

        // Attempt to Update Non-Existing Item
        updateInventory(ItemType.WEAPON, 2);

        // Clear Inventory
        clearInventory();
        printInventory();
    }

    public static void printInventory() {
        System.out.println("\nCurrent Inventory:");
        if (enumMap.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            enumMap.forEach((key, value) -> System.out.println(key + " : " + value));
        }
    }

    public static void addInventory(ItemType item, int quantity) {
        if (quantity < 0) {
            System.out.println("Cannot add negative quantity for " + item);
        } else {
            enumMap.put(item, quantity);
            System.out.println("Added " + quantity + " of " + item + " to inventory.");
        }
    }

    public static void updateInventory(ItemType item, int quantity) {
        if (!enumMap.containsKey(item)) {
            System.out.println("Cannot update " + item + ": item not found in inventory.");
        } else if (quantity < 0) {
            System.out.println("Cannot update " + item + " with negative quantity.");
        } else {
            enumMap.replace(item, quantity);
            System.out.println("Updated " + item + " quantity to " + quantity + ".");
        }
    }

    public static void removeInventory(ItemType item) {
        if (enumMap.remove(item) != null) {
            System.out.println("Removed " + item + " from inventory.");
        } else {
            System.out.println("Cannot remove " + item + ": item not found in inventory.");
        }
    }

    public static void clearInventory() {
        enumMap.clear();
        System.out.println("Cleared all inventory items.");
    }
}

