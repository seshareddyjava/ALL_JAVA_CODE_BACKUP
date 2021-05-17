import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest  {
 public static void main(String[] args) {
	
	 Student std = new Student(1, "Swami",25,"nalgonda");
	 Student std1 = new Student(2, "sandeep",25,"mumbai");
	 Student std2 = new Student(3, "vinay",27,"banglore");
	 Student std3 = new Student(4, "nagaraju",28,"hyderabad");
	 Student std4 = new Student(5, "chandra",29,"nalgonda");
	 Student std5 = new Student(6, "Sai",24,"pune");
	 Student std6 = new Student(1, "Swami",26,"chennai");
	 Student std7 = new Student(1, "Swami",26,"chennai");
	 
	 HashSet<Student> hs = new HashSet<Student>();
	 hs.add(std);
	 hs.add(std7);
	 hs.add(std1);
	 hs.add(std2);
	 hs.add(std3);
	 hs.add(std4);
	 hs.add(std5);
	 hs.add(std6);
		/*
		 * System.out.println(hs.size()); System.out.println(hs);
		 */
	 TreeSet<Student> ts = new TreeSet<Student>(new StudentIDcomparator().reversed());
	 ts.addAll(hs);
	 System.out.println(ts.size());
	 System.out.println(ts);
}
}
