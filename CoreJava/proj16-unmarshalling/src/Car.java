import javax.xml.bind.annotation.XmlElement;

public class Car {
	private String name;
	private String model;
	private int milage;
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	@XmlElement
	public void setModel(String model) {
		this.model = model;
	}
	public int getMilage() {
		return milage;
	}
	@XmlElement
	public void setMilage(int milage) {
		this.milage = milage;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{"+name+","+model+","+milage+"}";
	}
	

}
