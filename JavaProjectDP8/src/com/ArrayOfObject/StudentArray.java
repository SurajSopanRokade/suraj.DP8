package com.ArrayOfObject;
//5.	Create array of students, student has (roll, name, age, marks). Print only
//those students who have marks more than 60 and age is less than 15.
public class StudentArray {
	Student std [];
	StudentArray()
	{
		
	}
	StudentArray(Student t [])
	{
		std=t;
	}
	
	public void elements()
	{
		for (int i=0; i<std.length; i++)
		{
			if (std[i].getMarks()>60 && std[i].getAge()<15)
			System.out.println(std[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 [] = new Student [4];
		s1[0]= new Student(1, "Suraj", 25, 68);
		s1[1]= new Student(2, "Su", 14, 67);
		s1[2]= new Student(3, "raj", 12, 78);
		s1[3]= new Student(4, "Sj", 15, 88);
		
		StudentArray s2 = new StudentArray(s1);
		
		s2.elements();
			}

}
