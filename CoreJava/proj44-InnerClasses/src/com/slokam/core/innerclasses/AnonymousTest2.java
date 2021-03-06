package com.slokam.core.innerclasses;

public class AnonymousTest2 {

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println(i);
				}
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
