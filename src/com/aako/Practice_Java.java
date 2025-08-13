//Write a Java program to demonstrate TreeMap to store sorted student names with their marks.

package com.aako;

import java.util.Map;
import java.util.TreeMap;

public class Practice_Java{
	public static void main(String[] args) {
		
		TreeMap<String,Integer> student_map=new TreeMap<>();
		student_map.put("A", 90);
		student_map.put("S", 93);
		student_map.put("K", 86);
		student_map.put("D", 99);
		student_map.put("L", 80);
		
		System.out.println("Student Map");
		System.out.println(student_map);
		
		for(Map.Entry<String, Integer> entry1: student_map.entrySet()) {
			System.out.println("Name:"+entry1.getKey() + " Marks: "+entry1.getValue());
		}
		
		
		
	}
}