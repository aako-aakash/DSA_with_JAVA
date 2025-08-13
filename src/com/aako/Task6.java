// Insert city names into an ArrayList, then insert one more at index 2.

package com.aako;
import java.util.ArrayList;

public class Task6 {

	public static void main(String[] args) {
		ArrayList<String> cityName=new ArrayList<>();
		
		cityName.add("Delhi");
		cityName.add("Mumbai");
		cityName.add("Banglore");
		cityName.add("Noida");
		cityName.add("Ranchi");
		
		for(int i=0;i<cityName.size();i++) {
			System.out.println((i+1)+ " "+cityName.get(i));
			
		}
		
		cityName.add(2,"Surat");
		
		System.out.println(cityName);
		System.out.println();
		
		for(int i=0;i<cityName.size();i++) {
			System.out.println((i+1)+ " "+cityName .get(i));
			
		}
	}

}
