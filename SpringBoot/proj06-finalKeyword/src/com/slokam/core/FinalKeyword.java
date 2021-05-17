

package com.slokam.core;

import java.util.concurrent.Callable;

public class FinalKeyword implements Callable<FinalKeyword> {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		StudentPojo std=new StudentPojo(1, "sesha","btech");
		StudentPojo std2 = new StudentPojo(2, "rai", "eee");
		System.out.println(std.clone()==std);
//		int a =10;
//		final StudentPojo std;
//		std=new StudentPojo(1, "sesha","btech");
//		//std = new StudentPojo(2, "rai", "eee");
//		String str = "subbareddy";
//		System.out.println("Before method calling");
//		System.out.println(a);
//		System.out.println(std);
//		System.out.println(str);
//		test(a,std,str);
//		System.out.println("After method calling");
//		System.out.println(a);
//		System.out.println(std);
//		System.out.println(str);
	}
	
	public static void test(int a,StudentPojo std ,String str) {
		a= a+20;
		StudentPojo std1 = std.setId(2);
		StudentPojo std2= std.setName("ravi");
		StudentPojo std3=std.setQual("eee");
		System.out.println(std==std1);
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
		str = str+"AADilakshmi";
	}

	@Override
	public FinalKeyword call() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
