import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

public class XmlDao {
	
	
	public static void main(String[] args){
		ArrayList<Student> list = new ArrayList();                           
				try {
					
					JAXBContext context = JAXBContext.newInstance(Students.class);
					Unmarshaller un= context.createUnmarshaller();
					Object obj= un.unmarshal(new File("E:\\newStudent.xml"));
					Students stds = (Students)obj;
					System.out.println(stds);
					
					ArrayList<Student> stdList= stds.getStudent();
					System.out.println(stdList);
					stdList.stream().forEach(a->System.out.println(a));
					
				} catch (Exception e) {
					e.printStackTrace();
					}
		
		//return null;
	}
}
