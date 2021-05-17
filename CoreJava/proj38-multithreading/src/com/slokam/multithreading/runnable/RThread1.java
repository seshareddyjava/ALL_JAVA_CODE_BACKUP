package com.slokam.multithreading.runnable;

public class RThread1 implements Runnable {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread1 execution");
		}
		
	}
}
