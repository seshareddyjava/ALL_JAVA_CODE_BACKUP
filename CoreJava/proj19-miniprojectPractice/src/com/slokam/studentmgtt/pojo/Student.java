package com.slokam.studentmgtt.pojo;

public class Student {
	
	private int id;
	private String name;
	private int age;
	private String qual;
	private int marks;
	private String grade;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	/*public Student(int id, String name, int age, String qual, int marks, String grade) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qual = qual;
		this.marks = marks;
		this.grade = grade;
	}*/
	
	
	
}
