package com.slokam.Stream;

import java.util.Arrays;
import java.util.List;

public class EmpUtility {

	public static List<Employee> getData() {

		List<Employee> list = Arrays.asList(new Employee(1, "Naga", "Male"), new Employee(2, "yash", "Male"),
				new Employee(3, "ravi", "Male"), new Employee(4, "chadra", "Male"), new Employee(5, "sai", "Male"),
				new Employee(6, "ravali", "Female"),new Employee(7, "chandana", "Female"),new Employee(8, "saileka", "Female"));
		/*Employee e1 = new Employee(1, "Naga", "Male");
		Employee e2 = new Employee(2, "yash", "Male");
		Employee e3 = new Employee(3, "ravi", "Male");
		Employee e4 = new Employee(4, "chadra", "Male");
		Employee e5 = new Employee(5, "sai", "Male");
		Employee e6 = new Employee(6, "ravali", "Female");
		Employee e7 = new Employee(7, "chandana", "Female");
		Employee e8 = new Employee(8, "saileka", "Female");*/

		// list.add(e1); list.add(e2); list.add(e3); list.add(e4); list.add(e5);
		return list;
	}

}
