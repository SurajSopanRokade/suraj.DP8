package com.ArrayOfObject;

public class Employee4Array {
	Employee4 emp[];
	
	Employee4Array()
	{
		
	}
	Employee4Array(Employee4 m[])
	{
		emp=m;
	}
	public void elements()
	{
		for (int i=0; i<emp.length; i++)
		{
			System.out.println(emp[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee4 e1 [] = new Employee4[5];
		e1[0]= new Employee4(1, "Suraj");
		e1[1]= new Employee4(2, "Su");
		e1[2]= new Employee4(3, "raj");
		e1[3]= new Employee4(4, "Sj");
		e1[4]= new Employee4(5, "Suj");
		
		Employee4Array e2 = new Employee4Array(e1);
		e2.elements();
		
	}

}
