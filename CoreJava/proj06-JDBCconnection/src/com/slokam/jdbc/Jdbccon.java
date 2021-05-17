package com.slokam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.slokam.jdbc.exception.ApplicationException;

public class Jdbccon {

	public static void main(String[] args) throws Exception {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/joins_practice3","root","root");
			Statement st=con.createStatement();
			ResultSet rs= st.executeQuery("");
			System.out.println("hi");
			
			
		}catch(ClassNotFoundException e) {
			throw new ApplicationException("check driver url");
		}/*catch(Exception e) {
			e.printStackTrace();
		}*/
		catch(SQLException e ) {
			throw new ApplicationException("check your query");
		}
		finally {
			
		}
	}

}
