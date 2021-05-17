import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Seri {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("E:\\practiceFiles\\newEmp.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			Employee e = new Employee();
			e.setId(1);
			e.setName("sesha");
			e.setQual("ndjkf");
			Class c=e.getClass();
			
			oos.writeObject(e);
			System.out.println("Done");
			oos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
