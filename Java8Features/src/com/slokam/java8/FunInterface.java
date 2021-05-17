package com.slokam.java8;

@FunctionalInterface
interface I1 {
	void m1();
}

public class FunInterface{

	public static void main(String[] args) {
	 I1 i =()->{
		 System.out.println("hello");
	 };
	//System.out.println(i);
	 
	 i.m1();
	 
	}

}
