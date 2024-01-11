package com.test7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

//10> Create a PriorityQueue to give engineering admission to candidate.
//Create Candidate class with cid,cname,m1,m2,m3,percentage.
//Candidate with highest marks should get admission first!  		
public class Que8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate c1 = new Candidate(1,89,67,87,"Abhishek");
		Candidate c2 = new Candidate(2,90,68,78,"Snehal");
		Candidate c3 = new Candidate(3,59,87,77,"Suraj");
		Candidate c4 = new Candidate(4,90,97,87,"Sunish");
		
		Queue<Candidate> qu = new PriorityQueue<>();
		qu.add(c1);
		qu.add(c2);
		qu.add(c3);
		qu.add(c4);
		ArrayList<Candidate> list = new ArrayList<>();
		Candidate c;
		while ((c=qu.poll())!=null) {
		//	System.out.println(c+"\n");
			list.add(c);
		}
		System.out.println(list);
		
	}

}
