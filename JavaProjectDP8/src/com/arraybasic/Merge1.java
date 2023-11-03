package com.arraybasic;

import java.util.Arrays;

//n1[]={1,2,3,4,5}
//n2[]={11,22,33}
//n3[]={1,11,2,22,3,33,4,5}
public class Merge1 {
	
	public static void Merge() {
	int n1[]={1,2,3,4,5};
	int n2[]={11,22,33};
	int n3 [] = new int[n1.length+n2.length];
	int a=0, b=0, c=0;
	while(n1.length>a && n2.length>b) {
		n3[c++]=n1[a++];
		n3[c++]=n2[b++];
	}
	while(n1.length>a) {
		n3[c++]=n1[a++];
	}
	while(n2.length>a) {
		n3[c++]=n2[b++];
	}
	System.out.println(Arrays.toString(n3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Merge();
		
		
	}	
		
	}


