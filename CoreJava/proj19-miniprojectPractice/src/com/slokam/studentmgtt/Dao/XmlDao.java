package com.slokam.studentmgtt.Dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.slokam.studentmgtt.Exception.ApplicationException;
import com.slokam.studentmgtt.pojo.Student;
import com.slokam.studentmgtt.pojo.Students;

public class XmlDao {

	public ArrayList<Student> getStudent(String qual, int startMarks, int endMarks)
			throws ApplicationException {
		ArrayList<Student> filteredList = new ArrayList<Student>();
		try {

			JAXBContext context = JAXBContext.newInstance(Students.class);
			Unmarshaller un = context.createUnmarshaller();
			Students stds = (Students) un.unmarshal(new File("C:\\Users\\sesha\\Desktop\\SLOKAM\\Student.xml"));
			ArrayList<Student> list = stds.getStudents();
			for (int i = 0; i < list.size(); i++) {
				Student std = list.get(i);
				if (std.getMarks() > startMarks && std.getMarks() < endMarks && std.getQual().equals(qual)) {

					filteredList.add(std);
				}
			}

		}
		catch (JAXBException e) {
			e.printStackTrace();
			throw new ApplicationException("xml file not available");
		}
		// System.out.println(filteredList);
		return filteredList;
	}

}
