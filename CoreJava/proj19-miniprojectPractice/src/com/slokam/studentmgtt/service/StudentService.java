package com.slokam.studentmgtt.service;

import java.util.ArrayList;

import com.slokam.studentmgtt.Dao.DBDao;
import com.slokam.studentmgtt.Dao.FileDao;
import com.slokam.studentmgtt.Dao.XmlDao;
import com.slokam.studentmgtt.Exception.ApplicationException;
import com.slokam.studentmgtt.pojo.Student;

public class StudentService {
	
	public void processData(String qual,int startMarks,int endMarks) throws ApplicationException {
		try {
		ArrayList<Student> lst = new ArrayList<Student>();
		FileDao fdao = new FileDao();
		ArrayList<Student> fList= fdao.getStudent(qual,startMarks, endMarks);
		XmlDao xdao = new XmlDao();
	ArrayList<Student> xlist=	xdao.getStudent(qual,startMarks, endMarks);
	for(int i=0;i<fList.size();i++) {
	Student std=setGrade(fList.get(i));
	lst.add(std);
	}
	for(int i=0;i<xlist.size();i++) {
		Student std = setGrade(xlist.get(i));
		lst.add(std);
	}
	DBDao dbdao = new DBDao();
	
	dbdao.saveStudent(lst);
	}
	catch(ApplicationException e) {
		e.printStackTrace();
		throw e;
	}
	}
	public Student setGrade(Student std){
		if (std.getMarks()<35) std.setGrade("fail");
		else if (std.getMarks()>35&&std.getMarks()<60) {
			std.setGrade("pass");
		}else {
			std.setGrade("Distinction");
		}
		
		return std;
	}

}
