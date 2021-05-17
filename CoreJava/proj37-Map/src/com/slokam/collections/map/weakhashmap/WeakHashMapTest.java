package com.slokam.collections.map.weakhashmap;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

	public static void main(String[] args) {

		Map<Student, Integer> m = new WeakHashMap<Student, Integer>();

		Student std1 = new Student(1, "abc", "btech", 30);
		Student std2 = new Student(1, "bcd", "dtech", 20);
		Student std3 = new Student(1, "cde", "ftech", 35);
		Student std4 = new Student(1, "def", "ctech", 25);
		Student std5 = new Student(1, "efg", "ntech", 19);
		Student std6 = new Student(1, "fgh", "mtech", 22);

		m.put(std1, 1);
		m.put(std2, 2);
		m.put(std3, 3);
		m.put(std4, 4);
		m.put(std5, 5);
		m.put(std6, 6);
		System.out.println("Before assigning null to objects  " + m.size());
		std5 = null;
		std6 = null;

		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		Runtime.getRuntime().gc();
		
		System.out.println("Before assigning null to objects  " + m.size());
		System.out.println(m);
	}

}
