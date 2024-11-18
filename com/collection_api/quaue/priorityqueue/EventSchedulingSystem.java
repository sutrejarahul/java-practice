package com.collection_api.quaue.priorityqueue;

import java.util.Calendar;
import java.util.Date;
import java.util.PriorityQueue;

record Event(String eventName, int importanceLevel, Date eventDate) implements Comparable<Event> {

    @Override
    public int compareTo(Event event) {
        int importanceComparison = Integer.compare(event.importanceLevel, this.importanceLevel);  // Descending by importance
        return (importanceComparison != 0) ? importanceComparison : this.eventDate.compareTo(event.eventDate);  // Ascending by date
    }
}

public class EventSchedulingSystem {

    public static void main(String[] args) {
        PriorityQueue<Event> eventQueue = new PriorityQueue<>();

        Calendar calendar = Calendar.getInstance();

        calendar.add(Calendar.DATE, 5);
        Date ceremonyDate = calendar.getTime();
        eventQueue.add(new Event("Annual Ceremony", 3, ceremonyDate));

        calendar = Calendar.getInstance();  // Reset to current date
        calendar.add(Calendar.WEEK_OF_YEAR, -1);
        Date meetingDate = calendar.getTime();
        eventQueue.add(new Event("Annual Ceremony Meeting", 1, meetingDate));

        calendar = Calendar.getInstance();
        calendar.add(Calendar.WEEK_OF_YEAR, -2);
        Date decorationDate = calendar.getTime();
        eventQueue.add(new Event("Annual Ceremony Decoration", 3, decorationDate));

        calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 6);
        Date distributionDate = calendar.getTime();
        eventQueue.add(new Event("Prize Distribution", 1, distributionDate));

        System.out.println("\nProcessing events by importance level and date:");
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println("Event name: " + event.eventName() + " | importance level: " + event.importanceLevel() +
                    " | date: " + event.eventDate());
        }
    }
}
