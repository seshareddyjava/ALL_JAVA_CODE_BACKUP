package com.slokam.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	
	public void hibCurd() {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session= sf.openSession();
		Transaction t= session.beginTransaction();
		Product p = new Product();
		
		  p.setId(123); p.setName("Rice"); p.setPrice(1000); p.setCateg(1);
		 
		Product p1 = new Product();
		p1.setId(2);
		p1.setName("Dal");
		p1.setPrice(250);
		p1.setCateg(2);
		session.save(p);
		session.save(p1);
		t.commit();
		session.close();
		sf.close();
		
		
	}
	public void getRecords() {
		
		Configuration config = new Configuration();
		config.configure();
		SessionFactory sf = config.buildSessionFactory();
		Session session= sf.openSession();
		Transaction t= session.beginTransaction();
		String query ="from Product";
		Query q= session.createQuery(query);
		List<Product> prod = q.list();
		Iterator<Product> itr = prod.iterator();
		while(itr.hasNext()) {
			Product p=itr.next();
			System.out.print(p.getId()+" "+p.getName()+" "+p.getPrice()+" "+p.getCateg()+"\n");
		}
		
		session.close();
		sf.close();
		
	}
}
