package com.slokam.multithreading.methodsTesting;

public class SleepTest {

	public static void main(String[] args) {
		
		ThreadJoin t1 = new ThreadJoin();
		t1.start();
	}
}
class ThreadJoin extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
			try {
				Thread.currentThread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}