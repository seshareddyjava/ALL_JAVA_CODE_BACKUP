import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class DBDao {
	
	public void saveRecord(ArrayList<StudentPojo> list) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			for(int i=0;i<list.size();i++) {
				StudentPojo p = list.get(i);
				PreparedStatement ps= con.prepareStatement("insert into janbatch.student values(?,?,?)");
				//System.out.println(p.getId());
				ps.setInt(1, p.getId());
				ps.setString(2, p.getName());
				ps.setInt(3, p.getMarks());
				ps.executeUpdate();
				
				System.out.println("records inserted");
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
