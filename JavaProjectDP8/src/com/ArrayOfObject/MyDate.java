package com.ArrayOfObject;
//3.	Create class Dept(did, dname), class MyDate(day, month, year)
//a.	Class Employee(emp_id, emp_name, salary, date(object), dept(object)).
//Create array of Employee and display the array elements.
//4.	Same as above but print Employees whose dept_name is same.
public class MyDate {
	private int dd, mm, yy;
	
	MyDate()
	{
		dd=0;
		mm=0;
		yy=0;
	}
	MyDate(int dd, int mm, int yy )
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	public void setDd(int dd)
	{
		this.dd=dd;
	}
	public void setMm(int mm)
	{
		this.mm=mm;
	}
	public void setYy(int yy)
	{
		this.yy=yy;
	}
	public int getDd()
	{
		return dd;
	}
	public int getMm()
	{
		return mm;
	}
	public int getYy()
	{
		return yy;
	}
	public String toString()
	{
		return dd+"/"+mm+"/"+yy;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d1 = new MyDate();
		System.out.println(d1);
		
		
		
//		Employee3 emp[] = new Employee3 [4];
//		emp[0]= new Employee3(1, "Suraj", 23000);
//		emp[1]= new Employee3(2, "Su", 24000);
//		emp[2]= new Employee3(3, "raj", 24000);
//		emp[3]= new Employee3(4, "Sj", 26000);
		
		
	}

}
