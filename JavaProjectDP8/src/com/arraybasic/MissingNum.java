package com.arraybasic;
//5.	Write a Java program to find a missing number in an array. 
//Means e.g. array has 1 to n element in sequence
//(n can be 50 or 100) arr[] = [1, 2, 3, 4, 6, 7] So missing no is 5.
public class MissingNum {
	public static int a=1;
public static void missingNum(int n[]) {
	int p=0;
	for (int i=0; i<n.length; i++) {
		
		if(n[p]!=a) 
			{System.out.println("Missing number is " + a);
			p=p-1;
			}
		a++;
		p++;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,7,8,9};
		missingNum(arr);
	}

}
