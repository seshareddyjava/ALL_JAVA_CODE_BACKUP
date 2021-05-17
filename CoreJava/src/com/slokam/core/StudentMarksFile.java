package com.slokam.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentMarksFile {
	ArrayList<String> al = new ArrayList<String>();
	ArrayList<String> getStudentName(String filepath){
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line;
			while((line=br.readLine())!=null) {
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
