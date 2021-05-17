package com.slokam.studentmgt.Dao;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.slokam.studentmgt.pojo.Student;
import com.slokam.studentmgt.pojo.Students;

public class XmlDao {
	
	public static ArrayList<Student> getStudent(int startMarks,int endMarks,String qual){
		ArrayList<Student> filteredList = new ArrayList<Student>();
		try {
			System.out.println("XmlDao.getStudent()");
			JAXBContext context = JAXBContext.newInstance(Students.class);
			Unmarshaller un = context.createUnmarshaller();
			Students stds=(Students)un.unmarshal(new File("C:\\Users\\sesha\\Desktop\\SLOKAM\\Student.xml"));
			ArrayList<Student> stdList=stds.getStudent();
			for(int i=0;i<stdList.size();i++) {
				Student std=stdList.get(i);
				if(std.getMarks()>startMarks&&std.getMarks()<endMarks&&std.getQual().equals(qual)) {
					filteredList.add(std);
				}
			}
			System.out.println("XmlDao.getStudent()");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return filteredList;
	}

}
