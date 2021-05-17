package com.slokam.core;



public class CountingNonVowels {

	public static void main(String[] args) {
		String str = "For single line comment you can use";
		int count =0;
		System.out.println(str.length());
		for(int i=0;i<str.length();i++) {
			char c =str.charAt(i);
			if(c!=' ') {
			if(c!='a'&&c!='e'&&c!='i'&&c!='o'&&c!='u') {
				count++;
			}}
		}
		System.out.println(count);
		
		}

}
