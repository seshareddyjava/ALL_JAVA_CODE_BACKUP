import java.util.ArrayList;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class Test {

	public static void main(String[] args) {
		ArrayList<Car> list = new ArrayList<Car>();
		Cars cars = new Cars();
		Car car1 = new Car();
		car1.setName("TATA");
		car1.setModel("INDICA");
		car1.setMilage(25);
		list.add(car1);
		Car car2 = new Car();
		car2.setName("M and M");
		car2.setModel("THOR");
		car2.setMilage(15);
		list.add(car2);
		cars.setCar(list);
		try {
			JAXBContext context = JAXBContext.newInstance(Cars.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(cars, System.out);
			// System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
