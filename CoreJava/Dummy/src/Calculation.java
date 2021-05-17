import java.util.Scanner;

public class Calculation {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter a year ");
	Integer a =sc.nextInt();
	
	if(a%4==0 ) {
		int days = 366;
		int minutes = days*24*60;
		long seconds = minutes*60l;
		
		System.out.println("No.of days  "+days);
		System.out.println("No.of minutes  "+minutes);
		System.out.println("No.of seconds  "+seconds);
	}else if(a%4!=0) {
		int days = 365;
		int minutes = days*24*60;
		long seconds = minutes*60l;
		
		System.out.println("No.of days  "+days);
		System.out.println("No.of minutes  "+minutes);
		System.out.println("No.of seconds  "+seconds);
	}
}

}
