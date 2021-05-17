
public class Helper {

	public Calculator getCal(String str) {
		if (str.equalsIgnoreCase("add")) {
			return new Add();
		} else if (str.equalsIgnoreCase("sub")) {
			return new Sub();
		} else if (str.equalsIgnoreCase("mul")) {
			return new Mul();
		} else if (str.equalsIgnoreCase("div")) {
			return new Div();
		} else {
			return null;
		}

	}

}
