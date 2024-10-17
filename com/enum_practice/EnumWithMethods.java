package com.enum_practice;

public class EnumWithMethods {
    public static void main(String[] args) {
        Day today = Day.SATURDAY;
        if (today.isWeekend()) {
            System.out.println("It's weekend!");
        } else {
            System.out.println("It's a weekday.");
        }
    }
}
