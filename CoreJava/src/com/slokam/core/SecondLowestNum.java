package com.slokam.core;

public class SecondLowestNum {

	public static void main(String[] args) {
		int[] a = {4,7,6,3,1,9,66,33,0,22,44};
		for(int i=0;i<a.length;i++) {
			//int min =i;
			int max =i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[max]) {
					max=j;
				}
			}
			int temp = a[max];
			a[max]=a[i];
			a[i]=temp;
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		//System.out.println(a[1]);

	}

}
