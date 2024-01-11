package com.collection;
import java.util.*;
public class TestCollection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<String>();
		obj.add("Suraj");
		obj.add("Sunish");
		obj.add("Abhishek");
		
//		ArrayList<String> obj1 = new ArrayList<String>();
//		obj1.add("Snehal");
//		obj1.add("Sumit");
//		
//		obj.addAll(obj1);
		
//		ArrayList<String> obj2 = new ArrayList<String>();
//		obj2.add("Suraj");
//		obj2.add("Damn");
//		
//		obj.removeAll(obj2);
		
		ArrayList<String> obj3 = new ArrayList<String>();
		obj3.add("Suraj");
		obj3.add("Damn");
		
		obj.retainAll(obj3);
		
		Iterator <String> p = obj.iterator();
		while(p.hasNext()) {
			System.out.print(p.next()+" ");
		}
	}

}
