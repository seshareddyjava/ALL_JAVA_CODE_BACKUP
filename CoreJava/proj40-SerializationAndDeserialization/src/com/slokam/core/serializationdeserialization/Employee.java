package com.slokam.core.serializationdeserialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private Integer id;
	private String name;
	private String qual;
	
	
	public Employee(Integer id, String name, String qual) {
		super();
		this.id = id;
		this.name = name;
		this.qual = qual;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", qual=" + qual + "]";
	}
	
	
	
	

}
