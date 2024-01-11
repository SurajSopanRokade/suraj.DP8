package com.hashmapAssign;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. WAP to add elements to a HashMap without using generics (ie do not use <>) 
//and print content of it. Use Integer as Key and String as Value. 
//In second HashMap add elements of String type as Key and Integer as Value.
		
		HashMap hmap = new HashMap();
		hmap.put(1, "Suraj");
//		System.out.println(hmap);
		
//2. WAP to get all the entries from a HashMap. 
//Iterate the entries and print the Key & Value values
		HashMap <String,Integer > hm = new HashMap<>();
		hm.put("Suraj", 1);
		hm.put("Raj", 2);
		hm.put("Dumn", 3);
		Set <Entry<String,Integer>> s = hm.entrySet();
		for (Entry<String,Integer> ob:s) {
//			System.out.println(ob.getKey()+" "+ob.getValue());
		}
//3. WAP to get only the Keys from a HashMap
		Set <Entry<String,Integer>> s1 = hm.entrySet();
		for (Entry<String,Integer> ob:s) {
//			System.out.println(ob.getKey());
		}
//4. WAP to get only the Values from a HashMap	
		Set <Entry<String,Integer>> s2 = hm.entrySet();
		for (Entry<String,Integer> ob1:s) {
//			System.out.println(ob1.getValue());
		}
//5. WAP to copy all of the mappings from the specified HashMap to another map		
		HashMap <String, Integer> hm1 = new HashMap<>(hm);
		Set <Entry<String,Integer>> s3 = hm1.entrySet();
		for (Entry<String,Integer> ob1:s3) {
//			System.out.println(ob1.getKey()+" "+ob1.getValue());
		}
//6. WAP to search for an element from HashMap using key
		String key = "Raj";
//		System.out.println(hm.get(key));
//		System.out.println(hm.containsKey(key));
//7. WAP to test if a HashMap contains a mapping for the specified value
		int value=1;
//		System.out.println(hm.containsValue(value));
		Set <Entry<String,Integer>> s4 = hm.entrySet();
		for (Entry<String,Integer> ob2: s4) {
//			System.out.println(ob2.getKey()+" "+ob2.getValue());
		}
//8. WAP to remove an element from HashMap using key
//		hm.remove("Suraj");
//		System.out.println(hm);
		hm.remove("Suraj", 7);
//		System.out.println(hm);
		hm.remove("Suraj", 1);
//		System.out.println(hm);
//9. WAP to empty Map. 
//(Hint - Get keys and iterate through the keys to remove entries from Map)
		HashMap <Integer, String> map = new HashMap<>();
		map.put(1,"Suraj");
		map.put(2,"Abhishek");
		map.put(3,"Sunish");
		map.put(4, "Snehal");
//		map.clear();
		Set<Integer> set = map.keySet();
		Iterator <Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("Map after remove keys = " + map);
//10.WAP to create a map using Custom class as key and any other JDK provided object as value
		Student ss1 = new Student(1,23,"Suraj");
		HashMap <Student, String> map1 = new HashMap<>();
		
//11.WAP to create a map using Custom class as key and any other Custom class as value
		HashMap <Department, Employee> map2 = new HashMap<>();
		Department d1 = new Department(12,"IT","Pune");
		Department d2 = new Department(13,"HR","Pandharpur");
		Department d3 = new Department(16,"Marketing","Mumbai");
		
		Employee e1 = new Employee(23,102,"Suraj",34000);
		Employee e2 = new Employee(24,103,"Abhishek",56000);
		Employee e3 = new Employee(26,106,"Snehal",74000);
		
		map2.put(d1, e1);
		map2.put(d2, e2);
		map2.put(d3, e3);
		
		
//
	}

}
