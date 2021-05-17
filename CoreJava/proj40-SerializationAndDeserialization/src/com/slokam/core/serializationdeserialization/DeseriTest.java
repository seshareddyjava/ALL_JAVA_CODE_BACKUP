package com.slokam.core.serializationdeserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeseriTest {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(
					"C:\\Users\\sesha\\Desktop\\SLOKAM\\java files\\empserialization.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Object obj = ois.readObject();
			Employee emp = (Employee) obj;
			System.out.println(emp);
			
			ois.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
