//Create a vector of 3 books names, insert another at beginning.

package com.aako;
import java.util.Vector;

public class Task7 {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<>();
		
		vector.add("Clean Code");
		vector.add("Design Patterns");
		vector.add("Java: The Complete Reference");
		//System.out.println(vector);
		
		for(int i=0;i<vector.size();i++) {
			System.out.println((i+1)+" "+vector.get(i));
		}
		
		vector.addFirst("The Pragmatic Programmer");
		
		System.out.println("\nVector after adding element at first: ");
		for(int i=0;i<vector.size();i++) {
			System.out.println((i+1)+" "+vector.get(i));
		}

	}

}
