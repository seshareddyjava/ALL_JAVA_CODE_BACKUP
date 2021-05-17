package com.slokam.shopping.dao;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.slokam.shopping.exception.ApplicationException;
import com.slokam.shopping.pojo.Product;

public class HibernateDao {
	public static void saveRecords(ArrayList<Product> list) throws Exception {
		try {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session= sf.openSession();
		for(int i=0;i<list.size();i++) {
			Transaction tx = session.beginTransaction();
			Product p= list.get(i);
			session.save(p);
			tx.commit();
		}
		session.close();
		sf.close();
	}catch(Exception e) {
		e.printStackTrace();
		throw new ApplicationException("Exception raised in Hibernate Dao");
	}
	
	}

}
