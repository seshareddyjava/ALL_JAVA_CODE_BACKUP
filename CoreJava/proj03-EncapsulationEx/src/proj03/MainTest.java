package proj03;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter type of operation ");
		String str = sc.nextLine();
		System.out.println("please enter number ");
		int a=sc.nextInt();
		System.out.println("please enter 2 number ");
		int b = sc.nextInt();
		Calculator c= Helper.getObj(str);
		System.out.println("the result is "+c.cal(a, b));
	}

}
