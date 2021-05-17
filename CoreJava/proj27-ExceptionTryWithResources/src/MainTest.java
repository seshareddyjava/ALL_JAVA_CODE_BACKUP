
public class MainTest {

	public static void main(String[] args) {

		try (Student std = new Student(); Marks m = new Marks();) {

			System.out.println("MainTest.main().TRY");

		} catch (Exception e) {

			System.out.println("MainTest.main().catch");
			e.printStackTrace();
			System.out.println(e.getSuppressed().length);
		} finally {
			System.out.println("MainTest.main().finally");
		}
	}

}
