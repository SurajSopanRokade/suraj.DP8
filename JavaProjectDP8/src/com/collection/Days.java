package com.collection;

import java.util.ArrayList;
import java.util.Iterator;

//3.Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc) 
//Remove elements from list for which string length is more than 7
public class Days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> obj = new ArrayList<>();
		obj.add("Monday");
		obj.add("Tuesday");
		obj.add("Wednsday");
		obj.add("Friday");
		obj.add("Saturday");
		obj.add("Sunday");
		
		Iterator<String> p= obj.iterator();
		while(p.hasNext()){
			
			if((p.next().length()>7)){
				p.remove();
				
			}
		}
		System.out.println(obj);
	}

}
