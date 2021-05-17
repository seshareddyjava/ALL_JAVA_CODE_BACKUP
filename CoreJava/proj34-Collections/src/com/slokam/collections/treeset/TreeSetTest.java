package com.slokam.collections.treeset;

import java.util.Comparator;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {
	public Comparator<Student> getObj() {
		System.out.println("1.ID \t 2.NAME \t 3.AGE \t 4.MARKS 5.QUAL ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Comparator<Student> obj = null;
		if (a == 1) {
			obj = new StudentIDcomparator();
		} else if (a == 2) {
			obj = new StudentNAMEcomparator();
		} else if (a == 3) {
			obj = new StudentAGEcomparator();
		} else if (a == 4) {
			obj = new StudentMARKScomparator();
		} else if (a == 5) {
			obj = new StudentQualcomparator();
		} else {
			obj = null;
		}
		return  obj;
	}

	public static void main(String[] args) {

		TreeSetTest t = new TreeSetTest();
		
		TreeSet<Student> ts = new TreeSet<Student>(t.getObj());
		
				
		DBDao dao = new DBDao();
		ts.addAll(dao.getRecords());
		System.out.println(ts);
		
		

	}

}
