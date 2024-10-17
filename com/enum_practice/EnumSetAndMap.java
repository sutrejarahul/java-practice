package com.enum_practice;


import java.util.EnumMap;
import java.util.EnumSet;

public class EnumSetAndMap {

    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        for (Day day : weekend) {
            System.out.println(day);
        }

        EnumMap<Day, String> dayActivities = new EnumMap<>(Day.class);
        dayActivities.put(Day.MONDAY, "Work");
        dayActivities.put(Day.SATURDAY, "Relax");
        dayActivities.put(Day.SUNDAY, "Family Time");

        for (Day day : Day.values()) {
            System.out.println(day + ": " + dayActivities.getOrDefault(day, "No Activity"));
        }
    }
}
