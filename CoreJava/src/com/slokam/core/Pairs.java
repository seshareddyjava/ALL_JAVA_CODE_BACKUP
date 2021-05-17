package com.slokam.core;

public class Pairs {
	public static void main(String[] args) {
		int a[] = { 5,6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.println("[" + a[i] + " , " + a[j] + "]");
				
				  if(a[i]-a[j]==1) { System.out.println("["+a[i]+", "+a[j]+"]");
				  
				  }
				 
			}
			System.out.println("*************");
		}
	}
}
