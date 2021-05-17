import lombok.Data;

@Data
public class Employee {

	private Integer id;
	private String name;
	private String qual;

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", qual=" + qual + "]";
	}

	
}
