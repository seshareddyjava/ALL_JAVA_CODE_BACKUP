package com.slokam.core.innerclasses;

public class AnonymousInnerClassTest {
	public void taste() {
		System.out.println("sweet");
	}
	public static void main(String[] args) {
		//we are creating the anonymous child class 
		AnonymousInnerClassTest a = new AnonymousInnerClassTest() {
			@Override
			public void taste() {
				taste2();
				System.out.println("spicy");
			}
			public void taste2() {
				System.out.println("idont know the taste");
			}
		};
		
		a.taste();
		//taste2() method is a temporary method we can not access out side of the class
		//a.taste2();
		//we are creating object for the parent class
		AnonymousInnerClassTest ait = new AnonymousInnerClassTest();
		ait.taste();
		
	}

}
