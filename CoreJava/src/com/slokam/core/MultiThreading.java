package com.slokam.core;

class Cards extends Thread{
	public void run() {
		try {
			Hall h = new Hall();
			h.join();
			Thread.currentThread().sleep(4000);
			System.out.println("******Cards printing process stared******");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
class Hall extends Thread{
	public void run() {
		try {
			Bride b = new Bride();
			b.join();
			Thread.currentThread().sleep(2000);
			System.out.println("*****Fetching Marriage hall details***** ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
class Bride extends Thread{
	public void run() {
		try {
			
			System.out.println("******Fetching Bride name Details******** ");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class MultiThreading{
	public static void main(String[] args) {
		Bride b = new Bride();
		b.start();
		Hall h = new Hall();
		h.start();
		Cards c = new Cards();
		c.start();
	}
}
