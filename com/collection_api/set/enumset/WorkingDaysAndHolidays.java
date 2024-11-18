package com.collection_api.set.enumset;

import java.util.EnumSet;

public class WorkingDaysAndHolidays {

    private EnumSet<Day> workingDays = EnumSet.of(Day.MONDAY, Day.TUESDAY, Day.WEDNESDAY, Day.THURSDAY, Day.FRIDAY);
    private EnumSet<Day> holidays = EnumSet.of(Day.SATURDAY, Day.SUNDAY);

    public static void main(String[] args) {
        WorkingDaysAndHolidays scheduler = new WorkingDaysAndHolidays();

        // Example of adding/removing days
        scheduler.removeWorkingDay(Day.MONDAY);
        scheduler.removeHoliday(Day.SATURDAY);

        // Checking and printing day type
        scheduler.printDayType(Day.MONDAY);

        // Display all working days and holidays
        scheduler.printWorkingDays();
        scheduler.printHolidays();
    }

    public void addWorkingDay(Day day) {
        workingDays.add(day);
    }

    public void removeWorkingDay(Day day) {
        workingDays.remove(day);
    }

    public void addHoliday(Day day) {
        holidays.add(day);
    }

    public void removeHoliday(Day day) {
        holidays.remove(day);
    }

    public void printDayType(Day day) {
        String dayType = "Invalid Day";
        if (workingDays.contains(day)) {
            dayType = "Week Day";
        } else if (holidays.contains(day)) {
            dayType = "Weekend Day";
        }
        System.out.println(day + " is a " + dayType);
    }

    public void printWorkingDays() {
        System.out.println("Working days: " + workingDays);
    }

    public void printHolidays() {
        System.out.println("Holidays: " + holidays);
    }
}
