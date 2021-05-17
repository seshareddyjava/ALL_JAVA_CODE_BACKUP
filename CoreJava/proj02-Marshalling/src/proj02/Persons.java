package proj02;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Persons {
private ArrayList<Person> persons;
@XmlElement(name="person")
public ArrayList<Person> getPersons() {
	return persons;
}

public void setPersons(ArrayList<Person> persons) {
	this.persons = persons;
}


}
