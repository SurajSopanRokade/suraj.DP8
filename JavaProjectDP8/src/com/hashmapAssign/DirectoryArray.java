package com.hashmapAssign;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
//WAP Phone Directory application in java using a Map.
//The phone directory should allow users to:
//
//Add a contact with a name and phone number.
//Remove a contact by name.
//Retrieve the phone number associated with a given name.
//Display the entire phone directory.
public class DirectoryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Long> list1 = new ArrayList<>(Arrays.asList(9974927911l, 9785673858l));
		
		
		ArrayList<Long> list2 = new ArrayList<>(Arrays.asList(8974627911l, 2385673758l, 6968394959l ));
		
		
		ArrayList<Long> list3 = new ArrayList<>(Arrays.asList(5974968981l));
		
		
		ArrayList<Long> list4 = new ArrayList<>(Arrays.asList(3964957611l, 4785573858l));
		
		
		ArrayList<Long> list5 = new ArrayList<>(Arrays.asList(7976927511l, 5745673658l));
		
		
		
		
		HashMap <String, ArrayList<Long>> map = new HashMap<>();
		map.put("Suraj", list1);
		map.put("Abhishek", list2);
		map.put("Snehal", list3);
		map.put("Yogesh", list4);
		map.put("Maruti", list5);
		
		System.out.println("Choise 1 : If you want to add name and number press 1");
		System.out.println("Choise 2 : If you want to remove name and number press 2");
		System.out.println("Choise 3 : If you want to retrieve the phone number associated with a given name press 3");
		System.out.println("Choise 4 : if you want to display the entire phone directory press 4");
		char ch;
		do
		{
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		if(i==1) {
			System.out.println("Give name to add");
			String str = sc.next();
			System.out.println("Give number to add");
			long no = sc.nextLong();
			ArrayList<Long> list6 = new ArrayList<>(Arrays.asList(no));
			System.out.println("If you want to add another number press 1 else press 2");
			int a= sc.nextInt();
			if (a==1) {
				System.out.println("Add number");
				long no1=sc.nextLong();
				list6.add(no1);
			}
			map.put(str, list6);
		}
		else if (i==2) {
			System.out.println("Give name to remove name and number");
			String s = sc.next();
			map.remove(s);
		}
		else if (i==3) {
			System.out.println("Retrieve the phone number associated with a given name.");
			String s1 = sc.next();
			System.out.println(map.get(s1));
		}
		else if (i==4) {
			System.out.println("Display the entire phone directory.");
			System.out.println(map);
		}
		System.out.println("Do you want to continue press y else no");
			ch=sc.next().charAt(0);
		}while(ch=='y'||ch=='Y');
		System.out.println(map);
	}

}
