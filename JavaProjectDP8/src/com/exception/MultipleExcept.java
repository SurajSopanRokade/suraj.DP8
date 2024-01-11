package com.exception;
//3. WAP to catch multiple exceptions. 
//i.e ArrayIndexOutOfBoundsException and ArithmeticException
//4. WAP to show checked exception and use multiple catch 
//block with universal Exception handler.
public class MultipleExcept {
	public void array(int n[]) {
		int a=10/0;
		for (int i=0; i<=n.length; i++) 
			System.out.println(n[i]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleExcept m1 = new MultipleExcept();
		int arr[]= {2,4,5,3,2};
		try {
		m1.array(arr);
		}
//		catch(ArrayIndexOutOfBoundsException | ArithmeticException e) {
//			System.out.println(e);
//		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(Exception e2) {
			System.out.println(e2);
		}
		System.out.println("Main ends...");
		
	}

}
