package com.collection_api.map.enummap;

import java.util.EnumMap;
import java.util.Map;

public class TaskScheduler {
    public static void main(String[] args) {
        // Create an EnumMap instance
        EnumMap<Day, String> taskSchedule = new EnumMap<>(Day.class);

        // 1. Add elements to the EnumMap
        taskSchedule.put(Day.MONDAY, "Team Meeting");
        taskSchedule.put(Day.TUESDAY, "Work on Project A");
        taskSchedule.put(Day.WEDNESDAY, "Client Presentation");
        taskSchedule.put(Day.THURSDAY, "Code Review");
        taskSchedule.put(Day.FRIDAY, "Weekly Report");

        // 2. Retrieve value by key
        System.out.println("Task on Monday: " + taskSchedule.get(Day.MONDAY));

        // 3. Get all key-value pairs
        System.out.println("Full schedule:");
        for (Map.Entry<Day, String> entry : taskSchedule.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // 4. Check if a key exists
        System.out.println("Contains FRIDAY? " + taskSchedule.containsKey(Day.FRIDAY));

        // 5. Handle missing entries
        String saturdayTask = taskSchedule.get(Day.SATURDAY);
        System.out.println("Task on Saturday: " + (saturdayTask != null ? saturdayTask : "No task scheduled"));

        // 6. List all days, including unscheduled ones
        System.out.println("Weekly schedule:");
        for (Day day : Day.values()) {
            System.out.println(day + ": " + taskSchedule.getOrDefault(day, "No task scheduled"));
        }

        // 7. Remove an entry and check size
        taskSchedule.remove(Day.THURSDAY);
        System.out.println("After removing THURSDAY, schedule: " + taskSchedule);
        System.out.println("Total tasks scheduled: " + taskSchedule.size());
    }
}
