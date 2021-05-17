package com.slokam.shopping.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.slokam.shopping.dao.FileDao;
import com.slokam.shopping.dao.HibernateDao;
import com.slokam.shopping.dao.XmlDao;
import com.slokam.shopping.exception.ApplicationException;
import com.slokam.shopping.pojo.Product;

public class ShoppingTest {

	public static void main(String[] args) throws Exception {
		ArrayList<Product> filList = new ArrayList<Product>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter categeory ");
		String cat=sc.nextLine();
		
		System.out.println("Enter Starting price ");
		int stPrice=sc.nextInt();
		
		System.out.println("Enter ending price ");
		int endPrice=sc.nextInt();
		try {
		XmlDao xdao = new XmlDao();
		ArrayList<Product> xlist= xdao.getProduct(cat, stPrice, endPrice);
		FileDao fdao = new FileDao();
		filList.addAll(xlist);
		ArrayList<Product> flist=fdao.getFileData(cat, stPrice, endPrice);
		System.out.println(flist.size());
		filList.addAll(flist);
		HibernateDao.saveRecords(filList);
		
		}catch(ApplicationException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
