package com.ArrayOfObject;

//2.  WAP to print the employees from Employee[] array who has same joining date.
//    You have Employee class which has 4 attributes id, name, salary, date 
//    (date is another object which has 3 attributes day, month, year) 
//    and add employee objects to your array

public class Employee2 {
	private int id, salary;
	private String name;
	DateOfJoining2 date;
	Employee2()
	{
		id=0;
		salary=0;
		name="";
	}
	Employee2(int id, int salary, String name, DateOfJoining2 d )
	{
		this.id=id;
		this.salary=salary;
		this.name=name;
		date=d;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setDateOfJoining(DateOfJoining2 date)
	{
		this.date=date;
	}
	public int getId()
	{
		return id;
	}
	public int getsalary()
	{
		return salary;
	}
	public String getName()
	{
		return name;
	}
	public DateOfJoining2 getDate()
	{
		return date;
	}
	
	public String toString()
	{
		return " Id " +id + "\n" + " Salary " + salary + "\n" + " Name " + name +date ;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee2 e2[] = new Employee2[4];
		
		e2[0] = new Employee2(1, 23000, "Suraj", new DateOfJoining2(12,3,2022)); 
		e2[1] = new Employee2(2, 24000, "Su", new DateOfJoining2(11,3,2022));
		e2[2] = new Employee2(3, 25000, "raj", new DateOfJoining2(10,3,2022));
		e2[3] = new Employee2(4, 26000, "Sj", new DateOfJoining2(12,3,2022)); 
		
		for (int i=0; i<e2.length; i++)
		{
			for (int j=0; j<e2.length; j++)
			{
				if(  e2[i].date.compareDate(e2[j].date) && i!=j)
				{
				         System.out.println(e2[i]);
				             break;
				}
			}
		}
		
				
		
		
		
	}

}
