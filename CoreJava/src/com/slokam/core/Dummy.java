package com.slokam.core;

import java.io.BufferedReader;
import java.io.FileReader;

public class Dummy {
	int countLines(String filepath) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String str = br.readLine();
			Integer i = new Integer(3);
			
			while (str != null) {
				count++;
				str = br.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	int countWords(String filepath) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			String line = br.readLine();
			while (line != null) {
				count += line.split(" ").length;
				line = br.readLine();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	int countChars(char ch, String filepath) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			int a = br.read();
			while (a != -1) {
				if ((char) a == ch) {
					count++;
				}
				a = br.read();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	int countSmallChars(String filepath) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filepath));
			int a = br.read();
			while(a!=-1) {
				char c =(char)a;
			if (c>= 'A' & c <= 'Z') {
				count++;
			}
			a=br.read();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
