package com.slokam.practice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class Fr {
	
	public void readFile() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\sesha\\Desktop\\SLOKAM\\car.txt"));
			String line;
			try {
				System.out.println("ID \t|| NAME \t|| MODEL \t|| YEAR");
				System.out.println("============================================");
				while ((line = br.readLine()) != null) {
					line.trim();
					if(line.length()>0) {
						String[] val=line.split(",");
						System.out.print(val[0]+" \t|| "+val[1]+" \t|| "+val[2]+" \t|| "+val[3]+"\n");
						System.out.println("==============================================");
			
					}

				}
				System.out.println("**********end of records*********");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} finally {

			try {
				if (br != null)
					br.close();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

	}
}

public class FileRead {

	public static void main(String[] args) {
		Fr f = new Fr();
		f.readFile();

	}

}
