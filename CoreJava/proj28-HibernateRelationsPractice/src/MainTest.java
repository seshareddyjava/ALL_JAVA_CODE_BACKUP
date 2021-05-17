
public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			  HibernateDao dao = new HibernateDao();// dao.saveData();
			 
			/*
			 * HibernateDao dao = new HibernateDao(); 
			 */
			  dao.delete();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getSuppressed().length);
		}

	}

}
