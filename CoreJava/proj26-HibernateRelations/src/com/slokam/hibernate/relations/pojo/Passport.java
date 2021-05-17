package com.slokam.hibernate.relations.pojo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Passport {
	
	private int ppid;
	private String ppnumber;
	private int ped;
	
	private Person per;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fkpid")
	public Person getPer() {
		return per;
	}
	public void setPer(Person per) {
		this.per = per;
	}
	
	@Id@GeneratedValue
	public int getPpid() {
		return ppid;
	}
	public void setPpid(int ppid) {
		this.ppid = ppid;
	}
	public String getPpnumber() {
		return ppnumber;
	}
	public void setPpnumber(String ppnumber) {
		this.ppnumber = ppnumber;
	}
	public int getPed() {
		return ped;
	}
	public void setPed(int ped) {
		this.ped = ped;
	}
	
	

}
