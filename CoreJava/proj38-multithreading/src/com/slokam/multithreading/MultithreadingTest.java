package com.slokam.multithreading;

public class MultithreadingTest {

	
	public static void main(String[] args) {
		ThreadEx1 t1= new ThreadEx1();
		ThreadEx2 t2 = new ThreadEx2();
		
		t1.start();
		t2.start();
	}
	
}
