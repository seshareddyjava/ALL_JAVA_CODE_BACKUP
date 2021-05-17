package com.slokam.core;

public class CircularRotationArray {

	public static void main(String[] args) {
		int[] a = {5,7,3,9,2,0};
		int t=37;
		for(int i=0;i<a.length;i++) {
			System.out.println(i+" position will move to ==> \""+((i+t)%a.length)+"\" position after "+t+" times rotation");
		}

	}

}
