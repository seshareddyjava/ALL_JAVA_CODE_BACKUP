package com.slokam.core.marshalling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import java.lang.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.slokam.core.marshalling.apllicationexception.ApplicationException;

public class Test {

	public static void main(String[] args) throws Exception {
		List<Student> list = new ArrayList<Student>();
		Student std = new Student();
		std.setId(1);
		std.setName("SESHA REDDY");
		std.setAge(25);
		std.setMarks(80);
		list.add(std);
		Student std1 = new Student();
		std1.setId(2);
		std1.setName("ravi");
		std1.setAge(26);
		std1.setMarks(90);
		list.add(std1);
		Student std2 = new Student();
		std2.setId(3);
		std2.setName("siva");
		std2.setAge(24);
		std2.setMarks(70);
		list.add(std2);
		Students stds = new Students();

		// stds.getStudent().add(std1);
		// stds.getStudent().add(std);
		// stds.getStudent().add(std2);
		stds.setStudent(list);

		try {
			File f = new File("E:newStudent.xml");
			JAXBContext context = JAXBContext.newInstance(Students.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			//to print xml on console
			// marshaller.marshal(stds,System.out);
			marshaller.marshal(stds, f);

			System.out.println("done");
		} catch (JAXBException e) {
			//e.printStackTrace();
			throw new ApplicationException("invalid jaxb format");
		}
		
//		  catch (IOException e1) { 
//		  e1.printStackTrace(); 
//		  throw new  ApplicationException("invalid jaxb format"); }
//		 
	}

}
