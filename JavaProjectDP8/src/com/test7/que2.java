package com.test7;
//Q5.Print pattern :	
//0  1  2  3   
//4  5  6     
//7  8      
//9

public class que2 {
	public void pattern(int n) {
		int a=0;
//		for (int i=n-1; i>=0; i--) {
//			for (int j=n; j>=n-i; j--) {
//				System.out.print(a++);
//				
//			}
//			System.out.println();
//		}
		for (int i=0; i<n; i++) {
			for (int j=0; j<n-i; j++) {
				System.out.print((a)+" ");
				a++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		que2 q = new que2();
		q.pattern(4);
	}

}
