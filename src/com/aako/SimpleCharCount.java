package com.aako;

import java.util.HashMap;

public class SimpleCharCount {
    public static void main(String[] args) {
        String input = "programming";  // You can change this string

        // Create a HashMap to store character counts
        HashMap<Character, Integer> countMap = new HashMap<>();

        // Loop through each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // If character already exists in map, increase count
            if (countMap.containsKey(ch)) {
                int count = countMap.get(ch);
                countMap.put(ch, count + 1);
            } else {
                // If not in map, add with count 1
                countMap.put(ch, 1);
            }
        }

        // Print the character counts
        for (char ch : countMap.keySet()) {
            System.out.println(ch + " → " + countMap.get(ch));
        }
    }
}

