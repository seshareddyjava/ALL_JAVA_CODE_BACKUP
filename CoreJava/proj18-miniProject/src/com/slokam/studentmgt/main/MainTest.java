package com.slokam.studentmgt.main;

import java.util.Scanner;

import com.slokam.studentmgt.service.StudentService;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter qualification ");
		String qual=sc.nextLine();
		System.out.println("enter start marks ");
		 int startMarks =sc.nextInt();
		 System.out.println("enter end marks ");
		 int endMarks = sc.nextInt();
		 
		 StudentService service = new StudentService();
		 service.processData(startMarks, endMarks, qual);

	}

}
