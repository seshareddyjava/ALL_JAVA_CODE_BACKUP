package com.slokam.core;

import java.io.BufferedReader;
import java.io.FileReader;

public class WordCountInFile {

	public static void main(String[] args) {
		int count =0;
		try {
		BufferedReader br = new BufferedReader(new FileReader("D:\\ ADV JAVA 7AM\\MATERIAL\\Reddy.txt"));
		String line = br.readLine();
		while(line!=null) {
			String [] str2 = line.split(" ");
			count += str2.length;
			line = br.readLine();
		}
		System.out.println(count);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

}
