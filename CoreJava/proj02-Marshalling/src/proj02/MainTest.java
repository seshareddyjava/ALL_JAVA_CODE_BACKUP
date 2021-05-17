package proj02;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class MainTest {

	public static void main(String[] args) {
ArrayList<Person> personList = new ArrayList<>();
		
		Address add1 = new Address();
		add1.setArea("area1");
		add1.setCountry("C1");
		add1.setDist("dis");
		add1.setDoorNum("doorno1");
		add1.setPincode(234423);
		add1.setState("State1");
		
		Person p1 = new Person();
		p1.setId(2);
		p1.setAge(43);
		p1.setInitial('k');
		p1.setName("person1");
		p1.setAdd(add1);
		personList.add(p1);

		Address add2 = new Address();
		add2.setArea("area2");
		add2.setCountry("Country2");
		add2.setDoorNum("1/33/asd");
		add2.setPincode(345354353);
		add2.setState("state2");
		add2.setDist("dis2");
		
		Person person2 = new Person();
		person2.setId(2);
		person2.setAge(23);
		person2.setInitial('D');
		person2.setName("Name2");
		person2.setAdd(add2);
		
		personList.add(person2);
		
		Persons persons = new Persons();
		persons.setPersons(personList);
		try {
			JAXBContext context = JAXBContext.newInstance(Persons.class);
			Marshaller mar = context.createMarshaller();
			mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			mar.marshal(persons, new File("E:\\persons.xml"));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("DONE");

	}

}
