package com.queue;

import java.util.Iterator;
import java.util.Stack;

public class StackAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.  WAP to create a Stack with Integer objects without using generics
		Stack st = new Stack();
		st.push(12);
		st.push(13);
		st.push(56);
		st.push(17);
		st.push(67);
		Iterator itr = st.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
//		System.out.print(st+" ");
//2.  WAP to create a Stack with some colors (String) &amp; using generics
		Stack<String> st1 = new Stack<>();
		st1.push("Blue");
		st1.push("Orange");
		st1.push("Yellow");
		st1.push("Red");
		
		System.out.print(st1+" ");
//3.  WAP to create a Stack with user defined class objects &amp; using generics
		Student s1 = new Student(12,"Adersh");
		Student s2 = new Student(15,"Ishvar");
		Student s3 = new Student(12,"Sudarshan");
		Student s4 = new Student(14,"Snehal");
		
		Stack<Student>st2 = new Stack<>();
		st2.push(s1);
		st2.push(s2);
		st2.push(s3);
		st2.push(s4);
		
		Iterator <Student> itr1 = st2.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//4.  Use  different method calls to add elements to a Stack.
		Student s5 = new Student(56,"Pritam");
//		st2.add(s5);
		st2.addElement(s5);
		System.out.print(st2);
//5.  WAP to check if a Stack has values
		System.out.println(st2.isEmpty());
//6.  WAP to create a Stack using generics and add user defined class 
//objects which implements comparable interface. 
//Observe order when removing from Stack.
		while(!st2.empty()) {
			System.out.print("POP : "+st2.pop()+" ");
		}
	}

	

}
