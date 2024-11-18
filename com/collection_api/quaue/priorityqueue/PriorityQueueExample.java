package com.collection_api.quaue.priorityqueue;

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

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "Task{name='" + name + "', priority=" + priority + "}";
    }
}

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();

        // Adding tasks to the queue with varying priorities
        taskQueue.add(new Task("Task 1", 3)); // Low priority
        taskQueue.add(new Task("Task 2", 1)); // High priority
        taskQueue.add(new Task("Task 3", 2)); // Medium priority

        System.out.println("Processing tasks based on priority:");

        // Processing tasks based on their priority
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll(); // Retrieves and removes the highest-priority task
            System.out.println("Processing " + task);
        }
    }
}

