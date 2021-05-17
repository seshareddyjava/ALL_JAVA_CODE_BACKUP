package com.slokam.doublecolonOperator;

public class CarImpl {

	public CarImpl() {
		System.out.println("");
	}
	public void seat() {
		System.out.println("car seat");
	}
	public static void main(String[] args) {
		CarImpl c = new CarImpl();
		Car cc = c::seat;
		cc.engine();
	}
}
