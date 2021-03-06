package com.slokam.core.innerclasses;

// we can write a inner class inside another inner class that is called as nested inner classes
public class NestedInnnerClass {

	private int a =20;
	class Inner1{
		class Inner2{
			public void m1() {
				System.out.println(a);
				System.out.println("method from inner2 class");
			}
		}
	}
	public static void main(String[] args) {
		NestedInnnerClass.Inner1.Inner2 ref = new NestedInnnerClass().new Inner1().new Inner2();
		ref.m1();
	}
}
