import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CustomerTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Customer c = new Customer();
		c.setCid(1);
		c.setClocation("hyd");
		c.setCname("raaju");
		
		Customer c2=(Customer) c.clone();
		
		System.out.println(c);
		System.out.println(c2);
		
		/*System.out.println(c==c2);
		System.out.println(c.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c.equals(c2));*/
		
		Set<Customer> set =new HashSet<Customer>();
		System.out.println(set.add(c));
		System.out.println(set.add(c2));
		
		Class cls = Customer.class;
		//cls.
	}
}
