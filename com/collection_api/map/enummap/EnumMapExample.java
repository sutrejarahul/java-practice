package com.collection_api.map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapExample {
    public static void main(String[] args) {
        // Create an EnumMap instance
        EnumMap<Day, String> taskSchedule = new EnumMap<>(Day.class);

        // 1. put(): Add elements to the EnumMap
        taskSchedule.put(Day.MONDAY, "Team Meeting");
        taskSchedule.put(Day.TUESDAY, "Work on Project A");
        taskSchedule.put(Day.WEDNESDAY, "Client Presentation");
        taskSchedule.put(Day.THURSDAY, "Code Review");
        taskSchedule.put(Day.FRIDAY, "Weekly Report");

        // 2. putAll(): Copy elements from another map
        EnumMap<Day, String> additionalTasks = new EnumMap<>(Day.class);
        additionalTasks.put(Day.SATURDAY, "Community Service");
        additionalTasks.put(Day.SUNDAY, "Rest and Recharge");
        taskSchedule.putAll(additionalTasks);

        // 3. get(): Retrieve value by key
        System.out.println("Task on Monday: " + taskSchedule.get(Day.MONDAY));

        // 4. containsKey(): Check if a key exists
        System.out.println("Contains FRIDAY? " + taskSchedule.containsKey(Day.FRIDAY));

        // 5. containsValue(): Check if a value exists
        System.out.println("Contains 'Code Review'? " + taskSchedule.containsValue("Code Review"));

        // 6. size(): Get the number of key-value pairs
        System.out.println("Total tasks scheduled: " + taskSchedule.size());

        // 7. isEmpty(): Check if the map is empty
        System.out.println("Is the schedule empty? " + taskSchedule.isEmpty());

        // 8. remove(): Remove an entry by key
        taskSchedule.remove(Day.THURSDAY);
        System.out.println("After removing THURSDAY: " + taskSchedule);

        // 9. keySet(): Get all keys
        System.out.println("All scheduled days: " + taskSchedule.keySet());

        // 10. values(): Get all values
        System.out.println("All tasks: " + taskSchedule.values());

        // 11. entrySet(): Get all key-value pairs
        System.out.println("Full schedule:");
        for (Map.Entry<Day, String> entry : taskSchedule.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 12. clear(): Remove all entries
        taskSchedule.clear();
        System.out.println("Schedule after clearing: " + taskSchedule);
    }
}

