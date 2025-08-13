package com.aako;


class Animal{
	public void sound() {
		System.out.println("Animal makes Sound");
	}
}

class Cat extends Animal{
	public void sound() {
		System.out.println("Meoww");
	}
}

public class Method_overriding {
	public static void main(String[] args) {
		Animal cat1=new Cat();
		cat1.sound();
	}
}
