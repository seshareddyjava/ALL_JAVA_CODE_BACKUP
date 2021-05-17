import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		FileDao f = new FileDao();
		ArrayList<StudentPojo> list= f.getDetails();
		DBDao d = new DBDao();
		d.saveRecord(list);

	}

}
