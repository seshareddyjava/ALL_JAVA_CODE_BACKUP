package com.srinivasmedicals.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SrinivasaMedicals {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","manager");
		Statement st= con.createStatement();
		ResultSet rs = st.executeQuery("select * from srinivasa_medicals");
		while (rs.next()) {
			System.out.println("NAME\tQUANTITY\tDATE");
			System.out.print(rs.getString(1)+"\t");
			System.out.print(rs.getInt(2)+"\t");
			System.out.print("     "+rs.getDate(3));
			
		}

	}

}
