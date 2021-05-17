package com.slokam.core;

class ArrOps{
	int sum(int[] arr) {
		int t=0;
		for(int i=0;i<arr.length;i++) {
			t +=arr[i];
		}
		return t;
	}
	int maxNum(int[] arr) {
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}
	int minNum(int[] arr) {
		int min=0;
		int pos =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<=arr[pos]) {
				pos=i;
				min=arr[pos];
			}
				
		}
		return min;
	}
	int[] sort(int[] arr) {
		int[] temp= new int[arr.length];
		int min=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			
		}
		
		
		return temp;
	}
	
}

public class Example3 {

	public static void main(String[] args) {
		int [] arr = {0,1,4,9,6,2,8,3};
		ArrOps aop = new ArrOps();
		System.out.println("Sum of elements in array is  "+aop.sum(arr));
		System.out.println("Max number in array is  "+aop.maxNum(arr));
		System.out.println("min number in array is  "+aop.minNum(arr));
	}

}
