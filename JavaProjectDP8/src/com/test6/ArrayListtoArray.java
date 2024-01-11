package com.test6;


import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListtoArray {
	public void list() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(6);
		list.add(54);
		list.add(8);
		list.add(9);
		list.add(14);
		
		int arr[]=new int[6];
		for (int i=0; i<list.size(); i++) {
			arr[i]=list.get(i);
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListtoArray a1 = new ArrayListtoArray();
		a1.list();
	}

}
