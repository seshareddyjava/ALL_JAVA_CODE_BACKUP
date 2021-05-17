package com.slokam.Stream;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		List<Employee> empList = EmpUtility.getData();
		//fetching data from list 
		//empList.forEach(p->System.out.println(p));
		//soring by emp name
		//empList.stream().sorted((e1,e2)->e1.getEmpName().compareToIgnoreCase(e2.getEmpName())).forEach(e->System.out.println(e));
		//sorting by gender
		//empList.stream().filter(p->p.getGender().equalsIgnoreCase("female")).collect(Collectors.toList()).forEach(maleList->System.out.println(maleList.getEmpName()));
			
		empList.stream().sorted(Comparator.comparingInt(Employee::getEmpId).reversed())
		.forEach(eidSort->System.out.println(eidSort.getEmpId()+" "+eidSort.getEmpName()));
	
	}
}
