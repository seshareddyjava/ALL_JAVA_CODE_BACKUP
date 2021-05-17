
public class Test {

	public static void main(String[] args) {
		PersonPojo p= PersonDao.getDetails();
		DbDao.getUpdate(p);
		
	}

}
