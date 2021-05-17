package com.slokam.java8;

interface I{
	default void m1() {
		System.out.println("output from default mehod");
	}
}
public class DefMethods implements I {

	public static void main(String[] args) {
		new DefMethods().m1();// if we are creating single object then it is preferred to use this approach

	}

}
