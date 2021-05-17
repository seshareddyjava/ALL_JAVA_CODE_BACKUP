import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<Student,Integer> map = new HashMap<Student,Integer>();
		
		Student std1 = new Student(1,"Naaga","btech",25);
		Student std2 = new Student(2,"yash","mtech",26);
		Student std3 = new Student(3,"ravi","degree",28);
		Student std4 = new Student(4,"chandra","10th",22);
		Student std5 = new Student(5,"sai","12th",27);
		
		map.put(std1, 70);
		map.put(std2, 50);
		map.put(std3, 60);
		map.put(std4, 90);
		map.put(std5, 56);
		
		System.out.println(map);
		System.out.println();System.out.println();
		
		Set<Entry<Student,Integer>> entrySet= map.entrySet();
		
		for (Entry<Student,Integer> set :entrySet) {
			System.out.println(set.getKey());
			System.out.println(set.getValue());
		}

	}

}
