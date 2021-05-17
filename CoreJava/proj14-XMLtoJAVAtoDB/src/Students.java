import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Students {
	
	private ArrayList<Student> student;

	@XmlElement
	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Students [students=" + student + "]";
	}
	

}
