package com.collection_api.quaue.priorityqueue;

import java.util.PriorityQueue;

record TaskClass(String name, int priority) implements Comparable<TaskClass> {

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }

    @Override
    public int compareTo(TaskClass other) {
        int priorityComparison = Integer.compare(this.priority, other.priority);
        return priorityComparison != 0 ? priorityComparison : this.name.compareTo(other.name);
    }
}

public class TaskScheduling {

    public static void main(String[] args) {
        PriorityQueue<TaskClass> taskQueue = new PriorityQueue<>();

        // Adding tasks to the queue with varying priorities
        taskQueue.add(new TaskClass("Send Weekly Report", 3));
        taskQueue.add(new TaskClass("User Data Sync", 1));
        taskQueue.add(new TaskClass("Optimize Server", 2));
        taskQueue.add(new TaskClass("Security Scan", 4));
        taskQueue.add(new TaskClass("Database Backup", 1));

        System.out.println("Processing tasks based on priority:");

        // Process tasks based on priority
        System.out.println("\nProcessing tasks by priority:");
        while (!taskQueue.isEmpty()) {
            TaskClass task = taskQueue.poll();
            System.out.println("Processing " + task.name() + " with priority " + task.priority());
        }
    }
}
