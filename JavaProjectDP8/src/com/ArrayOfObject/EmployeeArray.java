package com.ArrayOfObject;
//1.	WAP to print the employees from Employee[] array who has same salary 
//(Create Employee class which has 3 attributes id, name, salary and add employee objects to your array)
////Accept id from user and show all emp who get same sal has given id
import java.util.Scanner;
public class EmployeeArray {
	Employee[] temp;
	EmployeeArray(Employee[] temp)
	
	{
		this.temp=temp;
	}
	public void elements()
	{    
	   for (int i=0; i<temp.length; i++)
	   {
		   for (int j=0; j<temp.length; j++)
		   {
			   if (j!=i)
			   {
				   if (temp[i].salary==temp[j].salary)
				   {
					   System.out.println(" Same salary emp "+temp[i]);
					  break;
				   }
			   }
			  
		   }
	   }
	
	  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employee arr[] = new Employee[4];
//		for (int i=0; i<=arr.length-1; i++) {
//			System.out.println("Enter id");
//			int id = sc.nextInt();
//		
//		}
		arr[0]= new Employee(1, "Suraj", 22000);
		arr[1]= new Employee(2, "Su", 22000);
		arr[2]= new Employee(3, "raj", 27000);
		arr[3]= new Employee(4, "Sj", 22000);
		EmployeeArray e1 = new EmployeeArray(arr);
		e1.elements();
		for (int i=0; i<arr.length; i++)
		  {Scanner sc = new Scanner (System.in);
			  int id;
			  Employee obj = null;
			  id=sc.nextInt();
			if (id == arr[i].id)
			{
				obj=arr[i];
				break;
			}
		
		
		for (int j=0; j<arr.length; j++)
		{
			if(obj.salary==arr[j].salary)
			{
				System.out.println(arr[j]);
			}
		}
		
	}
	}
}
