package com.slokam.practice;

public class ArraySorting {

	public static void main(String[] args) {
		int[] a = {20,60,10,30,70,40,90,50};
		for(int i=0;i<a.length;i++) {
			int pos=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[pos]) {
					pos=j;
				}
			}
			int temp = a[pos];
			a[pos]=a[i];
			a[i]=temp;
		}
		for(int k:a) {
			System.out.print(k+" ");
		}
		
	}}