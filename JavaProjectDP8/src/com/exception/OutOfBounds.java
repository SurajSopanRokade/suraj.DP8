package com.exception;
//2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
public class OutOfBounds {
	public void array(int n[]) {
		try {
			for (int i=0; i<=n.length; i++) {
				System.out.println(n[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutOfBounds o1 = new OutOfBounds();
		int arr []= {2,3,4,5,6};
		o1.array(arr);
		System.out.println("Main ends...");
	}

}
