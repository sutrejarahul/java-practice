package com.collection_api.set.enumset;

import java.util.EnumSet;

public class EnumSetExample {
    public static void main(String[] args) {
        // Creating an EnumSet containing all days
        EnumSet<Day> allDays = EnumSet.allOf(Day.class);
        System.out.println("All days: " + allDays);

        // Creating an empty EnumSet
        EnumSet<Day> noDays = EnumSet.noneOf(Day.class);
        System.out.println("No days: " + noDays);

        // Adding a single day
        EnumSet<Day> oneDay = EnumSet.of(Day.MONDAY);
        System.out.println("One day: " + oneDay);

        // Adding multiple days
        EnumSet<Day> workingDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
        System.out.println("Working days: " + workingDays);

        // Range of days
        EnumSet<Day> midWeekDays = EnumSet.range(Day.TUESDAY, Day.THURSDAY);
        System.out.println("Midweek days: " + midWeekDays);

        // Copy of an EnumSet
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY, Day.SUNDAY);
        EnumSet<Day> weekendCopy = EnumSet.copyOf(weekend);
        System.out.println("Weekend copy: " + weekendCopy);
    }
}
