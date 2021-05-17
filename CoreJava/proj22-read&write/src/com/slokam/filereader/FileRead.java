package com.slokam.filereader;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileRead {
	
	public CarPojo readData(String path) {
		CarPojo car = new CarPojo();
		try(
				BufferedReader br = new BufferedReader(new FileReader(path));
							
				) {
			String line;
			while((line=br.readLine())!=null) {
				line=line.trim();
				if(line.length()>0) {
					String [] vals = line.split(",");
					car.setId(Integer.parseInt(vals[0]));
					car.setName(vals[1]);
					car.setModel(vals[2]);
					car.setYear(Integer.parseInt(vals[3]));
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return car;
	}

}
