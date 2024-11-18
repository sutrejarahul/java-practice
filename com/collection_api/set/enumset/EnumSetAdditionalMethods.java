package com.collection_api.set.enumset;

import java.util.EnumSet;

public class EnumSetAdditionalMethods {
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

        // Adding elements
        EnumSet<Day> days = EnumSet.noneOf(Day.class);
        days.add(Day.MONDAY);
        days.add(Day.WEDNESDAY);
        System.out.println("Added days: " + days);

        // Removing an element
        days.remove(Day.MONDAY);
        System.out.println("After removing MONDAY: " + days);

        // Checking if an element is present
        System.out.println("Contains WEDNESDAY? " + days.contains(Day.WEDNESDAY));

        // Checking if the EnumSet is empty
        System.out.println("Is empty? " + days.isEmpty());

        // Complement of a set
        EnumSet<Day> notWeekend = EnumSet.complementOf(weekend);
        System.out.println("Not weekend: " + notWeekend);

        // Checking size
        System.out.println("Size of notWeekend: " + notWeekend.size());
    }
}

