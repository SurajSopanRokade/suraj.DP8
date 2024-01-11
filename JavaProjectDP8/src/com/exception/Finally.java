package com.exception;
//5. WAP where only try and finally is used
public class Finally {
	public void array(int n[]) {
		for (int i=0 ;i<=n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finally f1 = new Finally();
		int arr[]= {2,3,4,5,6};
		try {
			f1.array(arr);
		}
		finally {
			System.out.println("I am in finally");
		}
		System.out.println("Main ends...");
	}

}
