package com.collection_api.list.linkedlist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CheckCycle {
    public static void main(String[] args) {
        // Creating a linked list with a cycle for testing
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a cycle: Point the next of node 5 to node 3
        head.next.next.next.next.next = head.next.next;

        // Checking for cycle
        if (hasCycle(head)) {
            System.out.println("Cycle detected in the linked list.");
        } else {
            System.out.println("No cycle detected in the linked list.");
        }
    }

    // Method to detect cycle in the linked list using Floyd’s Cycle Detection Algorithm
    public static boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move slow pointer one step
            fast = fast.next.next;    // Move fast pointer two steps

            if (slow == fast) {
                return true;          // Cycle detected
            }
        }

        return false;  // No cycle found
    }
}
