package proj05;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcureentHashMapTest {

	public static void main(String[] args) {

		CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<String>();
		
		list.add("apple");
		list.add("bat");
		list.add("cat");
		list.add("dog");
		
		list.stream().forEach(i->{
			if(i.equals("dog"))
				list.add("elephant");
		});
		System.out.println(list);
		
		}

	@Override
	public String toString() {
		return "ConcureentHashMapTest []";
	}
	}


