import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Helper h = new Helper();
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter operation  ");
		String str = sc.nextLine();
		Calculator c = h.getCal(str);
		c.calc();

	}

}
