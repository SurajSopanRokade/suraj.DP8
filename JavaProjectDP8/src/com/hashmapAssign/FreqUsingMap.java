package com.hashmapAssign;

import java.util.Arrays;
import java.util.HashMap;

public class FreqUsingMap {
//	public void freq() {
//		String str ="sudarshanaaaa";
//		char ch []= str.toCharArray();
//		
//		HashMap<Character,Integer> map = new HashMap<>();
//		for (char c : ch) {
//			if(map.containsKey(c)) {
//				int count=map.get(c);
//				map.put(c, count+1);
//			}
//			else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);
//	}
	
	public void freqWords() {
		String str = "My name is suraj Is my name not suraj";
		String str1 [] = str.split(" ");
		HashMap<String, Integer> map1 = new HashMap<>();
		for(String c : str1) {
			if (map1.containsKey(c)) {
				int count=map1.get(c);
				map1.put(c, count+1);
			}
			else
			{
				map1.put(c, 1);
			}
			
		}
		System.out.println(map1);
		
		String sstr = "pritam mane pritam";
		String sstr1 [] = sstr.split(" ");
		HashMap<String, Integer> mapp1 = new HashMap<>();
		for (String c : sstr1) {
			Integer i = mapp1.get(c);
			if (i==null) {
				
				mapp1.put(c, 1);
			}
			else
			{
				mapp1.put(c, i+1);
			}
			
		}
		System.out.println(mapp1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FreqUsingMap f1 = new FreqUsingMap();
		f1.freqWords();
	}

}
