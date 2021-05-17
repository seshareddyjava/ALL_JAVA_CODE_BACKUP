package com.slokam.core;

class Test {
	int m1() {
		return 100 + 300;
	}

	int m2() {
		return 200 + 300;
	}
}

public class TernaryExample {

	public static void main(String[] args) {
		Test t = new Test();
		int i = 15;
		// int j = (i<100)?1:0;
		int j = (i < 100) ? t.m1() : t.m2();
		System.out.println(j);
		do {
			System.out.println(i);
			i++;
			
		}while (i<16);

	}

}
