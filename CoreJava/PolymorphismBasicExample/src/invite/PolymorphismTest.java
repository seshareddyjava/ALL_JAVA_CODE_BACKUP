package invite;

import java.util.Scanner;

public class PolymorphismTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input   ");
		String str =sc.nextLine();
		
		ObjectCreation oc = new ObjectCreation();
		Guest g =oc.getObject(str);
		if(g!=null)
		g.comein();
		else System.out.println("give valid input");
	}

}
