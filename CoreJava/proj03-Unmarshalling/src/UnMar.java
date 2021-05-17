import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMar {
	public static void main(String[] args) {
		try {
			JAXBContext context = JAXBContext.newInstance(Student.class);
			Unmarshaller un = context.createUnmarshaller();
			/*
			 * Object obj = un.unmarshal(new File("E:\\person.xml")); 
			 * Student std2 =(Student)obj; 
			 * std2.getAge();
			 */
			Student std = (Student) un.unmarshal(new File("E:\\person.xml"));
			System.out.println(std.getId());
			System.out.println(std.getName());
			System.out.println(std.getAge());
		} catch (JAXBException e) {

			e.printStackTrace();
		}

	}

}
