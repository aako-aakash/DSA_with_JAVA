//Insert numbers into a stack, then insert one more on top.

package com.aako;
import java.util.Stack;

public class Task9 {

	public static void main(String[] args) {
		Stack<Integer> stack=new Stack<>();
		
		stack.push(2);
		stack.push(7);
		stack.push(0);
		stack.push(8);
		stack.push(27);
		stack.push(33);
		stack.push(39);
		
		System.out.println(stack );
		
		
		stack.push(57);
		System.out.println("\nStack after pushing 57 on top: ");
		
		System.out.println(stack );
		
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}

	}

}
