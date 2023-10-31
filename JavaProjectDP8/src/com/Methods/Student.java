package com.Methods;
//1.
//add method displayData inside Student class change
//values of id name in that method & also print the changed
//values in same method. Call displayData method from
//main method and see the output. Observe displayData can
//only be called by creating object of Student

//2.
//Create getId() method in Student class. call getId() method
//from displayData method so that you know that one
//method can be called from another method. Return id
//from getId() method and set that id to the instance
//variable in displayData method
public class Student {
	private int id =2;
	private String name = "Suraj" ;
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public void displayData()
	{
		System.out.println("id = " + id);
		System.out.println("name = " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		s1.setId(4);
		s1.getId();
		s1.displayData();
	}

}
