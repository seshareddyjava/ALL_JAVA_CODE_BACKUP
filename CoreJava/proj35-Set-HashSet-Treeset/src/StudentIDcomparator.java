import java.util.Comparator;

public class StudentIDcomparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		int c= o1.getId().compareTo(o2.getId());
		if(c==0) {
			c=o1.getAge().compareTo(o2.getAge());
			if(c==0) {
				c=o1.getAddr().compareTo(o2.getAddr());
				if(c==0) {
					c=o1.getName().compareTo(o2.getName());
				}
			}
		}
		return c;
	}

}
