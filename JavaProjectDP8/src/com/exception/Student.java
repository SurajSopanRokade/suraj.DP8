package com.exception;

public class Student {
	int m1, m2, m3, m4;
	Student(){
		
	}
	Student(int m1, int m2, int m3, int m4) throws InvalidMarksException{
		if (m1<0||m1>100||m2<0||m2>100||m3<0||m3>100||m4<0||m4>100) {
			throw new InvalidMarksException(m1,m2,m3,m4);
		}
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.m4=m4;
	}
	
	@Override
	public String toString() {
		return "Student [m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + ", m4=" + m4 + "]";
	}
	public static void main(String[] args) throws InvalidMarksException {
		// TODO Auto-generated method stub
		
		try {
			Student s1 = new Student(56,34,3, 12);
			System.out.println(s1);
		}
		catch(InvalidMarksException e) {
			System.out.println(e);
		}
		
	}

}
