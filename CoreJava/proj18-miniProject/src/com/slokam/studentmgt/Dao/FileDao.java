package com.slokam.studentmgt.Dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.slokam.studentmgt.pojo.Student;

public class FileDao {

	public static ArrayList<Student> getStudents(int startMarks, int endMarks, String qual) {
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			System.out.println("FileDao.getStudents()");
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					String [] vals= line.split(",");
					if (Integer.parseInt(vals[4]) > startMarks && Integer.parseInt(vals[4]) < endMarks
							&& vals[3].equals(qual)) {
						Student std = new Student();
						std.setId(Integer.parseInt(vals[0]));
						std.setName(vals[1]);
						std.setAge(Integer.parseInt(vals[2]));
						std.setQual(vals[3]);
						std.setMarks(Integer.parseInt(vals[4]));
						list.add(std);
					}
				}
			}
			System.out.println("FileDao.getStudents()");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
