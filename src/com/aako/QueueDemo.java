package com.aako;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add 5 elements to the queue
        queue.add("Ferrari");
        queue.add("Dodge Challenger");
        queue.add("Range Rover");
        queue.add("Scorpio");
        queue.add("Porshe");

        // Display the queue
        System.out.println("Queue after adding 5 elements:");
        System.out.println(queue);

        // Remove 2 elements from the queue
        String removed1 = queue.remove();
        String removed2 = queue.remove();

        // Display the removed elements
        System.out.println("\nRemoved elements: " + removed1 + ", " + removed2);

        // Display the queue after removals
        System.out.println("\nQueue after removing 2 elements:");
        System.out.println(queue);
    }
}
