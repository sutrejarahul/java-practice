package com.collection_api.quaue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Random;

class Patient implements Comparable<Patient> {
    private String name;
    private int severityLevel;
    private int arrivalOrder;

    public Patient(String name, int severityLevel, int arrivalOrder) {
        this.name = name;
        this.severityLevel = severityLevel;
        this.arrivalOrder = arrivalOrder;
    }

    public String getName() {
        return name;
    }

    public int getSeverityLevel() {
        return severityLevel;
    }

    public void setSeverityLevel(int severityLevel) {
        this.severityLevel = severityLevel;
    }

    @Override
    public String toString() {
        return "Patient{name='" + name + "', severityLevel=" + severityLevel + ", arrivalOrder=" + arrivalOrder + '}';
    }

    @Override
    public int compareTo(Patient patient) {
        int severityComparison = Integer.compare(patient.severityLevel, this.severityLevel); // Higher severity first
        return severityComparison != 0 ? severityComparison : Integer.compare(this.arrivalOrder, patient.arrivalOrder);
    }
}

public class HospitalPatientQueue {

    public static void main(String[] args) {
        PriorityQueue<Patient> patientQueue = new PriorityQueue<>();

        // Adding patients to the queue with severity level and arrival order
        patientQueue.add(new Patient("Hinata", 5, 5));
        patientQueue.add(new Patient("Sakura", 1, 1));
        patientQueue.add(new Patient("Eno", 1, 4));
        patientQueue.add(new Patient("Tamri", 5, 2));
        patientQueue.add(new Patient("Tenten", 1, 3));

        // Create a copy of the queue for updating severity levels later
        PriorityQueue<Patient> patientQueueCopy = new PriorityQueue<>(patientQueue);

        // Process patients based on initial severity level
        System.out.println("Treating patients by initial severity level:");
        processPatients(patientQueue);

        // Update severity levels using the copied queue
        updatePatientSeverity(patientQueueCopy);
    }

    public static void processPatients(PriorityQueue<Patient> patientQueue) {
        while (!patientQueue.isEmpty()) {
            Patient patient = patientQueue.poll();
            System.out.println("Treating " + patient.getName() + " with severity " + patient.getSeverityLevel());
        }
    }

    public static void updatePatientSeverity(PriorityQueue<Patient> patientQueue) {
        System.out.println("\nUpdating severity levels...");

        PriorityQueue<Patient> updatedQueue = new PriorityQueue<>();
        Random random = new Random();

        while (!patientQueue.isEmpty()) {
            Patient patient = patientQueue.poll();

            // Generate random severity level (1 or 5)
            int newSeverity = random.nextInt(2) == 0 ? 1 : 5;
            patient.setSeverityLevel(newSeverity);

            // Reinsert into the updated queue
            updatedQueue.add(patient);
        }

        System.out.println("Treating patients after updating severity levels:");
        processPatients(updatedQueue);
    }
}

