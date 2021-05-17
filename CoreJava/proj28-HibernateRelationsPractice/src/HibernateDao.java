import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateDao {
	
	public void saveData() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Person p = new Person();
		p.setPname("vamshi");
		p.setPage(2);
		
		Passport pt = new Passport();
		pt.setPerson(p);
		pt.setPped(2020);
		pt.setPpnum("ABC123");
		
		p.setPassport(pt);
		
		session.save(pt);
		tx.commit();
		session.close();
		sf.close();
	}
	
	public void delete() {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Passport p=(Passport)session.load(Passport.class, 1);
		session.delete(p);
		tx.commit();
		session.close();
		sf.close();
		
		
	}

}
