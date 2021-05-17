package com.slokam.hibernate.relations;

import java.util.List;

public class ProductInfo {
	
	private int prdid;
	private String name;
	private int price;
	
	private List<Invoice> inv;

	public int getPrdid() {
		return prdid;
	}

	public void setPrdid(int prdid) {
		this.prdid = prdid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Invoice> getInv() {
		return inv;
	}

	public void setInv(List<Invoice> inv) {
		this.inv = inv;
	}
	
	

}
