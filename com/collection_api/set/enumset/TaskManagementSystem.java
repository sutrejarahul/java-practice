package com.collection_api.set.enumset;

import java.util.EnumMap;
import java.util.EnumSet;

public class TaskManagementSystem {

    // Enum for task priority
    enum Priority {
        HIGH, MEDIUM, LOW
    }

    // Enum for task status
    enum Status {
        NOT_STARTED, IN_PROGRESS, COMPLETED
    }

    // EnumMap to store tasks by priority
    private EnumMap<Priority, EnumSet<Status>> taskMap = new EnumMap<>(Priority.class);

    // Constructor to initialize EnumMap with empty EnumSets for each priority
    public TaskManagementSystem() {
        for (Priority priority : Priority.values()) {
            taskMap.put(priority, EnumSet.noneOf(Status.class));
        }
    }

    public static void main(String[] args) {
        TaskManagementSystem taskSystem = new TaskManagementSystem();

        // Add tasks with different priorities and statuses
        taskSystem.addTask(Priority.HIGH, Status.NOT_STARTED);
        taskSystem.addTask(Priority.MEDIUM, Status.IN_PROGRESS);
        taskSystem.addTask(Priority.LOW, Status.COMPLETED);
        taskSystem.addTask(Priority.HIGH, Status.COMPLETED);

        // Print task summary
        taskSystem.printTaskSummary();

        // Move a task to a new status
        taskSystem.updateTaskStatus(Priority.HIGH, Status.NOT_STARTED, Status.IN_PROGRESS);
        taskSystem.printTaskSummary();
    }

    // Method to add a new task with given priority and status
    public void addTask(Priority priority, Status status) {
        taskMap.get(priority).add(status);
        System.out.println("Added task with priority " + priority + " and status " + status);
    }

    // Method to update the status of a task
    public void updateTaskStatus(Priority priority, Status oldStatus, Status newStatus) {
        if (taskMap.get(priority).remove(oldStatus)) {
            taskMap.get(priority).add(newStatus);
            System.out.println("Updated task with priority " + priority + " from " + oldStatus + " to " + newStatus);
        } else {
            System.out.println("No task found with priority " + priority + " and status " + oldStatus);
        }
    }

    // Method to print the task summary
    public void printTaskSummary() {
        System.out.println("Task Summary:");
        for (Priority priority : Priority.values()) {
            System.out.println("Priority: " + priority + " -> Statuses: " + taskMap.get(priority));
        }
    }
}
