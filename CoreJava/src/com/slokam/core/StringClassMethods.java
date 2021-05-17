package com.slokam.core;

class MulThread implements Runnable {
	public void run() {
		try {
			String str = new String("   SESHAREDDY JAVA   ");
			String str2 = str.trim();
			for (int i = (str2.length() - 1); i >= 0; i--) {
				System.out.print(str2.charAt(i));
				Thread.currentThread().sleep(1000);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class StringClassMethods {

	public static void main(String[] args) {
		MulThread mt = new MulThread();
		Thread t = new Thread(mt);
		t.start();

		/*
		 * System.out.println(str.substring(5, 10));
		 * System.out.println(str.indexOf("S")); System.out.println(str.trim());
		 */

	}

}
