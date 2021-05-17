package com.slokam.core;

public class SelectionSort {

	
	public static void main(String args[]){
		int a[] = {10, 20, 25, 63, 96, 57};
		      

		for (int i = 0 ;i< a.length-1; i++){
		         int s = i;

		         for (int j = i+1; j<a.length; j++){
		            if (a[j] < a[s]){
		            s = j;
		            }
		         }
		         int temp = a[s];
		         a[s] = a[i];
		         a[i] = temp;
		      }

		      for (int i = 0 ;i< a.length; i++){
		         System.out.print(" "+a[i]);
		      }
		   }  
		}
