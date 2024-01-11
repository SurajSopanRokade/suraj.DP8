package com.exception;

public class InvalidMarksException extends Exception{
	int m1, m2, m3, m4;
	InvalidMarksException(){
		
	}
	InvalidMarksException(int m1,int m2,int m3,int m4){
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	@Override
	public String toString() {
		return "InvalidMarksException [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
	
	

}
