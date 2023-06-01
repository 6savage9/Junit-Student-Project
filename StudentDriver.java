package junitproj;

import java.util.ArrayList;
import java.util.List;

public class StudentDriver {

	public List<Student> stdData(){
		Student s = new Student(1, "Prajwal", 23);
		Student s1 = new Student(2, "Harshal", 23);
		Student s2 = new Student(3, "Digvijay", 23);
		
		List<Student> l = new ArrayList<Student>();
		l.add(s);
		l.add(s1);
		l.add(s2);
		
		return l;
	}
}
