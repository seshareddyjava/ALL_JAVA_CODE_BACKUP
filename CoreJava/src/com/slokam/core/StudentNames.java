package com.slokam.core;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class StudentNames {
		ArrayList<String> getStudentNames(String filepath){
		ArrayList<String> al = new ArrayList<String>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line;
			while((line=br.readLine())!=null) {
				line = line.trim();
				if(line.length()>0) {
					String[] str = line.split(",");
					al.add(str[1]);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
}
}
