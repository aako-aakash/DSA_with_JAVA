package com.aako;
import java.util.ArrayList;
import java.util.Collections;

public class SortStudentList {
    public static void main(String[] args) {
        // Step 1: Create a list of student names
        ArrayList<String> students = new ArrayList<>();
        students.add("Aakash");
        students.add("Aako");
        students.add("Rohit");
        students.add("Shivam");
        students.add("Monty");

        //  original list
        System.out.println("Original List:");
        System.out.println(students);

        // Sorting  in Ascending order 
        Collections.sort(students);
        System.out.println("\nSorted in Ascending Order:");
        System.out.println(students);

        // Sort in Descending order
        Collections.sort(students, Collections.reverseOrder());
        System.out.println("\nSorted in Descending Order:");
        System.out.println(students);
    }
}
