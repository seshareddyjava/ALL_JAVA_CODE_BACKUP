import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbDao {
	
	public static void getUpdate(PersonPojo pojo) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joins_practice3","root","root");
			PreparedStatement ps= con.prepareStatement("update  joins_practice3.student s set s.age=? where s.age>=? and s.age<=?");
			System.out.println(pojo.getAge());
			System.out.println(pojo.getH());
			System.out.println(pojo.getL());
			ps.setInt(1, pojo.getAge());
			ps.setInt(2,pojo.getH());
			ps.setInt(3, pojo.getL());
			
			int i= ps.executeUpdate();
			
			System.out.println("no.of rows updated is "+i);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
