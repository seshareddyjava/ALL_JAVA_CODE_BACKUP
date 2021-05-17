package com.slokam.java8;

public class NewFeatures {
	
	public static void main(String[] args) {
		
		
		
		FInterface fi = (a,b)->{
			int [] c = new int[b];
			if(a<b) {
			for(int i=a;i<b;i++) {
				c[i]=i;
			}
			
			}

			return c;
		};
		
		int[] d=fi.add(0, 10);
		for(int e :d)
		System.out.print(e+" ");
		
	}

}
