import javax.xml.bind.annotation.XmlElement;

public class Car {
	
	private String name;
	private String model;
	private int milage;
	//@XmlElement
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//@XmlElement
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	//@XmlElement
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	

}
