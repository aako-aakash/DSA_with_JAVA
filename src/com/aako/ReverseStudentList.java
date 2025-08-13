package com.aako;
import java.util.ArrayList;
import java.util.Collections;

public class ReverseStudentList {
    public static void main(String[] args) {
        // Step 1: Create a list of student names
        ArrayList<String> students = new ArrayList<>();
        students.add("Aakash");
        students.add("AAKO");
        students.add("lucky");
        students.add("Sashi");
        students.add("Manish");

        // original list
        System.out.println("Original List:");
        System.out.println(students);

        // Reverse the list 
        Collections.reverse(students);

        //  reversed list
        System.out.println("Reversed List:");
        System.out.println(students);
    }
}
