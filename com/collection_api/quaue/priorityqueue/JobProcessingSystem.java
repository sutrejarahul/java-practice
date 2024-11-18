package com.collection_api.quaue.priorityqueue;

import java.time.Instant;
import java.util.PriorityQueue;

record Job(int jobID, Instant processingTime, int priority) implements Comparable<Job> {

    @Override
    public String toString() {
        return "Job{" +
                "jobID=" + jobID +
                ", processingTime=" + processingTime +
                ", priority=" + priority +
                '}';
    }

    @Override
    public int compareTo(Job job) {
        // Reverse priority order (lower number = higher priority)
        int priorityComparison = Integer.compare(job.priority, this.priority);
        return priorityComparison != 0 ? priorityComparison : this.processingTime.compareTo(job.processingTime);
    }
}

public class JobProcessingSystem {

    public static void main(String[] args) throws InterruptedException {
        PriorityQueue<Job> queue = new PriorityQueue<>();

        // Adding jobs with unique processing times for realistic ordering
        queue.add(new Job(1, Instant.now(), 3));
        Thread.sleep(1);

        queue.add(new Job(2, Instant.now(), 1));
        Thread.sleep(1);

        queue.add(new Job(3, Instant.now(), 4));
        Thread.sleep(1);

        queue.add(new Job(4, Instant.now(), 1));

        // Process jobs based on priority level
        System.out.println("\nProcessing jobs by priority level:");
        while (!queue.isEmpty()) {
            Job job = queue.poll();
            System.out.println("Processing Job ID: " + job.jobID() + " | Priority: " + job.priority() +
                    " | Processing Time: " + job.processingTime());
        }
    }
}
