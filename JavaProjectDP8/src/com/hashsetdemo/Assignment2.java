package com.hashsetdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//6. WAP to create a TreeSet from a HashSet.
		HashSet<String> set = new HashSet<>();
		set.add("Blue");
		set.add("Black");
		set.add("White");
//		TreeSet<String> tset = new TreeSet<>(set);
//		System.out.print(tset);
//7. WAP to create a new TreeSet, add Strings and print the TreeSet.
		TreeSet<String> tset= new TreeSet<>();
		tset.add("Blue");
		tset.add("Black");
		tset.add("White");
		System.out.println(tset);
		tset.add("Pink");
		System.out.println(tset);
//8.WAP to get the first and last elements in a TreeSet.
		System.out.println(tset.first());
		System.out.println(tset.last());
//9. WAP to create a reverse order view of the elements contained in a given TreeSet
//		Iterator<String> itr = tset.descendingIterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//10.WAP to retrieve and remove the lowest element of a TreeSet using a single method call. Repeat the same using 2 different method calls.
//			System.out.println(tset.pollFirst());
//			System.out.println(tset);
			System.out.println(tset.remove(tset.first()));
			System.out.println(tset);

		
	}

}
