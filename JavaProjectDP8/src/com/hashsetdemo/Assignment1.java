package com.hashsetdemo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.WAP to create a HashSet with some colors (String) using generics
		HashSet<String> set = new HashSet<>();
		set.add("Red");
		set.add("Blue");
		set.add("Orange");
		set.add("Purpul");
		set.add("Blue");
		set.add("Red");
		
//2.WAP to create a HashSet from an ArrayList
		ArrayList<String> list = new ArrayList<>();
		list.add("Blue");
		list.add("Red");
		list.add("Orange");
		list.add("Purpul");
		
		HashSet<String>set1 = new HashSet<>(list);
//3.WAP to iterate through all elements in a HashSet and print the elements. 
//  Observe the order of elements.
		Iterator <String> itr = set1.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//4. WAP to empty a HashSet.
//		set.clear();
//		System.out.println(set);
//5.Do all above assignments using LinkedHashSet
		LinkedHashSet <String>lset = new LinkedHashSet<String>();
		lset.add("Blue");
		lset.add("Red");
		lset.add("Orange");
		lset.add("Yellow");
		lset.add("Blue");
		
//		System.out.println(lset);
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Blue");
		list1.add("Red");
		list1.add("Orange");
		list1.add("Purpul");
		
		LinkedHashSet <String>lset1 = new LinkedHashSet<String>(list1);
//		System.out.println(lset1);
		Iterator <String> itr2 = lset1.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
		lset1.clear();
		
//
		
//11.WAP to convert a HashSet to an array.
		HashSet<Integer> s = new HashSet<>();
		s.add(12);
		s.add(4);
		s.add(6);
		s.add(9);
		s.add(3);
		Integer arr []= new Integer[s.size()];
		int u=0;
		for (Integer i : s) {
			arr[u]=i;
			u++;
		}
		System.out.println(Arrays.toString(arr));
		
		Integer arr1 [] = s.toArray(arr);
		System.out.println(Arrays.toString(arr1));
		
//
	}
	

}
