package com.slokam.practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="ydder ahses b";
//		for(int i=name.length()-1;i>=0;i--) {
//			System.out.print(name.charAt(i));
//		}
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch = name.charAt(i);
			if(!(ch>'a'&ch<'z')&&!(ch>'A'&ch<'Z')&&!(ch>'0'&ch<'9')) {
			count++;	
			}
		}
		System.out.println(count);

	}

}
