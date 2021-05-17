package com.slokam.studentmgt.service;

import java.util.ArrayList;

import com.slokam.studentmgt.Dao.DBDao;
import com.slokam.studentmgt.Dao.FileDao;
import com.slokam.studentmgt.Dao.XmlDao;
import com.slokam.studentmgt.pojo.Student;

public class StudentService {
	
	public void processData(int startMarks,int endMarks,String qual) {
		ArrayList<Student> stdList = new ArrayList<Student>();
		ArrayList<Student> fileList= FileDao.getStudents(startMarks, endMarks, qual);
		ArrayList<Student> xmlList= XmlDao.getStudent(startMarks, endMarks, qual);
		for(int i=0;i<fileList.size();i++) {
			Student std=setGrade(fileList.get(i));
			stdList.add(std);
		}
		for(int i=0;i<xmlList.size();i++) {
			Student std = setGrade(xmlList.get(i));
			stdList.add(std);
		}
		DBDao.saveStudent(stdList);
		
	}
	public Student setGrade(Student std) {
		if(std.getMarks()<35) std.setGrade("fail");
		else if(std.getMarks()>35&&std.getMarks()<=60) std.setGrade("pass second class");
		else if(std.getMarks()>60&&std.getMarks()<80) std.setGrade("pass first class");
		else std.setGrade("Distinction");
		return std;
	}

}
