package com.aako;
import java.util.*;

public class Graph_Task1 {

	public static void main(String[] args) {
		Map<String,List<String>> CityName=new HashMap<>();
		CityName.put("Pune", Arrays.asList("Mumbai","Delhi"));
		CityName.put("Mumbai", Arrays.asList("Pune","Kolkata"));
		CityName.put("Delhi", Arrays.asList("Pune"));
		CityName.put("Kolkata", Arrays.asList("Mumbai"));
		
        List<String> cities=new ArrayList<>(CityName.keySet());
		
		for(int i=0;i<cities.size();i++) {
			String city=cities.get(i);
			System.out.println(city+" is connected to "+CityName.get(city));
		}

	}

}
