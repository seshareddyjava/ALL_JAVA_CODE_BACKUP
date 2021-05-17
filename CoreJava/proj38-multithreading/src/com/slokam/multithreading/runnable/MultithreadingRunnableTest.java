package com.slokam.multithreading.runnable;

public class MultithreadingRunnableTest {

	public static void main(String[] args) {
		RThread1 rt1 = new RThread1();
		RThread2 rt2 = new RThread2();
		
		Thread t1 = new Thread(rt1);
		Thread t2 = new Thread(rt2);
		
		t1.start();
		t2.start();
	}
}
