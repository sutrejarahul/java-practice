package com.enum_practice;

public class EnumSwitchCase {
    public static void main(String[] args) {
        Day day = Day.WEDNESDAY;

        switch (day) {
            case MONDAY ->
                System.out.println("Monday is weekday");
            case TUESDAY ->
                System.out.println("Tuesday is weekday");
            case WEDNESDAY ->
                System.out.println("Wednesday is weekday");
            case THURSDAY ->
                System.out.println("Thursday is weekday");
            case FRIDAY ->
                System.out.println("Friday is weekday");
            case SATURDAY ->
                System.out.println("Saturday is weekday");
            case SUNDAY ->
                System.out.println("Sunday is weekday");
            default ->
                throw new IllegalStateException("invalid week day: " + day);
        }
    }
}
