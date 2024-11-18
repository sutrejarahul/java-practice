package com.collection_api.quaue.priorityqueue;

import java.time.Instant;
import java.util.PriorityQueue;

record Ticket(int ticketID, String customerName, int priorityLevel, Instant timestamp) implements Comparable<Ticket> {

    @Override
    public String toString() {
        return "Ticket{Ticket Id=" + ticketID + ", Customer Name=" + customerName + ", Ticket Priority=" + priorityLevel + "}";
    }

    @Override
    public int compareTo(Ticket ticket) {
        int priorityComparison = Integer.compare(this.priorityLevel, ticket.priorityLevel);
        return priorityComparison != 0 ? priorityComparison : this.timestamp.compareTo(ticket.timestamp);
    }
}

public class CustomerSupportTicketSystem {

    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Ticket> ticketQueue = new PriorityQueue<>();

        ticketQueue.add(new Ticket(1, "Bruce", 1, Instant.now()));
        Thread.sleep(1);  // Ensuring different timestamps
        ticketQueue.add(new Ticket(2, "Luther Lex", 5, Instant.now()));
        Thread.sleep(1);
        ticketQueue.add(new Ticket(3, "Clark", 2, Instant.now()));
        Thread.sleep(1);
        ticketQueue.add(new Ticket(4, "Alfred", 4, Instant.now()));
        Thread.sleep(1);
        ticketQueue.add(new Ticket(5, "Diana", 3, Instant.now()));
        Thread.sleep(1);
        ticketQueue.add(new Ticket(6, "Harley", 5, Instant.now()));

        // Process ticket based on priority level
        System.out.println("\nProcessing tickets by priority level:");
        while (!ticketQueue.isEmpty()) {
            Ticket ticket = ticketQueue.poll();
            System.out.println("Processing " + ticket.customerName() + " with priority " + ticket.priorityLevel());
        }
    }
}

