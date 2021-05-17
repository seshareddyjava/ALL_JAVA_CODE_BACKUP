package com.slokam.core;

import java.util.ArrayList;

public class StudentNamesTest {

	public static void main(String[] args) {
		StudentNames sn = new StudentNames();
		ArrayList<String> l=sn.getStudentNames("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");
		//System.out.println(l);
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
	}

}
