package com.exception;
//6. WAP to show unchecked exception
//7. WAP to check can we have an empty catch block?
public class ShowUncheckedException {
	public void array(int n[]) {
		try {
			for (int i=0; i<=n.length; i++) {
				System.out.println(n[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			
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
