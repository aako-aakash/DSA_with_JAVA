package com.aako;

import java.util.*;

public class SimpleGraphs {

	public static void main(String[] args) {
		Map<String,List<String>> graph=new HashMap<>();
		
		graph.put("City A", Arrays.asList("City B", "City C"));
		graph.put("City B", Arrays.asList("City A", "City D"));
		graph.put("City C", Arrays.asList("City A"));
		graph.put("City D", Arrays.asList("City B"));
		
		List<String> cities=new ArrayList<>(graph.keySet());
		
		for(int i=0;i<cities.size();i++) {
			String city=cities.get(i);
			System.out.println(city+" is connected to "+graph.get(city));
		}
		

	}

}
