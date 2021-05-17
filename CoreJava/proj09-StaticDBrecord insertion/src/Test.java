
public class Test {

	public static void main(String[] args) {
		Student std = FileDao.getDetails();
		DBDao.saveStudent(std);

	}

}
