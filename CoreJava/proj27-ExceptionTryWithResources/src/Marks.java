
public class Marks implements AutoCloseable {
	
	public Marks() throws Exception{
		System.out.println("Marks.Marks() constructor");
		throw new Exception();
		
	}

	@Override
	public void close() throws Exception {
		System.out.println("Marks.close()");
		//throw new Exception();
		
	}
	

}
