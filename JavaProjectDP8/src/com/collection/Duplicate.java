package com.collection;
import java.util.*;
//5.Create arraylist of characters. 
//Remove duplicate characters from the list. 
//E.g. list – { ‘d’ , ‘g’ , ‘h’ , ‘d’ , ‘d’ . ‘h’ , ‘g’}Output should be {‘d’ , ‘g’ , ‘h’}
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Character> obj1 = new ArrayList<Character>();
		obj1.add('d');
		obj1.add('f');
		obj1.add('g');
 		obj1.add('h');
		obj1.add('h');
		obj1.add('d');
		obj1.add('d');
		obj1.add('g');
		obj1.add('f');

		
	//	ArrayList<Character> obj1 = new ArrayList<Character>(Arrays.asList('d','f','h','g','d','f','f'));
		
		
		for (int i=0; i<obj1.size(); i++) {
			for (int j=i+1; j<obj1.size(); j++) {
				if (obj1.get(i)==obj1.get(j)) {
					obj1.remove(j);
					j--;
				}
//				if (count!=0) {
//					boolean IsNotCounted=true;
//					for (int k=i-1; k>=0; k--) {
//						if (obj1.get(i)==obj1.get(k))
//							IsNotCounted=false;
//					}
//					if (IsNotCounted) {
//					}
//		
//				}
		
		
			}
		
		}
		System.out.println(obj1);
	}
}