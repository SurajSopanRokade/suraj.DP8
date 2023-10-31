package com.Equals;



public class Employee {
	private int id;
	private String name;
	private double salary;
	MyDate date;
	Employee() {
		id = 0;
		name = "";
		salary = 0;
	}

	Employee(int id, String name, double salary, MyDate d) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		date=d;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	public MyDate getDate() {
		return date;
	}

	public void setDate(MyDate date) {
		this.date = date;
	}

	public String toString() {
		return " Id " + id + "\n" + " Name " + name + "\n" + " Salary " + salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println(e1);

		Employee e2 = new Employee(1, "Suraj", 23000, new MyDate(12,3,2022));
		
		
	}

	

}
	