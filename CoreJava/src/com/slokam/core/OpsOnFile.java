package com.slokam.core;

import java.io.BufferedReader;
import java.io.FileReader;

public class OpsOnFile {

	// logic to count number of lines in a given file
	int countLines(String filePath) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
			String line = br.readLine();
			while (line != null) {
				count++;
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

	// logic to count number of characters repeated in given file
	int countChars(char ch, String filePath) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(filePath));
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

	// logic to count number of words in given file
	int countWords(String filePath) {
		int count = 0;
		try {
			FileReader fr = new FileReader(filePath);
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null) {
				count = count + line.split(" ").length;
				line = br.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}

}
