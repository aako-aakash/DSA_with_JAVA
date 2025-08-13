//#Q.4) Insert 5 elements into a stack and print the stack.

package com.aako;
import java.util.Stack;

public class Task4 {
	public static void main(String[] args) {
		Stack<String> SuperHero=new Stack<>();
		SuperHero.push("Iron Man");
		SuperHero.push("John Wick");
	    SuperHero.push("Dare Devil");
		SuperHero.push("BatMan");
		SuperHero.push("Spider Man");
		
		System.out.println(SuperHero);
		System.out.println("Super Heros: ");
		for(int i=0;i<SuperHero.size();i++) {
			System.out.println(SuperHero.get(i));
		}

	}
}
