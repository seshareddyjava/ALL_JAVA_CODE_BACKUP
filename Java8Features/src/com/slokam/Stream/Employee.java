package com.slokam.Stream;

public class Employee {

	private int empId;
	private String empName;
	private String	gender;
	private String des;
	private Account accNum;
	private Mobile mobile;
	public int getEmpId() {
		return empId;
	}
	public String getEmpName() {
		return empName;
	}
	public String getGender() {
		return gender;
	}
	public String getDes() {
		return des;
	}
	public Account getAccNum() {
		return accNum;
	}
	public Mobile getMobile() {
		return mobile;
	}
	public Employee(int empId, String empName, String gender) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.gender = gender;
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", gender=" + gender + "]" ;
	}
	
	
	
	
}
