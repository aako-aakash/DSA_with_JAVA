package com.aako;
// Calculator using Polymorphism 

class Calc{
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a, int b,int c) {
		return a+b+c;
	}
}




public class Polymorphism1 {

	public static void main(String[] args) {
		Calc cal1=new Calc();
		System.out.println("Addition of 27 and 23 is: "+ cal1.add(27,23));
		System.out.println("Addition of 13,23 and 33 is: "+ cal1.add(13, 23, 33));

	}

}
