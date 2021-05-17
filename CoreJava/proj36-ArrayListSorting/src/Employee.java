
public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private Integer age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]\n";
	}
	public Employee(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Employee o) {
		int c= this.age.compareTo(o.getAge());
		if(c==0) {
			c= this.id.compareTo(o.getId());
			if(c==0) {
				c=this.name.compareTo(o.getName());
			}
		}
		return c;
		
	}
	
	
}
