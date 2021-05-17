import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class FileDao {

	public ArrayList<StudentPojo> getDetails() {
		ArrayList<StudentPojo> list = new ArrayList<StudentPojo>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if(line.length()>0) {
				String[] vals = line.split(",");
				if(Integer.parseInt(vals[2])>=35) {
				StudentPojo std = new StudentPojo();
				std.setId(Integer.parseInt(vals[0]));
				std.setName(vals[1]);
				std.setMarks(Integer.parseInt(vals[2]));
				list.add(std);
				}
				}
			}

		} catch (Exception e) {

			e.printStackTrace();
		}

		return list;
	}

}
