package com.test7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.stringAssignment.FirstOccurance;

public class Que1UsingCollection {
	public void check() {
		String str="My Name is Yasmin";
		String str1=str.toLowerCase();
		char ch[]=str1.toCharArray();
		int b;
		int a;
		
		for (char c:ch) {
			b=str1.indexOf(c);
			a=str1.lastIndexOf(c);
			if(a==b) {
				System.out.println(c+" First non repeating character");
				break;
			}
		}	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Que1UsingCollection q1 = new Que1UsingCollection();
		q1.check();
	}

}
