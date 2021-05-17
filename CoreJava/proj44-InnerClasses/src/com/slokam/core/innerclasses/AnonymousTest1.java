package com.slokam.core.innerclasses;

public class AnonymousTest1 {
	public static void main(String[] args) {
		Thread t = new Thread() {
			public void run() {
				for(int i=0;i<10;i++) {
					System.out.println(i);
					try {
						//System.out.println(Thread.currentThread().getName());
						Thread.currentThread().sleep(1000);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		};
		t.start();
	}

}
