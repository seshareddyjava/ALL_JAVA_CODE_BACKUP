package com.slokam.core;

public class Test3 {

	public static void main(String[] args) {
		OurRectangle r1 = new OurRectangle();
//		r1.length=20;
//		r1.width=30;
		OurRectangle r2=new OurRectangle();
//		r2.length=40;
//		r2.width=60;
		System.out.println("r1 area is : "+r1.area());
		System.out.println("r2 area is : "+r2.area());
		System.out.println("r1 perm is : "+r1.per());
		System.out.println("r2 perm is : "+r2.per());
	}

}
