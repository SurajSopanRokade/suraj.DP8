package com.hashmap;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(1,"Suraj");
		hmap.put(2,"Abhishek");
		hmap.put(4,"Yesh");
		hmap.put(3,"Snehal");
		
		System.out.println("Size = "+hmap.size());
		System.out.println("_________________________________________");
		for (Integer s:hmap.keySet()) {
			System.out.println(s+" "+hmap.get(s));
		}
		System.out.println("_________________________________________");
		
		Set<Entry<Integer, String>> s = hmap.entrySet();
		Iterator <Entry<Integer, String>> itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("___________________________________________");
		for (Entry<Integer, String>e:s) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		System.out.println("___________________________________________");
		Collection<String> str = hmap.values();
		for (String s1:str) {
			System.out.print(s1+" ");
		}
	}

}
