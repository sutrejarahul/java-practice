package com.enum_practice;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

    // enum with methods
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
