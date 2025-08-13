package com.aako;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting{
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(5);
		numbers.add(17);
		numbers.add(23);
		
		System.out.println("Before Sorting");
		for(int val:numbers) {
			System.out.print(val+" ");
		}
		System.out.println();
		Collections.sort(numbers);
		System.out.println("After Sorting: ");
		
		for(int val:numbers) {
			System.out.print(val+" ");
		}
		
	}

}
