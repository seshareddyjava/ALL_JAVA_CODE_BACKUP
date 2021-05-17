package com.slokam.java8;

import java.util.function.Consumer;

public class FiCONSUMER  {

	/*
	 * @Override public void accept(String t) { System.out.println(t);
	 * 
	 * }
	 */
	/*public static void main(String[] args) {
		Consumer<String> c = new FinterCONSUMER();
		c.accept("SSSSS");
	}*/

	public static void main(String[] args) {
		Consumer<String> c=(t)->{
			System.out.println(t);
		};
		c.accept("SSSSSSSSSSS");
	}
}
