package com.slokam.practice;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int j=sc.nextInt();
		int i=(j<20)?10:20;
		System.out.println(i);
		sc.close();
	}

}
