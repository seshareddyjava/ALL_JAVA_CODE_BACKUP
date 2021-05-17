package com.slokam.DataStructure;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Products {
	private Product prod;

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}
	

}
