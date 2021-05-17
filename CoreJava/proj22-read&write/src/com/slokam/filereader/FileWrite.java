package com.slokam.filereader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public void writeFile( CarPojo car) {
		try {
			FileWriter fw = new FileWriter("D:\\newFile.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(new Integer(car.getId()).toString());
			bw.newLine();
			bw.write(car.getName());
			bw.newLine();
			bw.write(car.getModel());
			bw.newLine();
			bw.write(new Integer(car.getYear()).toString());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
