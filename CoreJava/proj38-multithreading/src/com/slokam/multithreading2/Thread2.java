package com.slokam.multithreading2;

public class Thread2 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread2 execution");
		}
	}
	
	
}
