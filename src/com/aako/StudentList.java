package com.aako;

import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        // Create an ArrayList to store student names
        ArrayList<String> studentNames = new ArrayList<>();

        // Add 5 student names to the list
        studentNames.add("Akash");
        studentNames.add("Darshan");
        studentNames.add("Anurag");
        studentNames.add("Piyush");
        studentNames.add("Ronak");

        // Print all student names
        System.out.println("List of Students:");
        for (String name : studentNames) {
            System.out.println(name);
        }
    }
}
