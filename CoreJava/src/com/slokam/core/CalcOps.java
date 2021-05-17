package com.slokam.core;
class Calc{
	int add(int a,int b) {
		return a+b;
	}
	int sub(int a,int b) {
		return a-b;
	}
	int mul(int a,int b) {
		return a*b;
	}
	double div(float a,float b) {
		return a/b;
	}
}
public class CalcOps {
public static void main(String[] args) {
	Calc c = new Calc();
	System.out.println(c.add(30, 20));
	System.out.println(c.sub(30, 20));
	System.out.println(c.mul(30, 20));
	System.out.println(c.div(30, 20));
	Test2 t2 = new Test2();
	System.out.println(t2.intr(14, 2,500000) );
}
}
