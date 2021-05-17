package proj04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test {
	public static void main(String[] args) {
		PersonPojo pojo = new PersonPojo();
		pojo.setPid(15);
		pojo.setName("Aneel");
		pojo.setAge(25);
		DaoJdbc dao= new DaoJdbc();
		dao.insert(pojo);
	}
	
	}
	


