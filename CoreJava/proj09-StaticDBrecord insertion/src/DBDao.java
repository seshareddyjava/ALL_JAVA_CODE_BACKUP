import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBDao {
	private static String db_url="jdbc:mysql://localhost:3306/";
	private static String userName="root";
	private static String password ="root";
	static void saveStudent(Student std) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(db_url,userName,password);
			PreparedStatement ps= con.prepareStatement("insert into joins_practice3.student values(?,?,?,?)");
			ps.setInt(1,std.getId());
			ps.setString(2, std.getName());
			ps.setInt(3, std.getAge());
			ps.setString(4, std.getQual());
			int i=ps.executeUpdate();
			System.out.println("no.of rows inserted is  "+i);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
