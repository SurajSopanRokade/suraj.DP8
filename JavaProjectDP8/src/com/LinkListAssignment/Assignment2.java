package com.LinkListAssignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//2.  WAP to iterate through all elements in a linked list.
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>obj= new LinkedList<>();
		obj.add("Suraj");
		obj.add("Su");
		obj.add("Raj");
		
		Iterator<String> itr = obj.iterator();
//		while(itr.hasNext()) {
//			System.out.print(itr.next()+" ");
//3.  WAP to iterate through all elements in a linked list starting at the specified position.
			for (int i=2; i<obj.size(); i++) {
				System.out.println(obj.get(i));
			}
//4.  WAP to iterate a linked list in reverse order.
			 Iterator<String>itr2= obj.descendingIterator();
			 while(itr2.hasNext()) {
				 System.out.println(itr2.next());
			 }
//5.  WAP to insert the specified element at the specified position in the linked list.
			 obj.add(1,"Uraj");
			 System.out.println(obj);
//6.  WAP to insert elements into the linked list at the first and last position.
			 obj.addFirst("Deque");
			 obj.addLast("Kuraj");
			 System.out.println(obj);
//7.  WAP to insert the specified element at the front of a linked list.
			 obj.add(0,"Ouraj");
			 System.out.println(obj);
//8.  WAP to insert the specified element at the end of a linked list.
			 obj.add(obj.size(),"Luraj");
			 System.out.println(obj);
//9.  WAP to insert some elements at the specified position into a linked list.
			 obj.add(1,"Duraj");
			 System.out.println(obj);
//10.  WAP to get the first and last occurrence of the specified elements in a linked list.
			 LinkedList<Integer>obj1= new LinkedList<>();
				obj1.add(1);
				obj1.add(2);
				obj1.add(4);
				obj1.add(2);
				obj1.add(1);
				obj1.add(2);
				int firstO=0, LastO=0;
				int n=1;
				int count=0;
				for (int i=0; i<obj1.size(); i++) {
					if (obj1.get(i)==n) {
						count++;
				    if (count==1)
						  firstO=i;
				    else
				    	LastO=i;
					}
					
				}
				System.out.println("Last Occurance " + firstO);
				System.out.println("First Occurance " + LastO);
//11.  WAP to display the elements and their positions in a linked list.
				for (int i=0; i<obj1.size(); i++) {
					System.out.println("elements "+obj1.get(i)+"Position "+ i);
				}
//12.  WAP to remove a specified element from a linked list.
				obj1.remove(2);
//13.  WAP to remove first and last element from a linked list.
//				obj1.removeFirst();
//				obj1.removeLast();
//14.  WAP to remove all the elements from a linked list.	
//				obj1.removeAll(obj1);
//				obj1.clear();
				
//1.  WAP to shuffle the elements in a linked list.
				Collections.shuffle(obj1);
				System.out.println(obj1);
				
//
	 }
	}

