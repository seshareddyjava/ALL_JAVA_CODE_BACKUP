package com.slokam.shopping.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.slokam.shopping.exception.ApplicationException;
import com.slokam.shopping.pojo.Product;

public class FileDao {

	public ArrayList<Product> getFileData(String ctgry, int stPrice, int endPrice) throws Exception {
		ArrayList<Product> fl = new ArrayList<Product>();
		try(			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\sesha\\Desktop\\SLOKAM\\shopping.txt"));
) {
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					String[] vals = line.split(",");
if(vals[3].equals(ctgry)&Integer.parseInt(vals[2])>stPrice&Integer.parseInt(vals[2])<endPrice) {
					Product p = new Product();
					p.setId(Integer.parseInt(vals[0]));
					p.setName(vals[1]);
					p.setPrice(Integer.parseInt(vals[2]));
					p.setCategory(vals[3]);
					fl.add(p);
				}}
			}

		} catch (Exception e) {
			e.printStackTrace();
			throw new ApplicationException("Exception in file ");
		}
		//System.out.println(fl.size());
		return fl;
	}

}
