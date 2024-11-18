package com.collection_api.quaue.linkedlist;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority tasks should come first
        return Integer.compare(other.priority, this.priority);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        // Initialize a PriorityQueue for tasks
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Add tasks with various priority levels
        taskQueue.add(new Task("Database Backup", 3));
        taskQueue.add(new Task("Send Weekly Report", 2));
        taskQueue.add(new Task("Security Scan", 4));
        taskQueue.add(new Task("Optimize Server", 1));
        taskQueue.add(new Task("User Data Sync", 5));

        System.out.println("Tasks in Queue (unsorted):");
        taskQueue.forEach(System.out::println);

        // Process tasks based on priority
        System.out.println("\nProcessing tasks by priority:");
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll();
            System.out.println("Processing " + task.getName() + " with priority " + task.getPriority());
        }
    }
}

