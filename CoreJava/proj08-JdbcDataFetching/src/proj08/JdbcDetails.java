package proj08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class JdbcDetails {
	
	public void getDetails() {
		try(
				Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/joins_practice3","root","root");
				PreparedStatement ps=con.prepareStatement( "select * from customer");
				ResultSet rs=ps.executeQuery();
				
				) {
			Class.forName("com.mysql.cj.jdbc.Driver");
						System.out.println(rs);
						System.out.println("execution started");
						while(rs.next()) {
							System.out.println(rs.getInt(1));
							System.out.println(rs.getString(2));
							//System.out.println(rs.getInt(3));
						}
							
					} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
