package com.exception;
//8. WAP to show the scenario in which IndexOutBound Exception (Both ArrayInexOutOfBound and 
//StringIndexOutOfBound) exception is generated and handle this exception.
public class StringIndexOutOfBounds {
	public static void array() {
		String str ="abcde";
		System.out.println(str.charAt(5));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			array();
		}catch(StringIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}

}
