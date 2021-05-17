package com.slokam.multithreading.methodsTesting;

public class JoinTest extends Thread {
	public static void main(String[] args) {
		
		
		
		
	}
	@Override
	public void run() {
		ThreadJoin1 t1 = new ThreadJoin1();
		t1.start();
		for(int i=0;i<20;i++) {
			try {
				t1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(i);
		}
	}

}

class ThreadJoin1 extends Thread{
	@Override
	public void run() {
		JoinTest t=new JoinTest();
		try {
			t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
}
