package com.slokam.core;

public class OpsOnFileTest {

	public static void main(String[] args) {
	
				 OpsOnFile reader =new OpsOnFile(); 
				int c1 = reader.countWords("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");
				System.out.println("Word count in file is  ===> "+c1);
				int c2 = reader.countLines("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");
				System.out.println("Number of lines available in file ===> "+c2);
				int c3 = reader.countChars('o',"C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt");
				System.out.println("characters count is ======> "+c3);
				
			}
			

	}


