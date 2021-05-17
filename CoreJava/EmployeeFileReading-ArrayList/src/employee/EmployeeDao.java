package employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class EmployeeDao {
	ArrayList<Employee> getEmployeesBySal(double sal, String filepath) {
		ArrayList<Employee> list = new ArrayList<Employee>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					String[] val = line.split(",");
					if ((Double.parseDouble(val[3])) > sal) {
						Employee emp = new Employee();
						emp.eid = Integer.parseInt(val[0]);
						emp.ename = val[1];
						emp.edes = val[2];
						emp.esal = Double.parseDouble(val[3]);
						list.add(emp);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

}
