package com.test6;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListQue {
	public void list() {
		LinkedList<Integer>list = new LinkedList<>();
		list.add(12);
		list.add(45);
		list.add(34);
		list.add(67);
		list.add(35);
		
		ListIterator <Integer> itr = list.listIterator(list.size());
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListQue l1 = new LinkedListQue();
		l1.list();
	}

}
