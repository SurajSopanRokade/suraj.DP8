package com.hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(1, "10th");
		hMap.put(2, "12th");
		//System.out.println(hMap.put(1, "B.E."));
		System.out.println("Using toString");
		//System.out.println(hMap);
		
		System.out.println("Using inhanced for loop");
		Set <Entry<Integer,String>> s = hMap.entrySet();
		for (Entry<Integer,String> ob:s) {
			System.out.println(ob.getKey()+" "+ob.getValue());
		}
		System.out.println("Using inhanced for loop");
		
	}

}
