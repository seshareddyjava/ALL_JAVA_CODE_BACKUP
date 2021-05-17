package com.slokam.core;

public class GreatestValue {
	public static void main(String[] args) {
		// array creation
		int[] a = { 2, 8, 5, 4, 3, 1, 7, 20, 9, 10, 6 };
		int g = a[0];
		int p = 0;
		// logic to get array length
		System.out.println("array length : " + a.length);
		// logic to print greatest value and its position
		for (int i = 0; i < a.length; i++) {
			if (a[i] > g) {
				g = a[i];
				p = i;
			}
		}
		System.out.println("Greatest value is :--> " + g + "  position of the gratest is :--> " + p);
	}
}
