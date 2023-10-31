package com.ops;
import java.util.Scanner;
public class StudentDifferObj {
	int sid;
	String name;
	public void setData(int id, String n)
	{
		sid=id;
		name=n;
	}
	public void display()
	{
		System.out.println("Student id = "   + sid);
		System.out.println("Student name = "   + name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=2; i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id of Student");
		int id=sc.nextInt();
		System.out.println("Enter name of Student");
		String name=sc.next();
		StudentDifferObj obji = new StudentDifferObj();
		obji.setData(id, name);
		obji.display();
		
		}
	}

}
