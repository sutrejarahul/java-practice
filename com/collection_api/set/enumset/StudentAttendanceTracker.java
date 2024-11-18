package com.collection_api.set.enumset;

import java.util.EnumMap;

public class StudentAttendanceTracker {

    // Enum for attendance status
    enum AttendanceStatus {
        PRESENT, ABSENT, EXCUSED
    }

    // EnumMap to store the attendance count by status
    private final EnumMap<AttendanceStatus, Integer> attendanceRecord = new EnumMap<>(AttendanceStatus.class);

    // Constructor to initialize attendance counts to zero
    public StudentAttendanceTracker() {
        for (AttendanceStatus status : AttendanceStatus.values()) {
            attendanceRecord.put(status, 0);
        }
    }

    public static void main(String[] args) {
        StudentAttendanceTracker tracker = new StudentAttendanceTracker();

        // Mark attendance for multiple days
        tracker.markAttendance(AttendanceStatus.PRESENT);
        tracker.markAttendance(AttendanceStatus.ABSENT);
        tracker.markAttendance(AttendanceStatus.EXCUSED);
        tracker.markAttendance(AttendanceStatus.PRESENT);
        tracker.markAttendance(AttendanceStatus.PRESENT);

        // Print attendance summary
        tracker.printAttendanceSummary();
    }

    // Method to mark attendance for a day
    public void markAttendance(AttendanceStatus status) {
        attendanceRecord.put(status, attendanceRecord.get(status) + 1);
        System.out.println("Marked " + status + " for the day.");
    }

    // Method to print the attendance summary
    public void printAttendanceSummary() {
        System.out.println("Attendance Summary:");
        for (AttendanceStatus status : AttendanceStatus.values()) {
            System.out.println(status + ": " + attendanceRecord.get(status) + " days");
        }
    }
}
