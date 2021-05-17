package com.slokam.java8;
@FunctionalInterface
interface Abc{
	int m1(int a,int b);
	default void m2() {
		System.out.println("Abc.m2()");
	}
	static void m3() {
		System.out.println("Abc.m3()");
	}
	
}
class AbcImpl implements Abc{
	
@Override
public int m1(int a,int b) {
	System.out.println("Java8.m1()");
	return a+b;
}}
public class Java8 implements Abc{

public static void main(String[] args) {
	Abc abc = new AbcImpl();
	System.out.println(abc.m1(10,20));
}

@Override
public int m1(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}
}
