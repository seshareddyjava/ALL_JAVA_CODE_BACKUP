package com.slokam.core.innerclasses;

// we can write a inner class inside a method
public class MethodLocalInnerClass {
	int x =50;
	public static void m1() {
		int a =10;
		int b = 20;
		int c =30;
		class Inner{
			public void m2() {
				System.out.println(a);
				//System.out.println(x);
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	public static void main(String[] args) {
		new MethodLocalInnerClass().m1();
	}
}
