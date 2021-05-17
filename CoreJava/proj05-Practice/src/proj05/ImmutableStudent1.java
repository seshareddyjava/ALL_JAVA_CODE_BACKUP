package proj05;

final class Student1{
	
	private final  int id;
	private final String name;
	private final int age;
	
		public Student1(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public Student1 setId(int id) {
		return new Student1(id,this.name,this.age); 
	}
	public String getName() {
		return name;
	}
	public Student1 setName(String name) {
		return new Student1(this.id,name,this.age);
		}
	public int getAge() {
		return age;
	}
	public Student1 setAge(int age) {
		return new Student1(this.id,this.name,age);
	}

	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", age=" + age + "]";
	}	
	
}

public class ImmutableStudent1 {
	
	public static void main(String[] args) {
		Student1 std = new Student1(1, "sesha", 25);
		System.out.println(std);
		std.setName("siva");
		System.out.println(std);
		Student1 std1 = new Student1(2, "ash", 27);
		System.out.println(std1);
		Student1 std2 = new Student1(2, "ash", 27);
		System.out.println(std1==std2);
	}

}
