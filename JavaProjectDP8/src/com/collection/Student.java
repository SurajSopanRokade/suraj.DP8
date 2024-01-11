package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student>{
	int rollno;
	String name;
	ArrayList<Integer> marks;
	double percentage;
	String grade;
	Student(){
		rollno=0;
		name="";
		
	}
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + ", percentage=" + percentage
				+ ", grade=" + grade + "]";
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<Integer> getMarks() {
		return marks;
	}


	public void setMarks(ArrayList<Integer> marks) {
		this.marks = marks;
	}


	public double getPercentage() {
		return percentage;
	}


	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	public Student(int rollno, String name, ArrayList<Integer> marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
		calculatePercentage();
		grade();
	}
	public void calculatePercentage() {
		int sum=0;
		for (int m:marks) {
			sum=sum+m;
		}
		percentage=(double)sum/5;
	}
	public void grade() {
		if(percentage>90)
			this.grade="A+";
		else if(percentage>80)
			this.grade="B";
		if(percentage>70)
			this.grade="C";
		if(percentage>60)
			this.grade="D";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<>();
		ArrayList<Integer> l1 = new ArrayList<Integer>(Arrays.asList(67,78,89,87,76));
		list.add(new Student(3,"Suraj", l1));
		ArrayList<Integer> l2 = new ArrayList<Integer>(Arrays.asList(78,89,89,90,46));
		list.add(new Student(1,"Augf", l2));
		ArrayList<Integer> l3 = new ArrayList<Integer>(Arrays.asList(97,98,89,77,86));
		list.add(new Student(2,"Dhaj", l3));
		ArrayList<Integer> l4 = new ArrayList<Integer>(Arrays.asList(89,78,59,37,76));
		list.add(new Student(4,"Cra", l4));
		
		Iterator<Student> p =  list.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		System.out.println("***********************************************");
		Collections.sort(list);
		p =  list.iterator();
		while(p.hasNext()) {
			System.out.println(p.next());
		}
		System.out.println("***********************************************");
		Collections.sort(list);
		int count=0;
		p =  list.iterator();
		while(p.hasNext()) {
			if (p.next().percentage>90)
				count++;
			//System.out.println(p.next());
		}
		System.out.println(count);
	}


	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
//		int res=this.name.compareTo(o.name);
//		return res;
		if (this.percentage==o.percentage)
			return 0;
		else if (this.percentage>o.percentage)
			return 1;
		else  
			return -1;
//		if (this.rollno==o.rollno)
//			return 0;
//		else if (this.rollno>o.rollno)
//			return 1;
//		else  
//			return -1;
//		int res1=this.grade.compareTo(grade);
//		System.out.println(res1);
//		return res1;
	}

}
