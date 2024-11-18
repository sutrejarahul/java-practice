package com.collection_api.map.hashtable;

import java.util.Hashtable;

public class ShoppingCart {

    private static final Hashtable<String, Integer> cart = new Hashtable<>();

    public static void main(String[] args) {
        // Adding initial entries to the cart
        add("Item 1", 1);
        add("Item 2", 3);
        add("Item 3", 5);
        add("Item 4", 7);
        add("Item 5", 9);

        System.out.println("\nAfter Adding:");
        printCartItem();

        // Updating quantities in the cart item
        updateQuantity("Item 2", 2);
        updateQuantity("Item 4", -3);
        updateQuantity("Item 6", 4);

        // Removing a specific item from the cart
        remove("Item 1");

        System.out.println("\nAfter Removing Item 1:");
        printCartItem();
    }

    public static void printCartItem() {
        System.out.println("Cart Items:");
        System.out.println(String.format("%-15s %s", "Item", "Quantity"));
        System.out.println("-------------------------");
        cart.forEach((key, value) -> System.out.println(String.format("%-15s %d", key, value)));
    }

    public static void add(String item, int quantity) {
        if (quantity <= 0) {
            System.out.println("Cannot add " + item + " with non-positive quantity.");
            return;
        }
        cart.put(item, quantity);
        System.out.println(item + " added to the cart with quantity " + quantity + ".");
    }

    public static void updateQuantity(String item, int quantityChange) {
        if (!cart.containsKey(item)) {
            System.out.println(item + " not found in the cart. Please add it first.");
            return;
        }

        int updatedQuantity = cart.get(item) + quantityChange;
        if (updatedQuantity < 0) {
            System.out.println("Cannot reduce quantity below 0 for " + item + ".");
            return;
        }

        if (updatedQuantity == 0) {
            cart.remove(item);
            System.out.println(item + " has been removed from the cart due to zero quantity.");
        } else {
            cart.put(item, updatedQuantity);
            System.out.println(item + " quantity updated to " + updatedQuantity + ".");
        }
    }

    public static void remove(String item) {
        if (cart.remove(item) != null) {
            System.out.println(item + " has been removed from the cart.");
        } else {
            System.out.println(item + " was not found in the cart.");
        }
    }
}

