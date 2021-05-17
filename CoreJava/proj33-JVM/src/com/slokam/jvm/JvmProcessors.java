package com.slokam.jvm;

public class JvmProcessors {

	public static void main(String[] args) {
		
		Runtime r=Runtime.getRuntime();
		System.out.println(r.availableProcessors());
		System.out.println(r.totalMemory());

	}

}
