package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AuthWiseBooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1 = new Book(1,"Head First Java"," Ma. Subramanian", 2330);
		Book b2 = new Book(2,"Come! Let's Run"," Ma. Subramanian", 2430);
		Book b3 = new Book(3,"India's Knowledge Supremacy: The New Dawn"," Dr. Ashwin Fernandes", 2830);
		Book b4 = new Book(3,"India's Knowledge Supremacy: The New Dawn"," Sanjeev Sanyal", 2730);
		Book b5 = new Book(1,"Head First Java"," Sanjeev Sanyal", 2630);
		Book b6 = new Book(1,"Head First Java"," Dr. Ashwin Fernandes", 2630);
		Book b7 = new Book(1,"Head First Java"," Dr. Ashwin Fernandes", 2630);
		
		ArrayList<Book> obj = new ArrayList<>(Arrays.asList(b1, b2, b3, b4, b5, b6, b7));
		
//		for (int i=0; i<obj.size(); i++) {
//			int count=0;
//			for (int j=i+1; j<obj.size(); j++) {
//				if (obj.get(i).bookauther.equals(obj.get(j).bookauther)) {
//					count++;
//				}
//			}
//			if (count!=0) {
//				boolean isNotCounted=true;
//				for (int k=i-1; k>=0; k--) {
//					if (obj.get(i).bookauther.equals(obj.get(k).bookauther))
//						isNotCounted=false;
//				}
//				if(isNotCounted)
//					System.out.println("Auther " + obj.get(i).bookauther + "count = " + (count+1));
//			}
//		}
//		int count=0;
//		for (int i=0; i<obj.size(); i++) {
//			count=0;
//			for (int j=0; j<obj.size(); j++) {
//				if (obj.get(i).bookauther.equals(obj.get(j).bookauther)&& j<i) 
//					break;
//				else if(obj.get(i).bookauther.equals(obj.get(j).bookauther))
//					count++;
//				
//				}
//				if (count>0)
//					System.out.println(obj.get(i).bookauther + " = " + count);
//		}
		Collections.sort(obj);
		for (Book i:obj)
			System.out.println(i);
	}
}


