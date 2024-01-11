package com.hashmapAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(78,89,90,79,97));
		Student1 s1 = new Student1(1,"Suraj",arr1);
		
		ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(89,67,97,74,87));
		Student1 s2 = new Student1(2,"Sudarshan",arr2);
		
		ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(90,89,89,99,97));
		Student1 s3 = new Student1(3,"Yogesh",arr3);
		
		ArrayList<Integer> arr4 = new ArrayList<>(Arrays.asList(88,89,60,89,67));
		Student1 s4 = new Student1(4,"Abhishek",arr4);
		
		ArrayList<Integer> arr5 = new ArrayList<>(Arrays.asList(99,89,90,99,97));
		Student1 s5 = new Student1(5,"Adersh",arr5);
		
		ArrayList <Student1> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		HashMap <String, ArrayList<Student1>> map = new HashMap<>();
		
		Iterator <Student1> itr = list.iterator();
		
		while(itr.hasNext()) {
			Student1 s = itr.next();
			if (map.containsKey(s.grade)) {
				ArrayList<Student1> list1 = map.get(s.grade);
				list1.add(s);
				map.put(s.grade, list1);
			}
			else {
				ArrayList<Student1> list2 = new ArrayList<>();
				list2.add(s);
				map.put(s.grade, list2);
			}
		}
		Set<String> set=map.keySet();
		Iterator< String> i=set.iterator();
		while(i.hasNext())
		{
			String s=i.next();
			System.out.println(s);
			System.out.println(map.get(s));
			System.out.println("_____________________________________");
		}
		
	}
}
