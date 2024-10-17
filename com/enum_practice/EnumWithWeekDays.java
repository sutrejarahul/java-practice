package com.enum_practice;

public class EnumWithWeekDays {

    public static void main(String[] args) {
        // printing single value
        Day today = Day.TUESDAY;
        System.out.println("Today is: " + today);

        // printing all values
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);
        }

        // printing single ordinal number
        int tuesday = Day.TUESDAY.ordinal();
        System.out.println("week day number of Tuesday is: "+ tuesday);

        // printing all ordinal number
        for (Day day : days) {
            System.out.println("week day number of "+day+" is: "+ day.ordinal());
        }
    }
}
