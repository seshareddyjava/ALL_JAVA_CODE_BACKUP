package com.slokam.core;

class A{
	void greet() {
		System.out.println("hi");
	}
}

class B extends A{
	void greet() {
		System.out.println("hello");
		}
}

public class Polymorphism {

	public static void main(String[] args) {
		A a = new A();
		a.greet();
		System.out.println();
		A a1 = new B();
		a1.greet();
		System.out.println();
		B a2 = new B();
		a2.greet();
		
		B a3 = (B)new A();
		a3.greet();
		
	}

}
