package com.slokam.shopping.dao;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.slokam.shopping.exception.ApplicationException;
import com.slokam.shopping.pojo.Product;
import com.slokam.shopping.pojo.Products;

public class XmlDao {

	public ArrayList<Product> getProduct(String ctgry, int stPrice, int endPrice) throws Exception {

		ArrayList<Product> xl = new ArrayList<Product>();
		try {
			JAXBContext context = JAXBContext.newInstance(Products.class);

			Unmarshaller un = context.createUnmarshaller();
			Products prods = (Products) un.unmarshal(new File("C:\\Users\\sesha\\Desktop\\SLOKAM\\shopping.xml"));
			ArrayList<Product> list = prods.getProd();
			//System.out.println(list);
			//System.out.println(list.size());
			for (int i = 0; i < list.size(); i++) {
				Product p = list.get(i);
				String str = p.getCategory();
				if ((str.equals(ctgry))  && (p.getPrice() > stPrice) && (p.getPrice() < endPrice) ) {
					xl.add(p);
				}
			}
		} catch (JAXBException e) {

			e.printStackTrace();
			throw new ApplicationException("Exception raised in Xml");
		}

		return xl;
	}

}
