package com.slokam.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
public static void main(String[] args) {
	
	Runnable r = ()->{
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	};
	Thread t = new Thread(r);
	//t.start();
	Comparator <String> comp = (o1,o2)->o2.compareTo(o1);
	ArrayList<String> l = new ArrayList<String>();
	l.add("srinivas");l.add("chandra");l.add("sai");
	l.add("nagaraju");l.add("yashwanth");l.add("raviteja");
//	long l1 =l.stream().count();
//	System.out.println(l1);
	List<String> ls3=l.stream().filter(s->s.length()>8).collect(Collectors.toList());
	System.out.println("filtered objects");
	System.out.println(ls3);
	List<String> ls2=l.stream().sorted() .collect(Collectors.toList());
	System.out.println("deault sorting order");
	System.out.println(ls2);
	List<String> ls=l.stream().sorted(comp) .collect(Collectors.toList());
	System.out.println("customized sorting order");
	System.out.println(ls);
	List<String> collect = ls.stream().map((String s )->s.concat("A")).collect(Collectors.toList());
	System.out.println(collect);
	}
}
	

