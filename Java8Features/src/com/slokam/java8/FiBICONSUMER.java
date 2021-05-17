package com.slokam.java8;

import java.util.function.BiConsumer;

public class FiBICONSUMER implements BiConsumer<String,Integer> {

	@Override
	public void accept(String t, Integer u) {
		System.out.println(t+"        "+u);
		
	}
	public static void main(String[] args) {
		BiConsumer<String,Integer> bc =new FiBICONSUMER();
		bc.accept("SESHA", 25);
		
		BiConsumer<String,Integer> bc1 = (t,u)->{
			System.out.println(t+"  "+u);
		};
		bc1.accept("three", 30);
	}
	

}
