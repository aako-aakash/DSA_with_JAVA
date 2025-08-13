package com.aako;

public class BinarySearchTask2 {

    public static void main(String[] args) {
        
        int[] numbers = {2, 4, 7, 10, 14, 18, 21, 25, 30}; // Sorted Array
        
        int target = 18; // Number to find
        int result = binarySearch(numbers, target);
        
        if (result == -1) {
            System.out.println("Number not found");
        } else {
            System.out.println("Number found at index: " + result);
        }
    }
    
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) { // Continue while search space is valid
            int mid = (left + right) / 2; // Middle index
            
            if (arr[mid] == target) { // Found target
                return mid;
            } 
            else if (arr[mid] < target) { // Search right half
                left = mid + 1;
            } 
            else { // Search left half
                right = mid - 1;
            }
        }
        
        return -1; // Target not found
    }
}




