package com.slokam.collections.treeset;

import java.util.ArrayList;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBDao {
	public ArrayList<Student> getRecords() {

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		String query = "from Student";
		Query q =s.createQuery(query);
		ArrayList<Student> list=(ArrayList<Student>) q.list();
		
		s.close();
		sf.close();
		
		return list;

	}
}
