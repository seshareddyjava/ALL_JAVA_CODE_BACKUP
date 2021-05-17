package com.slokam.core.serializationdeserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SeriTest {

	public static void main(String[] args) {
		
		Employee emp = new Employee(1, "asdf", "btech");

		try {
			FileOutputStream fos = new FileOutputStream("C:\\Users\\sesha\\Desktop\\SLOKAM\\java files\\empserialization.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			System.out.println("writing");
			oos.writeObject(emp);
			System.out.println("closing resources");
			oos.close();
			fos.close();
			System.out.println("Object serialization Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
