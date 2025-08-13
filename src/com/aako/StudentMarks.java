package com.aako;

import java.util.Map;
import java.util.TreeMap;

public class StudentMarks {
    public static void main(String[] args) {
        // Create a TreeMap to store student names and their marks
        TreeMap<String, Integer> studentMap = new TreeMap<>();

        // Add student names and marks
        studentMap.put("Aako", 85);
        studentMap.put("Akash", 92);
        studentMap.put("DD", 76);
        studentMap.put("PK", 89);
        studentMap.put("AK", 95);

        // Display the sorted student names and their marks
        System.out.println("Student Marks (Sorted by Name):");
        for (Map.Entry<String, Integer> entry : studentMap.entrySet()) {
            System.out.println("Name: " + entry.getKey() + " | Marks: " + entry.getValue());
        }
    }
}
