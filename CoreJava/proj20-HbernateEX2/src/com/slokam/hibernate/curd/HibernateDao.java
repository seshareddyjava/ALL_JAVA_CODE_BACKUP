package com.slokam.hibernate.curd;



import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDao {
	
	public void insert() {
		try {
			Configuration config = new Configuration();
			config.configure();
			SessionFactory sf= config.buildSessionFactory();
			Session s= sf.openSession();
			Transaction t= s.beginTransaction();
			StudentPojo std = new  StudentPojo();
			std.setId(9);
			std.setAge(25);
			std.setName("rajesh");
			StudentPojo std1 = new  StudentPojo();
			std1.setId(8);
			std1.setAge(25);
			std1.setName("Suresh");
			s.save(std1);
			s.save(std);
			t.commit();
			s.close();
		sf.close();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		
		try {
			Configuration cfg = new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory sf= cfg.buildSessionFactory();
			Session sess=sf.openSession();
			Transaction t= sess.beginTransaction();
			StudentPojo stds= (StudentPojo) sess.get(StudentPojo.class,1);
			//StudentPojo std = new StudentPojo();
			stds.setAge(20);
			stds.setName("Venky");
			sess.update(stds);
			t.commit();
			sess.close();
			sf.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void delete() {
		try {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf= cfg.buildSessionFactory();
			Session sess=	sf.openSession();
			Transaction t= sess.beginTransaction();
			StudentPojo std=(StudentPojo) sess.load(StudentPojo.class,2);
			sess.delete(std);
			t.commit();
			sess.close();
			sf.close();
			
		} catch (Exception e) {
			
		}
	}

	public void getAll() {
		try {
			
			Configuration cfg = new Configuration();
			cfg.configure();
			SessionFactory sf = cfg.buildSessionFactory();
			Session session = sf.openSession();
			Transaction t= session.beginTransaction();
			
			String hqlQuery ="from StudentPojo";
			Query q= session.createQuery(hqlQuery);
			List<StudentPojo> list= q.list();
			Iterator<StudentPojo> itr = list.iterator();
			System.out.print("ID \t Name \t Age");
			System.out.println();
		while (itr.hasNext()) {
			StudentPojo std= itr.next();
			System.out.print(std.getId()+" \t "+std.getName()+" \t "+std.getAge()+"\n");
			
		}
		t.commit();
		session.close();
		sf.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
