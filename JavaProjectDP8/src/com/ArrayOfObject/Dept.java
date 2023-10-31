package com.ArrayOfObject;



//3.	Create class Dept(did, dname), class MyDate(day, month, year)
//a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
//Create array of Employee and display the array elements.
//4.	Same as above but print Employees whose dept_name is same.
public class Dept {
	private int id;
	private String Dname;
	Employee3 emp[];
	MyDate date;
	Dept()
	{
		id=0;
		Dname="";
	}
	Dept(int id, String name, Employee3 E[], MyDate d )
	{   
		this.Dname=name;
		this.id=id;
		emp=E;
		date=d;
		
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.Dname=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return Dname;
	}
	public String toString()
	{
		return " Department id " + id +"\n"+ " Depart name " + Dname +"\n"+ " Date of joining is " + date ;
	}
	public void Element()
	{
		for (int i=0; i<emp.length; i++)
		{
			System.out.println(emp[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d1 = new Dept();
		System.out.println(d1);
		System.out.println("___________________________________");
		Employee3 emp[] = new Employee3 [4];
		emp[0]= new Employee3(1, "Suraj", 23000);
		emp[1]= new Employee3(2, "Su", 24000);
		emp[2]= new Employee3(3, "raj", 24000);
		emp[3]= new Employee3(4, "Sj", 26000);
		
		MyDate d3 = new MyDate(12,4,2022);
		Dept d2 = new Dept(1, "Science", emp, d3 );
		System.out.println(d2);
		d2.Element();
	}

}
