//#Q.3) Insert 5 employee IDs(Integers) into LinkedList and print all;

package com.aako;
import java.util.LinkedList;

public class Task3 {

	public static void main(String[] args) {
		LinkedList<Integer> employeeId=new LinkedList<>();
		employeeId.add(32313233);
		employeeId.add(233353);
		employeeId.add(343667);
		employeeId.add(477477);
		employeeId.add(132676);
		
		System.out.println(employeeId);
		
		System.out.println("Employee's IDs:");
		for(int i=0;i<employeeId.size();i++) {
			System.out.println(employeeId.get(i));
		}

	}

}
