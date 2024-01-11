package com.test6;

import java.util.ArrayList;

public class ArrayToArrayList {
	public void array() {
		int arr[]= {2,3,4,5,6,3};
		ArrayList<Integer> list = new ArrayList<>();
		for (int i=0; i<arr.length; i++) {
			int a=arr[i];
			list.add(a);
		}
		System.out.println(list);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayToArrayList a1 = new ArrayToArrayList();
		a1.array();
	}

}
