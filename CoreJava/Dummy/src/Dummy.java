import java.util.Scanner;
class Practice{
	void palindrome() {
		String original,reverse="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check palindrome  ");
		String str =sc.nextLine();
		for(int i=str.length()-1;i>=0;i--) {
			reverse = reverse+str.charAt(i);
		}
		if(str.equals(reverse)) {
			System.out.println("num is a palindrome");}
		else {
			System.out.println("num is not a palindrome");
		}
	}
}

public class Dummy {

	public static void main(String[] args) {
		Practice p = new Practice();
		p.palindrome();
		//logic to find given number Prime number or not
		/*int i, m = 0, flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter number to check  ");
		int n = sc.nextInt();
		m = n / 2;
		if (n == 0 | n == 1) {
			System.out.println(n + " is not a prime number");
		} else {
			for (i = 2; i <= m; i++) {
				if (n % i == 0) {
					System.out.println(n + " is not a prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(n + " is a prime number");
			}
		}*/

	}

}
