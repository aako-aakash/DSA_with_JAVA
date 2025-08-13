package com.aako;

import java.util.HashMap;
import java.util.Map;

public class ProductMap {
    public static void main(String[] args) {
        // Create a HashMap to store product name and price
        HashMap<String, Double> productMap = new HashMap<>();

        // Add product names and prices
        productMap.put("Pen", 10.0);
        productMap.put("Notebook", 50.0);
        productMap.put("Pencil", 5.0);
        productMap.put("Eraser", 3.0);
        productMap.put("Marker", 20.0);

        // Display all entries
        System.out.println("Product List:");
        for (Map.Entry<String, Double> entry : productMap.entrySet()) {
            System.out.println("Product: " + entry.getKey() + " | Price: ₹" + entry.getValue());
        }
    }
}
