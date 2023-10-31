package com.ArrayOfObjAssign;
//1.	WAP to print the employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
//Accept id from user and show all emp who get same sal has given id
public class Employee1 {
	private int emp_id, salary;
	private String emp_name;
	
	Employee1(){
		emp_id=0;
		salary=0;
		emp_name="";
		
	}
	Employee1(int id, int salary, String name){
		emp_id=id;
		this.salary=salary;
		emp_name=name;
		
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
	
	public String toString()
	{
		return " Employee id " + emp_id + "\n" + " Employee salary " + salary + "\n" + " Employee name " + emp_name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 [] = new Employee1 [4];
		e1[0]= new Employee1(1, 23000, "Suraj");
		e1[1]= new Employee1(2, 23000, "Su");
		e1[2]= new Employee1(3, 23000, "raj");
		e1[3]= new Employee1(4, 53000, "Sj");
		
		
		for (int i=0; i<e1.length; i++)
		{
			for (int j=0; j<e1.length; j++)
			{
				if (e1[i].salary==e1[j].salary&&i!=j)
				{System.out.println(" Same salary employee " + e1[i]);
				break;}
			}
		}
		
	}

}
	