package com.slokam.core;

class SelSort{
	void sorting(int[] a) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int ln = a[min];
			a[min]=a[i];
			a[i]=ln;
		}
	}
}
public class SelectionSorting {
	   public static void main(String args[]){
		   int[] arr= {7,44,5,6,7,2,9,22,44,11,32,45,13,19};
		   SelSort s= new SelSort();
		   System.out.println("Array Before sorting");
		   for(int i=0;i<arr.length;i++) {
			  System.out.print(arr[i]+" "); 
		   }
		   System.out.println();
		   System.out.println("-------------------------------------");
		   s.sorting(arr);
		   System.out.println("Array After sorting");
		   for(int j=0;j<arr.length;j++) {
			   System.out.print(arr[j]+" ");
		   }
	   }  
	}
