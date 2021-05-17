import java.util.HashSet;

class Student{
	
	private int id;
	private String name;
	private int age;
	@Override
	public int hashCode() {
		System.out.println("Student.hashCode()");
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("Student.equals()");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
}

class Person{
	private int id;
	private String name;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class TEts {
	
	public static void main(String[] args) {
		Student std = new Student(2,"chandra",25);
		Student std2 = new Student(1,"Sesha",25);
		Student std3 = new Student(1,"Sesha",25);
		Student std4 = new Student(1,"Sesha",25);
		
		/*
		 * Ab a = new Ab(); Ab a1 = new Ab(); System.out.println(a.hashCode());
		 * System.out.println(a1.hashCode()); System.out.println(std2.hashCode());
		 * System.out.println(std.hashCode());
		 */
		
		HashSet hs = new HashSet();
		hs.add(std2);
		/*
		 * hs.add(std2); hs.add(std3);
		 */
		Person p = new Person();
		p.setId(1);
		p.setName("Sesha");
		p.setAge(25);
		hs.add(p);
		/*
		 * System.out.println(std2.hashCode()+"  "+std3.hashCode());
		 * System.out.println(hs.size()); System.out.println();
		 */
		
		System.out.println(std2.hashCode()+"  "+p.hashCode());
		
	}

}
