package com.slokam.studentmgt.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.slokam.studentmgt.pojo.Student;

public class DBDao {
	public static void saveStudent(ArrayList<Student> students) {
		try {
			System.out.println("DBDao.saveStudent()");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/","root","root");
			PreparedStatement ps= con.prepareStatement("insert into studentmgtt.student (name,age,qual,marks,grade) values(?,?,?,?,?)");
			for(int i=0;i<students.size();i++) {
				Student std=students.get(i);
				ps.setString(1, std.getName());
				ps.setInt(2,std.getAge());
				ps.setString(3, std.getQual());
				ps.setInt(4, std.getMarks());
				ps.setString(5, std.getGrade());
				ps.addBatch();
			}
			ps.executeBatch();
			System.out.println("DBDao.saveStudent()");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
