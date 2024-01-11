package com.test7;

import java.util.LinkedList;
import java.util.List;

public class que3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new LinkedList<>();
		list1.add("Me");  	list1.add("You");	list1.add("He");             
		list1.add("She");		list1.add("It");
		List<String> list2 = new LinkedList<String>();
		list2.add("You");   
		list1.retainAll(list2);
		System.out.println(list1);
	}
}
