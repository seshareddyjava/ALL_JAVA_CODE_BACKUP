
public class Student {
	
	private Integer id;
	private String name;
	private String qual;
	private int sal;
	
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
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Studnet [id=" + id + ", name=" + name + ", qual=" + qual + ", sal=" + sal + "]";
	}
	public Student(Integer id, String name, String qual, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.qual = qual;
		this.sal = sal;
	}
	
	

}
