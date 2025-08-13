//Create an ArrayList of a mobile brands and insert a new one in the middle.

package com.aako;
import java.util.ArrayList;

public class Task10 {

	public static void main(String[] args) {
		ArrayList<String> arList=new ArrayList<>();
		
		arList.add("Apple");
		arList.add("Nokia");
		arList.add("Samsung");
		arList.add("Realme");
		arList.add("Vivo");
		arList.add("Oppo");
		arList.add("Nothing");
		
		System.out.println(arList);
		int midIdx=arList.size()/2;
		
		arList.add(midIdx,"Xiaomi");
		
		System.out.println("\nList after adding a element at middle of the List");
		
		System.out.println(arList);
	}

}
