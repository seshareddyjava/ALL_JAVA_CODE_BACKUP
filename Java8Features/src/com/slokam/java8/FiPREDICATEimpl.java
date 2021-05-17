package com.slokam.java8;

import java.util.function.Predicate;

public class FiPREDICATEimpl implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {

		return t >= 0;
	}

	public static void main(String[] args) {
		 Predicate<Integer> p = new FiPREDICATEimpl();
		// System.out.println(p.test(10));
		 Predicate<Integer> p1 = a->a>=0;
		 System.out.println(p1.test(20));
	}
}
