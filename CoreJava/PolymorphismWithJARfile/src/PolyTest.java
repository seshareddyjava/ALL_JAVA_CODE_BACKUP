import java.util.Scanner;

import message.Message;
import message.UtilClass;

public class PolyTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the user input  ");
		String st = sc.nextLine();
		UtilClass c = new UtilClass();
		Message m = c.getMessageObject(st);
		m.sendMessage();

	}

}
