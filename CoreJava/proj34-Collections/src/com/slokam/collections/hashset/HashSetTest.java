package com.slokam.collections.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("sesha");
		hs.add("reddy");
		hs.add("siva");
		hs.add("car");
		hs.add("car");
		
		System.out.println(hs);

	}

	@Override
	public String toString() {
		return "HashSetTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
