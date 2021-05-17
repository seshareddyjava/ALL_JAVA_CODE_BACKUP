package com.slokam.core;

public class DummyTest {

	public static void main(String[] args) {
		Dummy d = new Dummy();
		int a =d.countLines("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");
		System.out.println(a);
		int b = d.countWords("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");
		System.out.println(b);
		System.out.println(d.countChars('o',"C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt"));
		System.out.println(d.countSmallChars("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt"));
	}

}
