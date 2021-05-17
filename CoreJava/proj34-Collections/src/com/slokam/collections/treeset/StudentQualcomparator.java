package com.slokam.collections.treeset;

import java.util.Comparator;

public class StudentQualcomparator  implements Comparator<Student>{
@Override
public int compare(Student o1, Student o2) {
	// TODO Auto-generated method stub
	return o1.getQual().compareTo(o2.getQual());
}
}
