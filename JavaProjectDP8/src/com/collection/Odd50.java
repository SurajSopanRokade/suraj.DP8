package com.collection;
//2. Create arraylist of integers. Add first 50 odd numbers to arraylist.
import java.util.ArrayList;
public class Odd50 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=1;
		ArrayList<Integer> a1 = new ArrayList<>();
//		int i=1;
//		while(count<=50) {
//			a1.add(i);
//			count++;
//			i=i+2;
//		}
		for (int i=1; count<=50; i=i+2) {
			a1.add(i);
			count++;
		}
		System.out.println(a1);
		System.out.println(a1.size());
	}

}
