//#Q.1) Insert 5 student names into an ArrayList and print them. DS:- Array
package com.aako;
import java.util.ArrayList;
public class Task_CW1 {

	public static void main(String [] args) {
		ArrayList<String> StudentNames=new ArrayList<String>();
		StudentNames.add("Shivam Gupta");
		StudentNames.add("Piyush SHrivastava");
		StudentNames.add("Anurag Pandey");
		StudentNames.add("Akash Kumar");
		StudentNames.add("Darshan Dadhich");
		
		System.out.println(StudentNames);
		System.out.println("Students Names: ");
		for(int i=0;i<StudentNames.size();i++) {
			System.out.println(StudentNames.get(i));
		}
	}

}
