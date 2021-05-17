package com.slokam.core;

public class StringClassMethods2 {

	public static void main(String[] args) {
		String str = new String("ANDHRA PRADESH GOVERNMENT");
		System.out.println(str.charAt(1));// prints the character at our specified position
		System.out.println(str.codePointAt(8));// prints unicode value of character at our specified position

		System.out.println(str.codePointBefore(8));// prints unicode value of character, at one position before our
													// specified position

		System.out.println(str.codePointCount(7, 15));
		String str2 = str.concat(" AMARAVATI");// it will append new string at the end of existing string
		System.out.println(str2);
		int i = str.compareTo(str2);// it compares two given strings and returns the difference in characters in two
									// strings
		System.out.println(i);
		System.out.println(str2.contains("AMA"));// it will return true if the specified sequence of characters present
													// in the current string,otherwise returns false
		String str3 = "ANDHRA PRADESH GOVERNMENT";
		System.out.println(str.equals(str3));// it will compares the content of two given objects,returns true if
												// content is equal otherwise retuns false
		System.out.println(str.getClass());
		System.out.println(str.intern());
		//System.out.println(str.indexOf(0));
		//System.out.println(str.indexOf(1));
		System.out.println(str.isEmpty());
		System.out.println(str.isEmpty());
		System.out.println(str.lastIndexOf('A'));
		System.out.println(str.replace('A', 'a'));
		System.out.println(str.toString());
		ConstructorExample1 d = new ConstructorExample1();
		System.out.println(d);
		System.out.println(str.hashCode());
	}

}
