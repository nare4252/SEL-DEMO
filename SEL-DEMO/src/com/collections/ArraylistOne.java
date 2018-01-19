package com.collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArraylistOne {

	public static void main(String[] args) {
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student s1 = new Student("Narender", 3, 420456);
		Student s2 = new Student("Nagpandi", 4, 25635);
		Student s3 = new Student("Nikhil", 4, 5463);
		
		arrayList.add(s1);
		arrayList.add(s2);
		arrayList.add(s3);
		
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Student student = (Student) iterator.next();
			System.out.println(student.className);
			System.out.println(student.rollNum);
			System.out.println(student.studentName);
			
		}
		
		for (Student student : arrayList) {
			System.out.println(student.className+" "+student.rollNum+" "+student.studentName);
		}
		}

	}


