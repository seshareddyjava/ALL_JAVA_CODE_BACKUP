package com.slokam.hibernate.Curd.Dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.slokam.hibernate.Curd.Conn.HibernateConnection;
import com.slokam.hibernate.Curd.Pojo.Student;

public class DBDao {
	public void saveRecord() {
		Session session= HibernateConnection.getSession();
		Transaction t= session.beginTransaction();
		Student std = new Student();
		std.setId(110);
		std.setName("Sai");
		std.setBranch("ME");
		std.setCode(300);
		
		session.save(std);
		t.commit();
		session.close();
	}

}
