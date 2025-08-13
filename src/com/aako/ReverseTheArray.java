package com.aako;

public class ReverseTheArray {

	public static void main(String[] args) {
		
		String[] list= {"AAKO","AAKASH","AYUSH","PIYUSH","IRONMAN","TONY"};
		System.out.println("Original list:");
		for(String val:list) {
			System.out.print(val+" ");
		}
		System.out.println();
		
		int i=0;
		int j=list.length-1;
		
		//Reversing the List
		while(i<=j) {
			// Swap elements at left and right
            String temp = list[i];
            list[i] = list[j];
            list[j] = temp;

            i++;
            j--;
		}
		
		System.out.println("Reversed List: ");
		
		for(String val:list) {
			System.out.print(val+" ");
		}
		
		
		

	}

}
