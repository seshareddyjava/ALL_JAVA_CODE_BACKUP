package com.slokam.hibernate.relations.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.slokam.hibernate.relations.pojo.Passport;
import com.slokam.hibernate.relations.pojo.Person;

public class RelationsDao {
	
	public void insert() {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session= sf.openSession();
		Transaction t = session.beginTransaction();
		
		Person p = new Person();
		p.setPname("Sai");
		p.setPage(25);
		
		Passport pt = new Passport();
		pt.setPed(2030);
		pt.setPpnumber("AB123");
		
		pt.setPer(p);
		p.setPt(pt);
		session.save(pt);
		
		t.commit();
		session.close();
		sf.close();
		
	}

}
