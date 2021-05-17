//code to return the no.of times a character repeated
package com.slokam.core;

public class StringCharCount {

	public static void main(String[] args) {
		// creating a string
		String str = "SLOKAM TECH IS A SOFTWARE TRAINING CENTER";
		int count = 0;
		// logic to compare each element of string with 'A'
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A') {
				count++;
			}
		}
		// printing the count
		System.out.println("no.of times A repeated is--> " + count);

	}

}
