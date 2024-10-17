package com.enum_practice;

enum LogLevel {
    INFO(1), DEBUG(2), WARNING(3), ERROR(4), SUCCESS;

    private int severity;

    private LogLevel() {
        this.severity = 0;
    }

    private LogLevel(int severity) {
        this.severity = severity;
    }

    public int getSeverity() {
        return severity;
    }
}

public class EnumWithConstructorsAndFields {
    public static void main(String[] args) {
        // parameterized
        LogLevel level = LogLevel.ERROR;
        System.out.println("Log level: " + level + ", Severity: " + level.getSeverity());

        // non parameterized
        level = LogLevel.SUCCESS;
        System.out.println("Log level: " + level + ", Severity: " + level.getSeverity());
    }
}
