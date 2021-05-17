package com.slokam.filewriter;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteData {

	public static void main(String[] args) {
		try  {
			/*FileWriter fr = new FileWriter("D:\\filewrite1.txt",true);
			fr.write("Hi hello how are");
			fr.append('A');//it will append the char at end of the line
			fr.flush();//data will be saved when we call flush() method
			//System.out.println(fr.getEncoding());
			*/
			FileWriter fw = new FileWriter("D:\\filewrite1.txt");
			//fw.write("How are you");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("how are you");
			bw.newLine();
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
