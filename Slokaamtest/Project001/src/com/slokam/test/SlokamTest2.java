package com.slokam.test;

public class SlokamTest2 {

	public static void main(String[] args) {
		int t=7;
		int[] arr = {5,7,3,8,9,1,2};
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j]+" ");
		}
		System.out.println();
		int temp[] = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+" position is shifted to ==>  "+(arr.length+i-t)%arr.length);
			temp[(arr.length+i-t)%arr.length]=arr[i];
			
		}
		for(int j=0;j<temp.length;j++) {
			System.out.print(temp[j]+" ");
		}
		
	}

}
