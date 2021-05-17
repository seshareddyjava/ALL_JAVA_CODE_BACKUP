package com.slokam.studentmgtt.main;

import java.util.Scanner;

import com.slokam.studentmgtt.Exception.ApplicationException;
import com.slokam.studentmgtt.service.StudentService;

public class MainTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter qualification ");
		
	        String qual=  sc.nextLine();
	        System.out.println("enter Start marks ");
	        int startMarks= sc.nextInt();
	        System.out.println("enter end marks ");
	        int endMarks= sc.nextInt();
	        
	        StudentService service = new StudentService();
	        try {
				service.processData(qual,startMarks, endMarks);
			} catch (ApplicationException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}

}
