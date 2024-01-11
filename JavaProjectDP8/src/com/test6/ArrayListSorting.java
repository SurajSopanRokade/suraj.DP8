package com.test6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorting {
	public void array() {
		ArrayList<String>list = new ArrayList<>();
		list.add("Suraj");
		list.add("Abhishek");
		list.add("Yogesh");
		list.add("Vudarshan");
		list.add("Bumit");
		list.add("Eunish");
		
		for (int i=0 ;i<list.size(); i++) {
			String s=null;
			String s1=null;
			for (int j=i+1; j<list.size(); j++) {
				if(list.get(i).charAt(0)<list.get(j).charAt(0)) {
					s=list.get(i);
					s1=list.get(j);
					list.set(j,s);
					list.set(i,s1);
				
				}	
			}			
		}
//		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListSorting a1 = new ArrayListSorting();
		a1.array();
	}
	

}
