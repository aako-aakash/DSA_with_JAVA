package com.aako;

import java.util.HashMap;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the string
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase (optional) and remove spaces
        input = input.replaceAll("\\s", "");

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Loop through each character
        for (char ch : input.toCharArray()) {
            // If character is already in map, increment count
            if (charCountMap.containsKey(ch)) {
                charCountMap.put(ch, charCountMap.get(ch) + 1);
            } else {
                // Else, add it with count 1
                charCountMap.put(ch, 1);
            }
        }

        // Print the character counts
        System.out.println("\nCharacter frequencies:");
        for (char key : charCountMap.keySet()) {
            System.out.println(key + " → " + charCountMap.get(key));
        }

        sc.close();
    }
}
