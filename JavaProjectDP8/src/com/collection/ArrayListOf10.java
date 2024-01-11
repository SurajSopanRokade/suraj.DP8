package com.collection;
import java.util.*;
//4. Create arraylist of 10 integers. Insert an element at 7th position.
public class ArrayListOf10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<Integer>();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(5);
		obj.add(6);
		obj.add(7);
		obj.add(8);
		obj.add(9);
		obj.add(10);
		obj.add(11);
		obj.add(7,4);
		
		System.out.println(obj);
	}

}
