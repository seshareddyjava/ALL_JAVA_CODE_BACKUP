package com.slokam.multithreading2;

public class Thread1 extends Thread {

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread1 execution");
		}
	}
	
}
