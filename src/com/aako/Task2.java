// #Q.2) Insert 3 car models into a vector and display them.
package com.aako;
import java.util.Vector;
public class Task2 {

	public static void main(String[] args) {
		Vector<String> Cars=new Vector<>();
		Cars.add("Defender");
		Cars.add("Range Rover");
		Cars.add("Dodge Challenger");
		
		System.out.println(Cars);
		
		System.out.println("Cars Information: ");
		for(int i=0;i<Cars.size();i++) {
			System.out.println(Cars.get(i));
		}
	}
}
