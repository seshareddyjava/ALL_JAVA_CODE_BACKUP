package projectProduct;

import java.util.ArrayList;

public class ProductTest {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
	    ArrayList<Product> prod= dao.getProductsByType("EL","C:\\Users\\sesha\\Desktop\\SLOKAM\\produt2.txt");
	    for(int i=0;i<prod.size();i++) {
	    	Product p1=prod.get(i);
	    	System.out.println(p1.pid);
	    	System.out.println(p1.name);
	    	System.out.println(p1.color);
	    	System.out.println(p1.price);
	    	System.out.println(p1.type);
	    	System.out.println("=====================");
	    }
	    System.out.println("end of records");
	    ArrayList<Product> list= dao.getProductsByPriceRange(1000,3000,"C:\\Users\\sesha\\Desktop\\SLOKAM\\produt2.txt");
	    System.out.println("start of records by price range");
	    for(int j=0;j<list.size();j++) {
	    	Product p2 = list.get(j);
	    	
	    	System.out.println(p2.pid);
	    	System.out.println(p2.name);
	    	System.out.println(p2.color);
	    	System.out.println(p2.price);
	    	System.out.println(p2.type);
	    	System.out.println("================");
	    }
	
	}

}
