
public class Student implements AutoCloseable{
	
	public Student() throws Exception {
		System.out.println("Student.Student() constructor");
		//throw new Exception();
	}

	@Override
	public void close() throws Exception {
		System.out.println("Student.close()");
		//throw new Exception();
	}
	
	

}
