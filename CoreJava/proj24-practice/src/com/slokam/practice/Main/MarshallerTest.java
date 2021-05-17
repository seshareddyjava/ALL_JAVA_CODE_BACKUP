package com.slokam.practice.Main;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.slokam.practice.pojo.Product;

public class MarshallerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product();
		p.setPid(1);
		p.setPname("Jeans");
		p.setPrice(799);
		
		try {
			JAXBContext context = JAXBContext.newInstance(Product.class);
			Marshaller mar= context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			mar.marshal(p, new File("E:\\product.xml"));
			
		} catch (JAXBException e) {
			
			e.printStackTrace();
		}
		
	}

}
