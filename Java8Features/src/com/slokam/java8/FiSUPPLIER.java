package com.slokam.java8;

import java.util.function.Supplier;

public class FiSUPPLIER implements Supplier<String> {

	@Override
	public String get() {
		
		return "slokam tech";
	}
	public static void main(String[] args) {
		Supplier<String> s = new FiSUPPLIER();
		String str =s.get();
		System.out.println(str);
	}

}
