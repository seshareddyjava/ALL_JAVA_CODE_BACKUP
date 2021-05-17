import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSorting {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		
		Employee e1 = new Employee(1,"aaaa",25);
		Employee e2 = new  Employee(2,"BBB",35);
		Employee e3 = new  Employee(3,"CCC",30);
		Employee e4 = new  Employee(4,"DDD",28);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
			}

}
