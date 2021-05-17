import java.io.BufferedReader;
import java.io.FileReader;

public class FileDao {
	public static Student getDetails() {
		Student std = new Student();
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				String[] vals = line.split(",");

				std.setId(Integer.parseInt(vals[0]));
				std.setName(vals[1]);
				std.setAge(Integer.parseInt(vals[2]));
				std.setQual(vals[3]);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return std;
	}

}
