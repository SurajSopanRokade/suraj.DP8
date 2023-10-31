package com.ArrayOfObjAssign;
//3.	Create class Dept(did, dname), class MyDate(day, month, year)
//a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
//Create array of Employee and display the array elements.
//4.	Same as above but print Employees whose dept_name is same.
public class Employee {
	private int emp_id, salary;
	private String emp_name;
	MyDate date;
	Dept dep;
	Employee(){
		emp_id=0;
		salary=0;
		emp_name="";
		
	}
	Employee(int id, int salary, String name, MyDate d, Dept t){
		emp_id=id;
		this.salary=salary;
		emp_name=name;
		date=d;
		dep=t;
	}
	public void setEmp_id(int emp_id)
	{
		this.emp_id=emp_id;
	}
	public void setEmp_salary(int salary)
	{
		this.salary=salary;
	}
	public void setEmp_name(String emp_name)
	{
		this.emp_name=emp_name;
	}
	public void setDate(MyDate date)
	{
		this.date=date;
	}
	public void setDept(Dept dep)
	{
		this.dep=dep;
	}
	public int getEmp_id()
	{
		return emp_id;
	}
	public int getEmp_salary()
	{
		return salary;
	}
	public String getEmp_name()
	{
		return emp_name;
	}
	public MyDate getDate()
	{
		return date;
	}
	public Dept getDept()
	{
		return dep;
	}
	public String toString()
	{
		return " Employee id " + emp_id + "\n" + " Employee salary " + salary + "\n" + " Employee name " + emp_name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 [] = new Employee [4];
		e1[0]= new Employee(1, 23000, "Suraj", new MyDate(12,3,2022), new Dept(1,"Science"));
		e1[1]= new Employee(2, 33000, "Su", new MyDate(13,3,2023), new Dept(2,"Maths"));
		e1[2]= new Employee(3, 43000, "raj", new MyDate(14,4,2024), new Dept(3,"Science"));
		e1[3]= new Employee(4, 53000, "Sj", new MyDate(15,4,2025), new Dept(4, "Science"));
		
		for (int i=0; i<e1.length; i++)
		{
			for (int j=0; j<e1.length; j++)
			{
				if (e1[i].dep.checkDept(e1[j].dep)&&i!=j)
				{System.out.println(" Same department " + e1[i]);
				 break;
				}
			}
		}
	}

}
