package com.ArrayOfObject;
//5.	Create array of students, student has (roll, name, age, marks). Print only
//those students who have marks more than 60 and age is less than 15.

public class Student {
	private int roll;
	private String name;
	private int age;
	private int marks;
	
	Student()
	{
		roll=0;
		name="";
		age=0; 
		marks=0;
	}
	Student(int roll, String name, int age, int marks)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.marks=marks;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setName(String name )
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getRoll()
	{
		return roll;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public int getMarks()
	{
		return marks;
	}
	public String toString()
	{
		return " Roll number " + roll +"\n"+ " Name " +name+"\n"+ " Age " + age +"\n"+ " Marks " + marks;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		System.out.println(s1);
		System.out.println("_____________________________________________");
		Student s2 = new Student(1, "suraj", 25, 68);
		System.out.println(s2);
		
	}

}
