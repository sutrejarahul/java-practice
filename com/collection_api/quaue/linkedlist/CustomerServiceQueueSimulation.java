package com.collection_api.quaue.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class CustomerServiceQueueSimulation {

    public static void main(String[] args) {
        // Initialize the queue with customer names
        Queue<String> queue = new LinkedList<>();
        queue.add("Kakashi");
        queue.add("Naruto");
        queue.add("Sasuke");
        queue.add("Sakura");
        queue.add("Jiraiya");
        queue.add("Minato");
        queue.add("Kushina");

        System.out.println("Customer Queue: " + queue);

        // Serve customers
        serveCustomer(queue);
    }

    public static void serveCustomer(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + " is being served.");
            System.out.println("Current queue: " + queue);
        }
        System.out.println("All customers have been served.");
    }
}

