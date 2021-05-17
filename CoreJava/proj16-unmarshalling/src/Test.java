import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class Test {

	public static void main(String[] args) {
		
		try {
		//ArrayList<Car> list = new ArrayList<Car>();	
		JAXBContext context=	JAXBContext.newInstance(Cars.class);
		Unmarshaller um= context.createUnmarshaller();
		Cars c = (Cars)um.unmarshal(new File("C:\\Users\\sesha\\Desktop\\SLOKAM\\cars.xml"));
		
		ArrayList<Car> list= c.getCar();
		for(int i=0;i<list.size();i++) {
			Car car=list.get(i);
			/*
			 * System.out.print(car.getName()+"\t"); System.out.print(car.getModel()+"\t");
			 * System.out.print(car.getMilage()+"\t"); System.out.println();
			 */
			System.out.println(car);
		}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
