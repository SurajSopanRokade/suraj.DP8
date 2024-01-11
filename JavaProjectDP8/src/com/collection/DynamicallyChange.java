package com.collection;

import java.util.ArrayList;

//1. Show in program, that size of an arraylist dynamically changes
public class DynamicallyChange {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>tech = new ArrayList<>();
		System.out.println(tech.size());
		tech.add("Java");
		tech.add("JHhdhdskhsiiodf");
		tech.add("dfgdzfr");
		tech.add("dzfgddfgdd");
		
		System.out.print(tech);
		System.out.println(tech.size());
		tech.add(1,"Suraj");
		System.out.print(tech);
		
		tech.remove(1);
		System.out.println(tech);
		boolean f = tech.remove("JHhdhdskhsiiodf");
		System.out.print(f);
		System.out.println(tech);
	}

}
