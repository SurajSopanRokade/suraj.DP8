package com.constructor;
//4. Create Employee class which has attributes (id, name, salary, dept,
//mydate). Where dept and mydate is class, dept has (dept_id, dept_name)
//And mydate has (day, month, year).
//Display Employee information.
//Note. Containment using constructor and getter/setter

public class Employee {
	private int id;
	private String name; 
	private double salary;
	
	
	Employee()
	{
		id=0;
		name="";
		salary=0;
	}
	Employee(int id, String name, double salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
		public void setId(int id)
		{
			this.id=id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setSalary(double salary)
		{
			this.salary=salary;
		}
		public int getId()
		{
			return id;
		}
		public String getName()
		{
			return name;
		}
		public double getSalary()
		{
			return salary;
		}
		public String toString()
		{
			return " Id " + id + " Name " + name + " Salary " + salary;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		System.out.println(e1);
		
		Employee e2 = new Employee(1, "Suraj", 45000);
		System.out.println(e2);
	}

}
