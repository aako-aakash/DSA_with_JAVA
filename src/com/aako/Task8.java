// Use a LinkedList to insert 4 colors, insert one color at the end.

package com.aako;
import java.util.LinkedList;

public class Task8 {

	public static void main(String[] args) {
			LinkedList<String> LL=new LinkedList<>();
			
			LL.add("BLACK");
			LL.add("RED");
			LL.add("ORANGE");
			LL.add("YELLOW");
			
			for(int i=0;i<LL.size();i++) {
				System.out.println((i+1)+ " "+ LL.get(i));
			}

			LL.addLast("BROWN");
			
			System.out.println("\nList after adding element at End: ");
			for(int i=0;i<LL.size();i++) {
				System.out.println((i+1)+ " "+ LL.get(i));
			}
	}

}
