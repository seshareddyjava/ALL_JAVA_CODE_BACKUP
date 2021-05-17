package com.slokam.core;

public class WhileLoopExample {

	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 1, 4, 50, 60, 70, 8, 90, 100 };
		int s = a[0];
		int p = 0;
		int i = 0;
		while (i < a.length) {
			if (a[i] < s) {
				s = a[i];
				p = i;
			}
			i = i + 1;
		}

		System.out.println("smallest value position " + p + " smallest value is " + s);

	}
}
