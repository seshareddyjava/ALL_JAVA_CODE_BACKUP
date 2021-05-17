package com.slokam.core.marshalling;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement
public class Student {
	private int id;
	private String name;
	private int age;
	private int marks;
	
	
	public int getId() {
		return id;
	}
	@XmlElement(name="sid")
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	@XmlElement(name="sname")
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@XmlElement(name="sage")

	public void setAge(int age) {
		this.age = age;
	}
	public int getMarks() {
		return marks;
	}

	@XmlElement(name="smarks")
	public void setMarks(int marks) {
		this.marks = marks;
	}
}
