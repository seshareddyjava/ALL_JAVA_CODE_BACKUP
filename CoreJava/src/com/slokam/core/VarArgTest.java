package com.slokam.core;

public class VarArgTest {
	static void m2(int...a) {
		for(int b : a) {
			System.out.println(b);
			System.out.println(a[2]);
		}
	}
	
	static void m3(int a,String b,String ...s) {
		System.out.println(a);
		System.out.println(b);
		for(String v :s) {
			System.out.println(v);
		}
	}
	
	/*
	 * public static void m4(int ...a,int b) {
	 * 
	 * }
	 */

	public static void main(String[] args) {
		//m2(10,20,30,40);
		m3(10,"asdf00","fjjdkfj","hfudshfiusdaf","hjfkj");
		
	}
}
