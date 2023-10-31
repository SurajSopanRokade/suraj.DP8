package com.Array;

public class AccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account [] Arr = new Account [3];
		Arr[0]= new Account("Suraj", 12000, 1234);
		Arr[1]= new Account("Abhi", 16000, 1284);
		Arr[2]= new Account("Snehal", 19000, 1934);
		
		for (int i=0; i<Arr.length; i++)
		{
			System.out.println(Arr[i]);
		}
	}

}
