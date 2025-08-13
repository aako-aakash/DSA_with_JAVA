package com.aako;

import java.util.ArrayList;
import java.util.Collections;

public class SortStrings {
    public static void main(String[] args) {
        // Create a list of employee names
        ArrayList<String> employeeNames = new ArrayList<>();

        // Add employee names
        employeeNames.add("Narayani");
        employeeNames.add("Ram");
        employeeNames.add("Kashish");
        employeeNames.add("Darshanaa");
        employeeNames.add("Paaro");
        employeeNames.add("AAKO");

        System.out.println("Before Sorting:");
        System.out.println(employeeNames);

        // Sort the list using Collections.sort()
        Collections.sort(employeeNames);

        System.out.println("\nAfter Sorting:");
        System.out.println(employeeNames);
    }
}

