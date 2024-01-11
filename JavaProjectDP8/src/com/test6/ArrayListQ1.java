package com.test6;

import java.util.ArrayList;

public class ArrayListQ1 {
	public void list() {
		ArrayList<String>al = new ArrayList<String>();
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		
		for (int i=0; i<al.size(); i++) {
			for (int j=0; j<al.size(); j++) {
				if (al.get(i)==al.get(j)) {
					al.remove(j);
					
				}
					
			}
		}
		System.out.println(al);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListQ1 a1 = new ArrayListQ1();
		a1.list();
	}

}
