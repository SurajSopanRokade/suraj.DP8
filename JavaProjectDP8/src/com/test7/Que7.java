package com.test7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

//Q10>Create a hashmap <int,String> where key is integers 1 to 10 
//and string is number in words. Remove entry for which number is divisible by 3.
public class Que7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		map.put(4, "four");
		map.put(5, "five");
		map.put(6, "six");
		map.put(7, "seven");
		map.put(8, "eight");
		map.put(9, "nine");
		map.put(10, "ten");
		
		Set<Entry<Integer, String>> set = map.entrySet();
		Iterator<Entry<Integer, String>> itr = set.iterator();
		while(itr.hasNext()) {
			Entry<Integer,String> ent = itr.next();
			int a=ent.getKey();
			if(a%3==0) {
				itr.remove();
			}
		}
		System.out.println(map);
	}

}
