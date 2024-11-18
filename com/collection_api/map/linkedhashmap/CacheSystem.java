package com.collection_api.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class CacheSystem<K, V> {

    private final int capacity;
    private final LinkedHashMap<K, V> cache;

    // Constructor to initialize cache with a specified capacity
    public CacheSystem(int capacity) {
        this.capacity = capacity;

        // Set accessOrder to true for LRU behavior
        this.cache = new LinkedHashMap<K, V>(capacity, 0.75f, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
                // Remove the oldest entry if cache size exceeds the defined capacity
                return size() > CacheSystem.this.capacity;
            }
        };
    }

    // Method to add items to the cache
    public void put(K key, V value) {
        cache.put(key, value);
    }

    // Method to retrieve items from the cache
    public V get(K key) {
        return cache.getOrDefault(key, null);
    }

    // Method to display the cache contents
    public void displayCache() {
        System.out.println(cache);
    }

    public static void main(String[] args) {
        // Create a cache with a capacity of 3
        CacheSystem<String, Integer> lruCache = new CacheSystem<>(3);

        // Adding entries to the cache
        lruCache.put("Apple", 100);
        lruCache.put("Banana", 200);
        lruCache.put("Orange", 300);

        // Accessing an entry to make it recently used
        lruCache.get("Apple");

        // Adding a new entry - this will remove the least recently used entry (Banana)
        lruCache.put("Grapes", 400);

        // Displaying cache contents
        lruCache.displayCache();

        // Adding another new entry - this will remove the least recently used entry (Orange)
        lruCache.put("Peach", 500);

        // Displaying cache contents again
        lruCache.displayCache();
    }
}

