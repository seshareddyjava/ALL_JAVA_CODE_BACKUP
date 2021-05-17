package com.slokam.filereader;

public class ReadAndWriteTest {
	
	public static void main(String[] args) {
		FileRead fr = new FileRead();
		CarPojo car =fr.readData("C:\\Users\\sesha\\Desktop\\SLOKAM\\car.txt");
		FileWrite fw = new FileWrite();
		fw.writeFile(car);
		
	}

}
