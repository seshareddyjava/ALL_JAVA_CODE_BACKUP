package com.slokam.practice;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {

		/*
		 * byte b =10; switch(b) { case 0:System.out.println("zero value");break; case
		 * 1:System.out.println("case 1");break;
		 * default:System.out.println("default value"); break; }
		 */

		/*
		 * short s = 234; switch(s) { case 235:System.out.println("234");break; case
		 * 236:System.out.println("236");break; case
		 * 234:System.out.println("234");break; default:System.out.println("123");break;
		 * }
		 */
		/*int i = 10;
		switch (i) {
		case 0:
			System.out.println("sesha");
			break;
		case 1:
			System.out.println("reddy");
			break;
		case 2:
			System.out.println("btech");
			break;
		case 3:
			System.out.println("eee");
			break;
		default:
			System.out.println("Software engineer");
			break;
		}*/
		
		/*
		 * char ch ='a'; switch(ch) { case 'a':System.out.println("case 1");break; case
		 * 'b':System.out.println("case 2");break; case
		 * 'c':System.out.println("case 3");break;
		 * default:System.out.println("default case");break; }
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("enter name of user ");
		 * String s =sc.nextLine();
		 * 
		 * 
		 * switch(s) { case "sesha":System.out.println("my name");break;
		 * case"reddy":System.out.println("ending name");break; case
		 * "belum":System.out.println("surname ");break;
		 * default:System.out.println("invalid name");break; } sc.close();
		 */
		Integer i = new Integer(10);
		switch(i) {
		case 1:System.out.println("one");break;
		case 10:System.out.println("ten");break;
		default:System.out.println("default");break;
		}
	}

}
