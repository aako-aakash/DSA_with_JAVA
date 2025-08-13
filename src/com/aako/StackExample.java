package com.aako;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack after push operations: " + stack);

        // Pop elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the stack after pop
        System.out.println("Stack after pop operation: " + stack);

        // Peek at the top element
        int top = stack.peek();
        System.out.println("Top element now: " + top);

        // Check if stack is empty
        System.out.println("Is the stack empty? " + stack.isEmpty());
    }
}

