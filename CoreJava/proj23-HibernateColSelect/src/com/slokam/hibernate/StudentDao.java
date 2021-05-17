package com.slokam.hibernate;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDao {

	public void getData() {
		try {
			Configuration config = new Configuration();
			config.configure();
			SessionFactory sf = config.buildSessionFactory();
			Session sess = sf.openSession();
			org.hibernate.Transaction t = sess.beginTransaction();
			String hqlq = "select s.name,s.age,s.id from StudentPojo s ";
			Query q = sess.createQuery(hqlq);
			q.setFirstResult(2);
			q.setMaxResults(5);

			List<Object[]> std = q.list();
			int count = 0;

			for (Object k[] : std) {
				/* count++;if(count==6)break; */
				System.out.print(k[0] + " ");
				System.out.print(k[1] + " ");
				System.out.print(k[2] + " \n");
			}
			t.commit();
			sess.close();
			sf.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
