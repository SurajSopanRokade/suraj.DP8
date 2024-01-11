package com.stringAssignment;
//1.  String create with new operator and without new
//2.  Compare string using == when we create without new see same reference is there
public class WithNewWithoutNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []str = new String[3];//String with new keyword
		str[0]="Suraj";
		str[1]="Su";
		str[2]="raj";
		
		String str1[]= {"Suraj", "su", "raj"};//String without new keyword
		String str3[]= {"Suaj", "su", "raj"};
		str=str1;
		str1=str3;
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str1);
		System.out.println(str3);
		
		if(str1==str3)
			System.out.println("same");
		else 
			System.out.println("not same");
		
	}

}
