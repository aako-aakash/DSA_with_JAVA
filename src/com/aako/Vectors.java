package com.aako;

import java.util.Vector;
public class Vectors {

	
	public static void main(String[] args) {
		Vector<String> fruits=new Vector<>();
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Avacado");
		fruits.add("Grapes");
		fruits.add("Blue Berry");
		
		System.out.println(fruits);
		System.out.println(fruits.get(1));
		System.out.println(fruits.size());
		fruits.remove("Grapes");
		fruits.remove(1);
		System.out.println(fruits);
		System.out.println(fruits.size());
	}

}
