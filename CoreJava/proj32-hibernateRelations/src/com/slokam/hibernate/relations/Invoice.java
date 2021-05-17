package com.slokam.hibernate.relations;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Invoice {
	
	private int vid;
	private int inumber;
	
	private Customer cus;
	@OneToOne(mappedBy = "inv",cascade = CascadeType.ALL)
	@JoinColumn(name = "fkcid")
public Customer getCus() {
		return cus;
	}

	public void setCus(Customer cus) {
		this.cus = cus;
	}

@Id@GeneratedValue
	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public int getInumber() {
		return inumber;
	}

	public void setInumber(int inumber) {
		this.inumber = inumber;
	}

	
	
	

}
