package employee;

import java.util.ArrayList;

public class EmployeeTest {

	public static void main(String[] args) {

		EmployeeDao dao = new EmployeeDao();
		ArrayList<Employee> list = dao.getEmployeesBySal(8000, "C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");

		for (int i = 0; i < list.size(); i++) {
			Employee e = list.get(i);
			System.out.println(e.eid);
			System.out.println(e.ename);
			System.out.println(e.edes);
			System.out.println(e.esal);
			System.out.println("==============");
		}
	}

}
