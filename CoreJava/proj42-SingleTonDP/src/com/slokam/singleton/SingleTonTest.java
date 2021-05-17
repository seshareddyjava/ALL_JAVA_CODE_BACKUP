package com.slokam.singleton;

public class SingleTonTest {
	
	public static void main(String[] args) {
		SingleTon st = SingleTon.getSingleTon();
		SingleTon st2 = SingleTon.getSingleTon();
		
		System.out.println(st==st2);
	}
	

}

class SingleTon{
	private static SingleTon st;
	
	private SingleTon() {	}

	public static SingleTon getSingleTon() {
		
		synchronized (SingleTon.class) {
			if(st==null) {
				st = new SingleTon();
			}
		}
		return st;
	}	
	
}