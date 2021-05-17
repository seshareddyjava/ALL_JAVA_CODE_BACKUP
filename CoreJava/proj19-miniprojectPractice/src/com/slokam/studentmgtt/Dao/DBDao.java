package com.slokam.studentmgtt.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.slokam.studentmgtt.Exception.ApplicationException;
import com.slokam.studentmgtt.pojo.Student;

public class DBDao {
	public void saveStudent(ArrayList<Student> list)throws ApplicationException {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root","root");
			PreparedStatement ps= con.prepareStatement("insert into studentmgtt.student(name,age,qual,marks,grade) values(?,?,?,?,?)");
			for(int i=0;i<list.size();i++) {
				Student std= list.get(i);
				ps.setString(1, std.getName());
				ps.setInt(2, std.getAge());
				ps.setString(3, std.getQual());
				ps.setInt(4, std.getMarks());
				ps.setString(5, std.getGrade());
				ps.addBatch();
			}
			System.out.println(ps.executeBatch());
			
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new ApplicationException("please check drivers");
		}
		catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ApplicationException("check your queries");
			
		}
		
	}

}
