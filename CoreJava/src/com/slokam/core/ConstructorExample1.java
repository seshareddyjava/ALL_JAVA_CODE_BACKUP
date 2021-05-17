package com.slokam.core;

class Student {
	String name;
	int m1, m2, m3, m4, m5;

	Student(String name, int m1, int m2, int m3, int m4, int m5) {
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.m4 = m4;
		this.m5 = m5;
	}

	int sum() {
		int total = m1 + m2 + m3 + m4 + m5;
		return total;
	}

	float avg() {
		float average = (m1 + m2 + m3 + m4 + m5) / 5;
		return average;
	}

	float per() {
		float total = (m1 + m2 + m3 + m4 + m5);

		float perc = (total / 375) * 100;

		return perc;
	}
}

public class ConstructorExample1 {

	public static void main(String[] args) {
		Student st = new Student("RAM", 50, 60, 70, 75, 65);
		System.out.println("total marks of student  -->" + st.sum());
		System.out.println("average marks of student --> " + st.avg());
		System.out.println("percentage of sudent --> " + st.per() + "%");

	}

}
