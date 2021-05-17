package com.slokam.studentmgtt.Dao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import com.slokam.studentmgtt.Exception.ApplicationException;
import com.slokam.studentmgtt.pojo.Student;

public class FileDao {
	
	public ArrayList<Student> getStudent(String qual,int startMarks,int endMarks)
	throws ApplicationException{
		ArrayList<Student> list = new ArrayList<Student>();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sesha\\Desktop\\SLOKAM\\dummy.txt"));
			String line;
			while((line=br.readLine())!=null) {
				line.trim();
				if(line.length()>0) {
					String [] vals = line.split(",");
					if(Integer.parseInt(vals[4])>startMarks&&Integer.parseInt(vals[4])<endMarks&&vals[3].equals(qual)){
						Student std = new Student();
						std.setAge(Integer.parseInt(vals[2]));
						std.setId(Integer.parseInt(vals[0]));
						std.setName(vals[1]);
						std.setMarks(Integer.parseInt(vals[4]));
						std.setQual(vals[3]);
						list.add(std);
					}
				}
			}
			
		} catch (FileNotFoundException e) {
			//e.printStackTrace();
			throw new ApplicationException("FIle not available at specified location");
		}catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ApplicationException("check file securities");
		}
		return list;
	}

}
