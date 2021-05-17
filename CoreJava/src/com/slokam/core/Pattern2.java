package com.slokam.core;

interface I{
	/*
	 * void m1(); int a =10;
	 */
	default void m2(){
		System.out.println("method m2");
	}
}
public class Pattern2 implements I {
	public static void main(String[] args) {
		Pattern2 p2 = new Pattern2();
		p2.m2();
	}
}
