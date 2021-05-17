package com.slokam.core;

public class StudentPojo implements Cloneable {
	
	private Integer id;
	private String name;
	private String qual;	
	
	public StudentPojo(Integer id, String name, String qual) {
		this.id = id;
		this.name = name;
		this.qual = qual;
	}
	
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getQual() {
		return qual;
	}

	public StudentPojo setId(Integer id) {
		return new StudentPojo(id,this.name,this.qual);
	}
	public StudentPojo setName(String name) {
		return new StudentPojo(this.id,name,this.qual);
	}
	public StudentPojo setQual(String qual) {
		return new StudentPojo(this.id,this.name,qual);
	}

	@Override
	public String toString() {
		return "StudentPojo [id=" + id + ", name=" + name + ", qual=" + qual + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qual == null) ? 0 : qual.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentPojo other = (StudentPojo) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qual == null) {
			if (other.qual != null)
				return false;
		} else if (!qual.equals(other.qual))
			return false;
		return true;
	}
	
	
}
