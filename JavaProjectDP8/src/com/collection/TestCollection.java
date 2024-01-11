package com.collection;
import java.util.*;
public class TestCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>obj = new ArrayList<String>();
		obj.add("Suraj");
		obj.add("Abhishek");
		obj.add("Snehal");
		obj.add(1,"Sunish");
		System.out.println(obj);//ArrayList contain toString method
		
		Iterator<String> itr= obj.iterator();
		while(itr.hasNext()) {//hasNext() method of iterator check element present or not
			
			System.out.print(itr.next()+" ");// itr.next() method get reference if element present
		}
	}

}
