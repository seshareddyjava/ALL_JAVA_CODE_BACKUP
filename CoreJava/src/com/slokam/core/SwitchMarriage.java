package com.slokam.core;

import java.util.Scanner;

public class SwitchMarriage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int i = sc.nextInt();

		switch (i) {
		case 25:
			System.out.println("Don't waste your life,Wait Two years");
			break;
		case 30:
			System.out.println("you have wasted your life,Don't wait anymore");
			break;
		case 35:
			System.out.println("It's already late");
			break;
		case 40:
			System.out.println("Stop talking about marriage");
			break;
		default:
			System.out.println("Enter a option matches 25/30/35/40");
		}

	}

}
