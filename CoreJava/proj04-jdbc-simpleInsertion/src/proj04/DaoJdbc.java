package proj04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DaoJdbc {
	
	public void insert(PersonPojo p) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joins_practice2","root","root");
			PreparedStatement ps= con.prepareStatement("insert into joins_practice2.person values(?,?,?)");
			ps.setInt(1, p.getPid());
			ps.setString(2, p.getName());
			ps.setInt(3, p.getAge());
			int i =ps.executeUpdate();
			System.out.println("no.of rows inserted "+i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
		}
	public void update(PersonPojo p) {
	
		
		
	}
	
	}


