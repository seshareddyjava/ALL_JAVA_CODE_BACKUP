package com.slokam.hibernate.relations.pojo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person {
	
	private int pid;
	private String pname;
	private int page;
	
	private Passport pt;
	
	@OneToOne(mappedBy = "per", cascade = CascadeType.ALL)
	public Passport getPt() {
		return pt;
	}
	public void setPt(Passport pt) {
		this.pt = pt;
	}
	
	/*List<Mobile> mob ;
	
	
	@OneToMany
	public List<Mobile> getMob() {
		return mob;
	}
	public void setMob(List<Mobile> mob) {
		this.mob = mob;
	}*/
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pid",nullable = false )
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
	

}
