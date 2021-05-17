import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DBDao {
	
	public void saveData() {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf= cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx= s.beginTransaction();
		
		Person p = new Person();
		p.setName("Ram");
		p.setAge(25);
		//s.save(p);
		Mobile m= new Mobile();
		m.setMnumber(1234567890);
		m.setMsim("Idea");
		m.setPer(p);
		
		Mobile m1 = new Mobile();
		m1.setMnumber(23456789);
		m1.setMsim("Airtel");
		m1.setPer(p);
		ArrayList<Mobile> list = new ArrayList<Mobile>();
		list.add(m);
		list.add(m1);
		//s.save(list);
		p.setMobile(list);
		s.save(p);
		tx.commit();
		s.close();
		sf.close();
		
	}

}
