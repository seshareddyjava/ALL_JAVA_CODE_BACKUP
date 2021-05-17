package proj05;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number ");
	int num=sc.nextInt();
	System.out.println("enter power ");
	int power=sc.nextInt();
	int res=1;
	for(;power!=0;power--) {
		res = res*num;
		
	}
	System.out.println(res);
	
	System.out.println(Math.pow(num,power));

	}
	

}
