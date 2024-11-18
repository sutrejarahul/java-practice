package com.collection_api.quaue.arrayqueue;

public class CircularQueue {
    private int[] queue;
    private int front, rear, size, capacity;

    // Constructor to initialize a circular queue with a specific capacity
    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = this.size = 0;
        this.rear = capacity - 1;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to add an element to the circular queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + element);
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = element;
        size++;
        System.out.println("Enqueued: " + element);
    }

    // Method to remove an element from the circular queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return Integer.MIN_VALUE;
        }
        int element = queue[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + element);
        return element;
    }

    // Method to get the front element of the queue
    public int getFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No front element.");
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    // Method to get the rear element of the queue
    public int getRear() {
        if (isEmpty()) {
            System.out.println("Queue is empty. No rear element.");
            return Integer.MIN_VALUE;
        }
        return queue[rear];
    }

    // Method to display the elements of the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        queue.displayQueue(); // Display current queue state

        queue.dequeue();
        queue.dequeue();

        queue.displayQueue(); // Display updated queue state after dequeuing

        queue.enqueue(6);
        queue.enqueue(7); // Adding elements after dequeue

        queue.displayQueue(); // Final display of queue state

        System.out.println("Front element: " + queue.getFront());
        System.out.println("Rear element: " + queue.getRear());
    }
}

