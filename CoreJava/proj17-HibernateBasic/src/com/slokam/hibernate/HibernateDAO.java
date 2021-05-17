package com.slokam.hibernate;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateDAO {
	
	public void insert() {
		
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session s= sf.openSession();
		org.hibernate.Transaction t = s.beginTransaction();
		Employee e = new Employee();
		e.setName("sesha");
		e.setAge(25);
		s.save(e);
		t.commit();
		s.close();
	}

}
