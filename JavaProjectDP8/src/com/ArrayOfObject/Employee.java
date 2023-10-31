package com.ArrayOfObject;

//1.	WAP to print the employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
////Accept id from user and show all emp who get same sal has given id


public class Employee {
	 int id ;
	 String name;
	 int salary ;
	Employee()
	{
		id=0;
		name="";
		salary=0;
		
	}
	Employee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String toString()
	{
		return " ID " + id + "\n" + " Name " + name + "\n" + " Salary " + salary;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp = new Employee(1, "Suraj", 23000);
		System.out.println(emp);
		
	}

}
