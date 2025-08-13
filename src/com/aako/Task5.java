// Insert first 5 natural Numbers into a Queue and display.

package com.aako;
import java.util.Queue;
import java.util.LinkedList;

public class Task5 {

	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<>();
		
		for(int i=1;i<6;i++) {
			queue.add(i);
			
		}
		
		System.out.println(queue);

	}

}
