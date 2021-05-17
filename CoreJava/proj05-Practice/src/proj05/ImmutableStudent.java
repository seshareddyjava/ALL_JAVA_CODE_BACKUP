package proj05;

class Student {

	private  int id;
	private  String name;

	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Student modify(int i,String name) {
		if(this.id==i&&this.name.equals(name)) {
			return this;
		}else {
			return new Student(i,name);
		}
	}

}
public class ImmutableStudent{
	public static void main(String[] args) {
		
		Student std = new Student(1, "SESHA");
		System.out.println(std);
		
		Student std1 = std.modify(1, "SESHA");
		System.out.println(std1);
		Student std2 = std.modify(2, "SIVA");
		System.out.println(std2);
		
	}
	
}
