package com.LinkListAssignment;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.ListIterator;

public class Assign3 implements Cloneable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//2.  WAP to join two linked lists.
		LinkedList<Integer>list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		LinkedList<Integer>list1 = new LinkedList<>(list);
		list1.add(7);
		list1.add(2);
		list1.add(3);
		list1.add(10);
		list1.add(11);
		
		//System.out.println(list1);
		
		System.out.println(list.poll());
		
		
		
//3.  WAP to clone a linked list to another linked list.
		
		LinkedList<Integer>list2 =  (LinkedList<Integer>)list.clone();
		System.out.println(list2);
		
//4.  WAP to remove and return the first element of a linked list.		
		list.removeFirst();
		System.out.print(list+" ");
		list.addFirst(1);
		System.out.println(list+" ");
//5.  WAP to retrieve but does not remove, the first element of a linked list.
		
		System.out.println(list.peek());
		System.out.println(list.poll());
//6.  WAP to retrieve but does not remove, the last element of a linked list.		
		System.out.println(list.peekLast());
//7.  WAP to check if a particular element exists in a linked list.	
		System.out.println(list.contains(2));
//8.  WAP to convert a linked list to array list.
		Object[] arr=list.toArray();
		System.out.println(Arrays.toString(arr));
//9.  WAP to compare two linked lists.
//		int count=0;
//		for (int i=0 ;i<list.size(); i++) {
//			if(list.get(i)==list1.get(i))
//				count++;
//		}
//		if (count==list.size())
//			System.out.println("Both lists are same");
//		else
//			System.out.println("Both lists are not same");
//10.  WAP to test a linked list is empty or not.
		System.out.println(list.pollLast());
//11.  WAP to replace an element in a linked list.
		list.set(1, 34);
		System.out.println(list);
		
	}

		

}
