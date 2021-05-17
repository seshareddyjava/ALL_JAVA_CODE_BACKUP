package com.slokam.DataStructure;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {
	public static void main(String[] args) {
		ArrayList<Product> list = new ArrayList<Product>();
		Category c = new Category();
		c.setCcode(123);
		c.setCname("Electronics");
		c.setType("imported");
		Product prod = new Product();
		prod.setCategory(c);
		prod.setColor("gold");
		prod.setPid(1);
		prod.setPname("mobile");
		Products prods = new Products();
		prods.setProd(prod);
		list.add(prod);
		try {
			JAXBContext context = JAXBContext.newInstance(Products.class);
			Marshaller marshaller= context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			//marshaller.marshal(prods, new File("E://marshal1.xml"));
			marshaller.marshal(prods, System.out);
			System.out.println("File created");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
	}
}
