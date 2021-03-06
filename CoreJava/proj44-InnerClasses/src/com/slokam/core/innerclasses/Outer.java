package com.slokam.core.innerclasses;

public class Outer {

	private int a;
	int b=20;
	public void m2() {
		System.out.println("this is outer class instance method");
	}
	public static void m3() {
		System.out.println("this is outer class static method");
	}
	class Inner {
		public void m1() {
			a=10;
			System.out.println("private variable value assigned and accessed" + a);
			System.out.println("instance vriable accessed "+b);
			System.out.println("Method from inner class");
			//we can access the instance method directly
			m2();
			//we can access the static method directly
			m3();
			// this always refers current class object
			System.out.println(this);
			// to refer outer class object we have to use class name.this
			System.out.println(Outer.this);
		}
	}
	public static void main(String[] args) {
		Outer.Inner i = new Outer().new Inner();
		i.m1();
	}
}
