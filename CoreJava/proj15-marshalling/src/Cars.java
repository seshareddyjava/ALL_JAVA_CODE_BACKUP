import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Cars {
	
	ArrayList<Car> car;
	//@XmlElementWrapper
	@XmlElement
	public ArrayList<Car> getCar() {
		return car;
	}

	public void setCar(ArrayList<Car> car) {
		this.car = car;
	}
	
	

}
