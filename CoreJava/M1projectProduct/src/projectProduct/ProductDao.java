package projectProduct;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ProductDao {
	ArrayList<Product> getProductsByType(String category, String path) {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					String[] vals = line.split(";");
					if (vals[4].equals(category)) {
						Product p = new Product();
						p.pid = Integer.parseInt(vals[0]);
						p.name = vals[1];
						p.color = vals[2];
						p.price = Integer.parseInt(vals[3]);
						p.type = vals[4];
						list.add(p);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	ArrayList<Product> getProductsByPriceRange(int stPrice, int enPrice, String path) {
		ArrayList<Product> list = new ArrayList<Product>();
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String line;
			while ((line = br.readLine()) != null) {
				line = line.trim();
				if (line.length() > 0) {
					String[] vals = line.split(";");
					if (Integer.parseInt(vals[3]) >= stPrice & Integer.parseInt(vals[3]) <= enPrice) {
						Product p = new Product();
						p.pid = Integer.parseInt(vals[0]);
						p.name = vals[1];
						p.color = vals[2];
						p.price = Integer.parseInt(vals[3]);
						p.type = vals[4];
						list.add(p);
					}
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
