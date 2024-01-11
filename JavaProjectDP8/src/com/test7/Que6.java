package com.test7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//Q8>There is a HashSet which has student objects. 
//Create two ArrayLists from this HashSet. 
//WAP to iterate and remove all the students 
//in HashSet such that in one ArrayList called “placed” Students insert
//students who have been placed and in another ArrayList add un-“placed” Students.
//In the end, the HashSet should contain nothing. 
//Student class fields: (id, name, degree, passingYear, placed (true/false) ). 

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Student> set = new HashSet<>();
		Student s1  = new Student(1,"Snehal","ME","2028",true);
		Student s2  = new Student(2,"Abhi","IT","2027",true);
		Student s3  = new Student(3,"Suraj","CS","2024",false);
		Student s4  = new Student(4,"Sunish","CIVIL","2022",true);
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		set.add(s4);
		ArrayList<Student> passed = new ArrayList<>();
		ArrayList<Student> failed = new ArrayList<>();
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()) {
			Student s= itr.next();
			if(s.placed) {
				passed.add(s);
			}
			else
				failed.add(s);
		}
		System.out.println(passed);
		System.out.println(failed);
		
	}

}
