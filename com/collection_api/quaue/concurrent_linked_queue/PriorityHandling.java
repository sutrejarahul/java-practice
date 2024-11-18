package com.collection_api.quaue.concurrent_linked_queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class PriorityHandling {

    public static void main(String[] args) {
        ConcurrentLinkedQueue<Element> queue = new ConcurrentLinkedQueue<>();

        // Add elements with different priorities
        queue.offer(new Element("Task 1", Priority.LOW));
        queue.offer(new Element("Task 2", Priority.HIGH));
        queue.offer(new Element("Task 3", Priority.MEDIUM));
        queue.offer(new Element("Task 4", Priority.LOW));
        queue.offer(new Element("Task 5", Priority.HIGH));

        System.out.println("Initial Queue: " + queue);

        // Process elements with priority handling
        while (!queue.isEmpty()) {
            Element element = pollWithPriority(queue);
            System.out.println("Processing " + element);
        }
    }

    // Helper method to poll elements with priority handling
    public static Element pollWithPriority(ConcurrentLinkedQueue<Element> queue) {
        Element highPriorityElement = null;

        // Find the highest-priority element
        for (Element elem : queue) {
            if (elem.getPriority() == Priority.HIGH) {
                highPriorityElement = elem;
                break;
            } else if (elem.getPriority() == Priority.MEDIUM && highPriorityElement == null) {
                highPriorityElement = elem;
            }
        }

        // Remove the selected priority element from the queue
        if (highPriorityElement != null) {
            queue.remove(highPriorityElement);
        } else {
            // Default to poll if no high or medium priority elements found
            highPriorityElement = queue.poll();
        }

        return highPriorityElement;
    }

    // Priority levels
    enum Priority {
        HIGH, MEDIUM, LOW
    }

    // Element class with priority
    static class Element {
        private final String name;
        private final Priority priority;

        public Element(String name, Priority priority) {
            this.name = name;
            this.priority = priority;
        }

        public Priority getPriority() {
            return priority;
        }

        @Override
        public String toString() {
            return "Element{name='" + name + "', priority=" + priority + '}';
        }
    }
}

