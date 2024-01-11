package com.hashmapAssign;


import java.util.ArrayList;
import java.util.Iterator;

public class Student1 {
	int rollno;
	String name;
	ArrayList<Integer> marks;
	double percent;
	String grade;
	
	
	public Student1() {
		super();
	}
	

	public Student1(int rollno, String name, ArrayList<Integer> marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		this.percent=calculatePercent();
		this.grade=calculateGrade();
	}
	public double calculatePercent() {
		double sum=0;
		Iterator<Integer> i = marks.iterator();
		while(i.hasNext()) {
			sum=sum+i.next();
		}
		return percent = sum/5;
	}
	public String calculateGrade() {
		if (percent>90)
			return "A";
		else if (percent>80)
			return "B";
		else if (percent>70)
			return "C";
		else if (percent>60)
			return "D";
		return grade;
		
	
		
	}


	@Override
	public String toString() {
		return "Student1 [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", percent=" + percent
				+ ", grade=" + grade + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
