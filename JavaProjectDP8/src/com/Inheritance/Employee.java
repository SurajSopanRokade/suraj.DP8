package com.Inheritance;

public class Employee {
	int id;
	double salary;
	String name;
	MyDate doj;
	
	Employee(){
		id=0;
		salary=0;
		name="";
	}
	Employee(int id, double salary, String name, MyDate d ){
		this.id=id;
		this.salary=salary;
		this.name=name;
		this.doj=d;
	
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public MyDate getDoj() {
		return doj;
	}
	public void setDoj(MyDate doj) {
		this.doj = doj;
	}
	public double calculateSalary() {
		return salary;
	}
	public String toString() {
		return " id " + id +"\n"+ " salary " + salary +"\n"+ " Date of joining " + doj;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee(1, 23000,"Suraj", new MyDate (12,3,2023));
		System.out.println(e1);
		
		Employee[] a=new Employee[4];
		a[0]=new Employee(07,35000,"babya",new MyDate(24,10,2023));
		a[1]=new WageEmp();
		
		
	}

}
