package com.slokam.java8;

import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FiBIFUNCTION {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> bi = (a, b) -> {
			return a + b;
		};

		System.out.println(bi.apply(30, 20));
		
		Function<String,Integer> f = (a)->{
			return Integer.parseInt(a);
		};
		
		System.out.println(f.apply("10"));
		
		Comparator<String> c = (s,s1)->{
		return s.compareTo(s1);
		};
		System.out.println(c.compare("AAAA","BBBB"));

	}

}
