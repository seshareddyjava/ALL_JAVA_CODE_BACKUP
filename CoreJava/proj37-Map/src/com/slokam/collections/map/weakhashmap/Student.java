package com.slokam.collections.map.weakhashmap;

public class Student {
	
	private int id;
	private String name;
	private String qual;
	private int age;
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", qual=" + qual + ", age=" + age + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getQual() {
		return qual;
	}
	public int getAge() {
		return age;
	}
	public Student(int id, String name, String qual, int age) {
		super();
		this.id = id;
		this.name = name;
		this.qual = qual;
		this.age = age;
	}
	
	

}
