package invite;
public class ObjectCreation {
public Guest getObject(String obj) {
		
		if(obj.equals("man")) {
			return new Man();
		} else if (obj.equals("fish")) {
			return new Fish();
		} else if(obj.equals("bird")){
			return new Bird();
		}else {
			System.out.println("Invalid input");
		}
		return null;
		
	}
}
